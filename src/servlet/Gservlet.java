package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        urlPatterns = "/gservlet"
)
public class Gservlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("gservlet");
        PrintWriter writer=resp.getWriter();
        writer.print("abc这可能是乱码123");
       /* //重定向
        resp.setHeader("Location","/hservlet");*/
       //快捷重定向
       resp.sendRedirect("/hservlet");
       //刷新
        //resp.setHeader("Refresh","5;/hservlet");

    }
}
