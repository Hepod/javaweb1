package classload;

import org.junit.Test;
import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class classload {
    @Test
    public void fun1() throws IOException {
        ClassLoader c= classload.class.getClassLoader();
        InputStream input= c.getResourceAsStream("a.text");

    /*    BufferedReader bf=new BufferedReader(new InputStreamReader(input,"UTF-8"));
        //最好在将字节流转换为字符流的时候 进行转码
        StringBuffer buffer=new StringBuffer();
        String line="";
        while((line=bf.readLine())!=null){
            buffer.append(line);
        }
        System.out.println(buffer.toString());*/
    }
}
