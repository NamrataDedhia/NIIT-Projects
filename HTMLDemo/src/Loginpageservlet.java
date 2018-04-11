

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loginpageservlet")
public class Loginpageservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un=request.getParameter("un");
		String pass=request.getParameter("pass");
		
		if(un.equals("pooja")&&pass.equals("niit"))
				{
		response.sendRedirect("welcome.jsp");
				}
		
	}



	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String un=req.getParameter("un");
		String pass=req.getParameter("pass");
		
		if(un.equals("pooja")&&pass.equals("niit"))
				{
		resp.sendRedirect("welcome.jsp");
				}
		*/
	}
	

	

