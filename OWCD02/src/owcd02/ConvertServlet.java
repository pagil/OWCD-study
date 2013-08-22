package owcd02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConvertServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s1 = request.getParameter("balance");
        Object s2 = request.getParameter("balance");
        Float s3 = Float.parseFloat(request.getParameter("balance"));
        float s4 = Float.parseFloat(request.getParameter("balance"));

        System.out.println(s1+" "+s2+" "+s3+" "+s4);

        System.out.println(getServletContext().getInitParameter("webmaster"));
        System.out.println(getServletConfig().getInitParameter("webmaster"));

    }

}
