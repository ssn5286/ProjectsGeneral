

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class TestGenericServlet
 */
@WebServlet("/TestGenericServlet")
public class TestGenericServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TestGenericServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getServletContext().getContextPath());
		System.out.println(request.getServletContext());
	}
	
	public void init() throws ServletException{
		System.out.println("Servlet initialized ");
		
	}
@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroyed	");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		String dbUser =config.getInitParameter("dbUser");
		System.out.println("Servlet initialized from overload " + dbUser);
	}

}
