package test.com.qf.IO.FileDemo;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-21 13:21
 * @ desc: 字符串流：以一个字符串为数据源，来构成字符流
 *          作用：在WEB开发中，我们经常要从数据库上获取数据，数据的返回格式时一个字符串（XML，JSON），
 *          我们需要把这个字符串构成一个字符流，然后再用第三方的数据解析器来解析数据
 **/

public class StringStreamDemo {
    public static void main(String[] args) {
        StringReader();
    }
    private static void StringReader(){
        String info = " good good study day day up";
        StringReader sr = new StringReader(info);
        //流标记器
        StreamTokenizer st = new StreamTokenizer(sr);

        int count = 0;
        while (st.ttype != StreamTokenizer.TT_EOF){
            try {
                if(st.nextToken() == StreamTokenizer.TT_WORD){
                    count++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        sr.close();
        System.out.println("count=" + count);


    }
}
