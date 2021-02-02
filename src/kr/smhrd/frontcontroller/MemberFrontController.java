package kr.smhrd.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.controller.Controller;

@WebServlet("*.do")
public class MemberFrontController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqUrl = request.getRequestURI();
		//System.out.println(reqUrl); //전체 url
		String cpath = request.getContextPath();
		//System.out.println(cpath); //루트디렉토리
		String command = reqUrl.substring(cpath.length());
		//System.out.println(command);
		
		Controller controller = null;
		String nextPage = null;
		// HandlerMapping *******
		HandlerMapping mapping = new HandlerMapping();
		controller = mapping.getController(command);
		/*
		if(command.equals("/list.do")) {
			controller = new MemListController();
		} else if(command.equals("/insertForm.do")) {
			controller = new MemInsertFormController();
		} else if(command.equals("/insert.do")) {
			controller = new MemInsertController();
		} else if(command.equals("/delete.do")) {
			controller = new MemDeleteController();
		} else if(command.equals("/content.do")) {
			controller = new MemContentColtroller();
		} else if(command.equals("/update.do")) {
			controller = new MemUpdateController();
		}
		*/
		// HandlerMapping *******
		
		if(controller != null) {
			nextPage = controller.requestHandler(request, response);
		
			if(nextPage != null) {
				if(nextPage.indexOf("redirect:") != -1) {
					//response.sendRedirect(nextPage.split(":")[1]);
					String[] re = nextPage.split(":");
					response.sendRedirect(re[1]);
				} else {
					String url1 = "WEB-INF/member/";
					String url2 = ".jsp";
					RequestDispatcher rd = request.getRequestDispatcher(url1+nextPage+url2); // 요청을 의뢰할 객체를 적는다.
				    rd.forward(request, response); // -------------------------▲ 서버에서 이루어 지는 포워딩 기술
				}
			}
		}
		
	}
}
