import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidExample")
public class ValidExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Map<String,String> map = new HashMap<>();
	
	@Override
	public void init() throws ServletException {
	  super.init();
	  map.put("Besiktas", "Turkiye");   // names associated with organizations
	  map.put("Barcelona", "Spain");
	  map.put("Chelsea", "England");
	  map.put("Lille", "France");
	}
	
	protected void serviceConnection(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setHeader("Cache-Control", "no-cache");
		Writer out = response.getWriter();
		String name = request.getParameter("name");
		String country = map.get(name);
		out.write(country != null ?  country : "");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		serviceConnection(request,response);
	}

}
