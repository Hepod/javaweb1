package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Enumeration;

//注解配置
@WebServlet(
        urlPatterns = "/aservlet",
        initParams = {@WebInitParam(name = "na1",value = "参数一"),@WebInitParam(name = "na2",value = "参数二")}
)
public class Aservlet implements Servlet {
    //生命周期方法，在Servlet创建后执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
        //输出name为na1,na2的参数
        System.out.println(servletConfig.getInitParameter("na1"));
        System.out.println(servletConfig.getInitParameter("na2"));
        //获取所有参数的name
        Enumeration e=servletConfig.getInitParameterNames();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
    //获取Servlet配置信息
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("config");
        return null;
    }
    //生命周期方法，每次处理请求都调用
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
    }
    //获取Servlet信息
    @Override
    public String getServletInfo() {
        System.out.println("info");
        return null;
    }
    //生命周期方法，在Servlet销毁前执行一次
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
