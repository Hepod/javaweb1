package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = "/kservlet"
)
public class Kservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求协议
        resp.getWriter().println(req.getScheme());
        //获取Servlet路径
        resp.getWriter().println(req.getServletPath());
        //获取项目名称
        resp.getWriter().println(req.getContextPath());
        //获取服务器名称
        resp.getWriter().println(req.getServerName());
        //获取服务器端口号
        resp.getWriter().println(req.getServerPort());
        //获取参数部分
        resp.getWriter().println(req.getQueryString());
        //获取请求URI
        resp.getWriter().println(req.getRequestURI());
        //获取请求URL
        resp.getWriter().println(req.getRequestURL());
    }
}
