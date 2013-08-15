package owcd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileTransferServlet
 */
@WebServlet(
        urlPatterns = { "/FileTransferServlet" },
        initParams = {
                @WebInitParam(name = "filePath", value = "/tmp/eng.zip", description = "ZIP archive to send to client.")
        })
public class FileTransferServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public FileTransferServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/zip");
        File f=new File(getInitParameter("filePath"));
        byte[] array = new byte[(int)f.length()];
        FileInputStream fis = new FileInputStream(f);
        fis.read(array);
        OutputStream os = response.getOutputStream();
        os.write(array);
        os.flush();
    }

}
