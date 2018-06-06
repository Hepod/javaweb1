package codings;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//tomcat默认使用iso-8859-1编码
@WebServlet(
        urlPatterns = "/coding"
)
public class coding extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //System.out.println(req.getParameter("username"));

        byte[] bytes=req.getParameter("username").getBytes("iso-8859-1");
        System.out.println(new String(bytes,"utf-8"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //resp.getWriter().print(req.getParameter("na1"));

        req.setCharacterEncoding("utf-8");
        System.out.println(req.getParameter("na1"));

    }
}
