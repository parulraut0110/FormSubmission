import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;
    
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * response.setContentType("text/html"); PrintWriter writer =
		 * response.getWriter(); writer.print("<!doctype html><\n>");
		 * writer.print("<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n" +
		 * "<title>Login Credentails</title>\r\n" + "</head>\r\n" + "<body>\r\n" +
		 * "<p>The username is " + request.getParameter("username")+ "</p><br/>" +
		 * "<p>The password is " + request.getParameter("password") + "</p><br>" +
		 * "<body>\r\n" + "</html>\r\n" ); writer.flush();
		 */
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<!doctype html><\n>");
		writer.print("<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Login Credentails</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<p>The username is " + request.getParameter("username")+ "</p><br/>"
				+ "<p>The password is " + request.getParameter("password") + "</p><br>"
				+ "<body>\r\n"
				+ "</html>\r\n"
				);
		writer.flush();
	}

}
