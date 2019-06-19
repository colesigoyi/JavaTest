package test.com.qf.IO.FileDemo;

import java.io.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-19 16:34
 * @ desc:字符流：
 *          字符输入流：Writer，对文件的操作使用子类：FileWriter
 *          字符输出流：Reader，对文件的操作使用子类：FileReader
 *
 *          没次操作一个字符
 *          文件字符操作流会自带缓存，默认大小为1024字节，在缓存满后，或手动刷新缓存，或关闭流时会把数据写入文件
 *          字节操作流，默认每次执行写入操作会直接把数据写入文件
 *
 *          如何选择字节流还是字符流？
 *              一般情况下操作非文本文件时使用字节流，操作文本文件时使用字符流
 *
 *        字符流的内部实现还是字节流
 **/

public class CharStreamDemo {

    static String path = "/Users/taoxuefeng/Documents/02_学习文件/" +
            "01_Java/java/java_study/src/test/com/qf/IO/FileDemo/";

    public static void main(String[] args) {
        out();
        in();
    }
    private static void out(){
        File file = new File(path + "newtest.txt");
        try {
            Writer out = new FileWriter(file,true);
            out.write("写入测试代码\r\n");
            System.out.println("写入代码完成");
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void in(){
        File file = new File(path + "newTest.txt");
        try {
            Reader in = new FileReader(file);
            char[] cs = new char[1];
            int len = -1;
             StringBuilder buf = new StringBuilder();
            while ((len = in.read(cs)) != -1){
                buf.append(new String(cs,0,len));
            }
            in.close();
            System.out.println(buf);
            //复制读取的内容粘贴到目标文件
            try {
                Writer out = new FileWriter(file,true);
                out.write(String.valueOf(buf));
                System.out.println("写入代码完成");
                out.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
