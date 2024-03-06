package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//testServlet을 생성하라  <h1>좋은 하루 </h1> <h3>화이팅~^^</h3>
//test 폴더 위에서 오른쪽마우스 - servlet - class이름 입력후 - url mapping 설정(선택사항) - 체크박스 필요한거 체크 후 finish 하면 자동생성됨 (현재는 doGet,doPost만 사용)


/**
 * Servlet implementation class testServlet
 */
@WebServlet("/testServlet")
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
//		response.getWriter().append("Served at: ").append(request.getContextPath()); 		
		
		
		/*******************************새로 입력한부분*****************************************************/
		
		//콘솔창에 뜨는 문구 
		System.out.println("테슷트서블렛");  
		//한글이 오류나지 않게 하기 위한 코드 ;(세미콜론 )기준으로 앞은 문서타입, 뒤는 언어정보
		response.setContentType("text/html;charset=UTF-8");
		//웹 페이지에 뜨는 문구
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Test</title></head>");
		out.print("<body><h1> 좋은하루 </h1><h2>화이팅~!</h2></body>");
		out.print("</html>");
		out.close();
		
		/*********************************************************************************************/
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}