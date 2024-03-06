package exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("당신이 입력한 정보입니다.<br>");
		out.println("아이디 : ");
		out.println(id);
		out.println("<br> 비밀번호 : ");
		out.println(pwd);	
		//자바스크립트로 이전 페이지로 이동하는 링크 생성
		out.print("<br><a href='javascript:history.go(-1)'>다시</a>");
								//공식같은거.../ -1 = 이전페이지로 돌아가라는 명령		
		out.print("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
