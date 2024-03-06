package exercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class checkboxServlet
 */
@WebServlet("/checkboxServlet")
public class checkboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkboxServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String items[] = request.getParameterValues("item");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		if(items == null) {
			out.println("선택한 항목이 없습니다.");
		} else {
			out.println("당신이 선택한 항목입니다.<br>");
			out.println("<hr>");
			//	(String item : items) {
			//		out.print(item + " ");	
			
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
