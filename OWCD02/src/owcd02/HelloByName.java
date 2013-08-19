package owcd02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloByName extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Hello "+name+", I am the doGet method!!");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Hello "+name+", I am the doPost method!!");
        out.println("</body>");
        out.println("</html>");
    }

}
