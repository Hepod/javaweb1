package dispatcher;

import sun.plugin.com.Dispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*使用 req.getRequestDispatcher（）.forward（）转发请求
 可以设置响应头，不能设置响应体*/
@WebServlet(
        urlPatterns = "/oneservlet"
)
public class oneservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("oneservlet");

        /*resp.setHeader("abc","aaa");
        resp.getWriter().print("hello,one");*/
        //Request域添加属性
        req.setAttribute("name","zhangsan");

        req.getRequestDispatcher("/twoservlet").forward(req,resp);
    }
}
