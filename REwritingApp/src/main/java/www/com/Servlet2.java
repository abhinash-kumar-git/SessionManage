package www.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends Servlet1 {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see Servlet1#Servlet1()
     */
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException {

	
	response.setContentType("text/html;charset-8");
	try(PrintWriter out=response.getWriter()){
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>servlet page</title>");
		out.println("</head>");
		out.println("<body>"+"<a href='Second.jsp'>second servlet</a>");
		out.println("<h1>servlet srvlrt1 at"+request.getContextPath()+"</h1>");
		String name=request.getParameter("username");
		out.println(name);
		out.println();
		out.println("</body>");
		out.println("</html>");
		
	}catch(Exception e) {
		
	}
	}
	
	
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
