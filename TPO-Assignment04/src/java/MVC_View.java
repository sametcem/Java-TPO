import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(name = "TPO_04_view", urlPatterns = "/addValues/view", initParams = {
        @WebInitParam(name = "formFile", value = "addParamsForm.html"),
        @WebInitParam(name = "missingParamError", value = "missingParamError.html"),
        @WebInitParam(name = "nanParamError", value = "nanParamError.html")
})
public class MVC_View extends HttpServlet {

    private static final String MODEL = "model";
    private static final String FORM_FILE = "formFile";

    private static final String HTML_PREFIX = "<html>\n<head><title>TPO_04</title></head>\n<body>";
    private static final String HTML_ENDING = "</body>\n</html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        operateRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        operateRequest(req, resp);
    }

    private void operateRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        MVC_Model model = (MVC_Model) req.getAttribute(MODEL);
        PrintWriter writer = resp.getWriter();

        writer.write(HTML_PREFIX);
        String formFileName = getInitParameter(FORM_FILE);
        printFile(writer, formFileName);
        writer.print("<hr>");

        if (model.getRespType() == ResponseType.OK) {
            writer.write("<h1>RESULT = ");
            writer.write(model.getResult().toString());
            writer.write("</h1>");
        } else {
            String errorFileName = getInitParameter(model.getRespType().name);
            printFile(writer, errorFileName);
        }
        writer.print(HTML_ENDING);
        writer.close();
    }

    private void printFile(PrintWriter writer, String fileName) throws IOException {
        ServletContext context = getServletContext();
        try (InputStream in = context.getResourceAsStream("/htmlFiles/" + fileName)) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                for (String line; (line = br.readLine()) != null; ) {
                    writer.println(line);
                }
            }
        }
    }
}