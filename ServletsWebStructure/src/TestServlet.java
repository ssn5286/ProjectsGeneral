

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pWriter = response.getWriter();
		pWriter.append("Served at: ").append(request.getContextPath());
		pWriter.println("<br>");
		pWriter.append("Authentication ").append(request.getAuthType());
		pWriter.append("Character Encoding ").append(request.getCharacterEncoding());
		pWriter.append("Context Type ").append(request.getContentType());
		pWriter.append("Remote Address ").append(request.getRemoteAddr());
		pWriter.append("Remote Host ").append(request.getRemoteHost());
		pWriter.append("Remote Host ").append(request.getServerName());
		String name = (String) request.getAttribute("name");
		pWriter.append("You name is ").append(name);

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
