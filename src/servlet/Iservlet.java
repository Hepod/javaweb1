package servlet;

import sun.misc.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet(
        urlPatterns = "/iservlet"
)
public class Iservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path="D:/web test/pic/22493439_cover.png";

        FileInputStream inputStream=new FileInputStream(path);
        // FileInputStream 转换为byte[]
        byte[] bytes=new byte[inputStream.available()];
        inputStream.read(bytes);
        //输出流
        resp.getOutputStream().write(bytes);
    }
}
