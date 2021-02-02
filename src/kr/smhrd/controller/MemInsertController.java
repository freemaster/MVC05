package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberDAOImpl;
import kr.smhrd.model.MemberVO;

public class MemInsertController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 1. 클라이언트에서 넘어온 폼파라메트 가져오기
		MemberDAO dao = new MemberDAOImpl();
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String mname = request.getParameter("mname");
		int mage = Integer.parseInt(request.getParameter("mage"));
		String memail = request.getParameter("memail");
		String mtel = request.getParameter("mtel");
		MemberVO vo = new MemberVO(id, pass, mname, mage, memail, mtel);
		int cnt = dao.memberInsert(vo);

		//저장성공 후 리스트페이지로...
		String nextPage = null;
		String cpath = request.getContextPath();
		if(cnt>0) {
			nextPage = "redirect:"+cpath+"/list.do";
		} else {
			throw new ServletException("error");
		}
		return nextPage;
	}

}
