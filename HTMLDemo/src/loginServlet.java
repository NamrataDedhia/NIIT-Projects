

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	response.setContentType("text/html");

	String param1 = request.getParameter("username");

    String param2 = request.getParameter("password");



    if(param1 == null || param2 == null) {

        

    } else if ("".equals(param1) || "".equals(param2)) {

     

    } else {

        System.out.println("Username?= " + param1 + ", Password?= " + param2);



        // Print The Response

        PrintWriter out = response.getWriter();

        out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");



        // Authentication Logic & Building The Html Response Code

        if((param1.equalsIgnoreCase("jcg")) && (param2.equals("admin@123"))) {              

            out.write("<h2>Servlet Application Login Example</h2>");

            out.write("<p style='color: green; font-size: large;'>Congratulations! <span style='text-transform: capitalize;'>" + param1 + "</span>, You are an authorised login!</p>");             

        } else {

            out.write("<p style='color: red; font-size: larger;'>You are not an authorised user! Please check with administrator!</p>");                

        }

        out.write("</div></body></html>");

        out.close();

    }

}


}
