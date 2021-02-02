package kr.smhrd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberDAOImpl;
import kr.smhrd.model.MemberVO;

//POJO Controller 
public class MemListController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// list.do
		// 1. Model 연동
		MemberDAO dao = new MemberDAOImpl();
		List<MemberVO> list = dao.memberList();
		// 2. 객체바인딩
		request.setAttribute("list", list); //객체바인딩 (request)
		// 3. FrontController에게 다음 페이지는 어떤 페이지인지 페이지 정보를 리턴
		//"WEB-INF/member/list.jsp";
		String nextPage = "list";
		return nextPage;
	}
	
}
