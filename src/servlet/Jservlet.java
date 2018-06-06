package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        urlPatterns = "/    jservlet"
)
public class Jservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ip并输出
        resp.getWriter().println(req.getRemoteAddr());
        //获取请求方法并输出
        resp.getWriter().println(req.getMethod());
        //获取User-Agent请求头并输出
        resp.getWriter().println(req.getHeader("User-Agent"));
    }
}

