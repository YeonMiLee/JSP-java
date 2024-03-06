package quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String identitynumber = request.getParameter("identitynumber");
		String identitynumber2 = request.getParameter("identitynumber2");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String postalcode = request.getParameter("postalcode");
		String add = request.getParameter("add");
		String add1 = request.getParameter("add1");
		String phone = request.getParameter("phone");
		String job = request.getParameter("job");
		String items[] = request.getParameterValues("item");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("이름 : " + username + "<br>");
		out.println("주민번호 : " + identitynumber + " - " + identitynumber2 + "<br>");
		out.println("아이디 : " + id + "<br>");
		out.println("비밀번호 : " + pwd + "<br>");
		out.println("이메일 : " + email + "<br>");
	 // String email = request.getParameter("email");
	 // if (request.getParameter("email").trim()=="") {
	 //		email += "@" + 	request.getParameter("mailaddr");
	 // 	} else {
	 //				request.getParameter("email").trim()=="");
	 // 	}
	 // **trim : 공백제외 원본문자열을 (select 창에서 선택한 이메일 주소를) out.print창에서 출력
		out.println("우편번호 : " + postalcode + "<br>");
		out.println("주소 : " + add + add1 + "<br>");
		out.println("핸드폰번호 : " + phone + "<br>");
		out.println("직업 : " + job + "<br>");
		out.println("관심분야 : ");
		if(items == null) {
			out.println("선택된 항목이 없습니다.");
		} else {
			for (int i=0; i<items.length; i++) {
				out.print(items[i] + " ");
			}
		}
		out.print("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}













