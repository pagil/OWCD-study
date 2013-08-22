package owcd02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloByName extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.addCookie(new Cookie("cookieName", "cookieValue"));
        String name = request.getParameter("name");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Hello "+name+", I am the doGet method!!");
        out.println("</body>");
        out.println("</html>");
        Enumeration enumeration = request.getHeaders("Cookie");
        for (;enumeration.hasMoreElements();) {
            Object obj = enumeration.nextElement();
            System.out.println(obj);
        }
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
