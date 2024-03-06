package exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberTestServlet
 */
@WebServlet("/Member")
public class MemberTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberTestServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    String str;		//member
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int number = 0;
		str = req.getParameter("msg");	//local
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>MultiThread</title></head>");
		out.println("<body><h2>처리 결과(멤버변수)</h2>");
		while(number++<10) {
			out.print(str + " : " + number + "<br>");
			out.flush();
			System.out.println(str + " : " + number);	//console박스에 실행
			try {
				Thread.sleep(1000);				//1000ms = 1s
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		out.println("<h2>Done " + str + " !!</h2>");
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
