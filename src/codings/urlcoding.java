package codings;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class urlcoding {
    @Test
    public void urlcoding() throws UnsupportedEncodingException {
        String s="张三";
        System.out.println(s);
        //url编码
       String s1= URLEncoder.encode(s,"utf-8");
        System.out.println(s1);
        //url解码
        String s2= URLDecoder.decode(s1,"utf-8");
        System.out.println(s2);
    }
}
