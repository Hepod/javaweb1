package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = "/lservlet"
)
public class Lservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String from=req.getHeader("Referer");
        if(from==null||!from.contains("localhost")){
            resp.sendRedirect("http://www.baidu.com");
        }else{
            resp.getWriter().print("hello");
        }
    }
}
