package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberDAOImpl;

public class MemDeleteController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = new MemberDAOImpl();
		
		int num = Integer.parseInt(request.getParameter("num"));
		int cnt = dao.memberDelete(num);
		
		String cpath = request.getContextPath();
		String nextPage = null;
		if (cnt > 0) {
			nextPage = "redirect:"+cpath+"/list.do";
		} else {
			throw new ServletException("error");
		}
		
		return nextPage;
	}

}
