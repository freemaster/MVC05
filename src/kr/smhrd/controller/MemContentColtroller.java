package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberDAOImpl;
import kr.smhrd.model.MemberVO;

public class MemContentColtroller implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = new MemberDAOImpl();
		
		int num = Integer.parseInt(request.getParameter("num"));
		MemberVO vo = dao.memberContent(num);
		
		request.setAttribute("vo", vo); //객체바인딩 (request)
		//"WEB-INF/member/content.jsp";
		String nextPage = "content";
		
		return nextPage;
	}

}
