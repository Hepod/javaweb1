package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet(
        urlPatterns = "/mservlet"
)
public class Mservlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getOutputStream().print("get"+req.getParameter("xxx"));
        resp.getOutputStream().print("get"+req.getParameter("yyy"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码（服务端与客户端）
        resp.setContentType("text/html;charset=utf-8");

        resp.getOutputStream().print(req.getParameter("username")+"  ");
        resp.getOutputStream().print(req.getParameter("password")+"  ");
        String[]str= req.getParameterValues("hobby");
        resp.getOutputStream().print(Arrays.toString(str)+"<br> ");
        Map<String, String[]> map= req.getParameterMap();
        for(String key:map.keySet()){
        resp.getOutputStream().print("map:"+Arrays.toString(map.get(key)));
        }
    }
}
