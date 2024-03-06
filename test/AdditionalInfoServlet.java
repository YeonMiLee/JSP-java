package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionalInfoServlet
 */
@WebServlet("/AddInfo/*")
public class AdditionalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdditionalInfoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text.html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>추가적인 요청 정보</h3>");
		out.print("Request Method : " + req.getMethod() + "<br/>");
		out.print("Path Info : " + req.getPathInfo() + "<br/>");
		out.print("Path Translated : " + req.getPathTranslated() + "<br/>");
		out.print("Query String : " + req.getQueryString() + "<br/>");
		out.print("Content Length : " + req.getContentLength() + "<br/>");
		out.print("Content Type : " + req.getContentType() + "<br/>");
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
