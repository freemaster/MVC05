package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberDAOImpl;
import kr.smhrd.model.MemberVO;

public class MemUpdateController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		MemberDAO dao = new MemberDAOImpl();
		
		int num = Integer.parseInt(request.getParameter("num"));
		int mage = Integer.parseInt(request.getParameter("mage"));
		String memail = request.getParameter("memail");
		String mtel = request.getParameter("mtel");
		MemberVO vo = new MemberVO();
		vo.setNum(num);
		vo.setMage(mage);
		vo.setMemail(memail);
		vo.setMtel(mtel);
		int cnt = dao.memberUpdate(vo);
		
		String nextPage = null;
		String cpath = request.getContextPath();
		if(cnt > 0) { //성공 -> 목록으로 : 서블릿 요청(memberList.do)
			nextPage = "redirect:"+cpath+"/list.do";
		} else { //실패
			throw new ServletException("error");
		}
		return nextPage;
	}

}
