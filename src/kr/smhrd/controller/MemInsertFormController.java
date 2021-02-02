package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemInsertFormController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//"WEB-INF/member/insertForm.jsp";
		String nextPage = "insertForm";
		return nextPage;
	}
	
}
