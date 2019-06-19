package test.com.qf.IO.FileDemo;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-19 18:02
 * @ desc: 字节流与字符流转换
 *      OutputStreamWriter：可以将输出的字符流转换为字节流的输出形式
 *      InputStreamReader：将输入的字节流转换为字符流的输入形式
 **/

public class ChangeStreamDemo {
    public static void main(String[] args) {
        String path = "/Users/taoxuefeng/Documents/02_学习文件/" +
                "01_Java/java/java_study/src/test/com/qf/IO/FileDemo/";
        try {
            InputStream in = new FileInputStream(path + "newTest.txt");
            read(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            OutputStream out = new FileOutputStream(path + "Test.txt");
            write(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void read(InputStream in){
        Reader reader = new InputStreamReader(in, Charset.forName("UTF-8"));
        char[] cs = new char[1024];
        int len = -1;
        try {
            while ((len = reader.read(cs)) != -1){
                System.out.println(new String(cs, 0, len));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write(OutputStream out){
         Writer writer = new OutputStreamWriter(out, Charset.defaultCharset());
        try {
            writer.write("写入测试。。。");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
