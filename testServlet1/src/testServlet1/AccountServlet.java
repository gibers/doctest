package testServlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/account")
public class AccountServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try (PrintWriter out = response.getWriter()) {
	        out.println("<html><head>");
	        out.println("<title>MyServlet</title>");
	        out.println("</head><body>");
	        out.println("<h1>My First Servlet bob2 </h1>");
	        out.println("</body></html>");
	    } catch (IOException e) {
			e.printStackTrace();
		} finally {
	    }
	}

}
