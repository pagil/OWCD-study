package owcd;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet(description = "Servlet which implements both doPost and do Get", urlPatterns = { "/MainServlet" })
public class MainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Processing request in doGet");
        for (String key: request.getParameterMap().keySet()){
            System.out.println(key + " = " + request.getParameter(key));
        }
        for (Enumeration<String> e = request.getAttributeNames();e.hasMoreElements();){
            String name = e.nextElement();
            System.out.println(name + " = " + request.getAttribute(name));
        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Processing request in doPost");
        for (String key: request.getParameterMap().keySet()){
            System.out.println(key + " = " + request.getParameter(key));
        }
    }

}
