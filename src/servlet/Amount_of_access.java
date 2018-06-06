package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(
        urlPatterns = "/Amount_of_access"
)
public class Amount_of_access extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context=getServletContext();
       Integer quantity= (Integer) context.getAttribute(" quantity");
       if (quantity==null){
           context.setAttribute(" quantity",1);
       }else {
           context.setAttribute(" quantity",quantity+1);
       }
        PrintWriter pw=resp.getWriter();
       pw.print(quantity);
    }
}
