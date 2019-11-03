import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validator")
public class Validator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Map<String,String> map = new HashMap<>();
	
	@Override
	public void init() throws ServletException {
	  super.init();
	  map.put("Bloch", "Google");   // names associated with organizations
	  map.put("Gafter", "SUN");
	  map.put("Gates", "Microsoft");
	  map.put("Jobs", "Apple");
	}
	
	private void serviceConnection(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setHeader("Cache-Control", "no-cache");
		Writer out = response.getWriter();
		String name = request.getParameter("name"); // Getting name
		String org = map.get(name);
		out.write(org != null ?  org : ""); // return organization or empty string if I don't know the name
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		serviceConnection(request,response);
	}
	
}
