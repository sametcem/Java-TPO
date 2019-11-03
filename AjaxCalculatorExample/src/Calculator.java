
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "/Calculator", urlPatterns="/calculate")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processOperation(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processOperation(request, response);
	}
	
	void processOperation(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 String inputA = request.getParameter("a").replaceAll("[,]", ".");
	     String inputB = request.getParameter("b").replaceAll("[,]",".");
	     
	     Pattern pattern = Pattern.compile("((\\d+)|(\\d+\\.\\d+))");
	     Matcher matcherA = pattern.matcher(inputA);
	     Matcher matcherB = pattern.matcher(inputB);
	     
	     if ( matcherA.matches() && matcherB.matches() )
	            response.getWriter().write("<div style=\"color:blue\"> Result: A + B = </div></br><b>"
	                    +(Double.parseDouble(inputA)+Double.parseDouble(inputB))
	                                                                    +"</b>");
	     else
	            response.getWriter().write("<div style=\"color:red\"> ERROR,INVALID INPUT! Check your inputs! </div>");
	}

}
