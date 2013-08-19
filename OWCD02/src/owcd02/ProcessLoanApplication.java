package owcd02;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessLoanApplication extends HttpServlet {

    private static final long serialVersionUID = 7125157122878710428L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            throw new SQLException("Test!!!");
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
