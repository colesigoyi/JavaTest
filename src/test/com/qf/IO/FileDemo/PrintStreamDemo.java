package test.com.qf.IO.FileDemo;

import java.io.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-20 13:54
 * @ desc: 打印流：
 *              字节打印流：在字节输出时，可以增强输出功能
 *              字符打印流：
 **/

public class PrintStreamDemo {
    static PathFile path = new PathFile();
    public static void main(String[] args) {
        //bytePrint(path.getPath());
        charPrint(path.getPath());

    }
    private static void bytePrint(String path){
        File file = new File(path + "Test.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            //加缓存
            BufferedOutputStream bos = new BufferedOutputStream(out);
            //增强打印功能
            PrintStream ps = new PrintStream(bos);
            ps.println("-----------printStream测试----------------");
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void charPrint(String path){
        File file = new File(path + "Test.txt");
        try {
            Writer writer = new FileWriter(file);
            //加缓存
            BufferedWriter bw = new BufferedWriter(writer);
            //增强打印功能
            PrintWriter pw = new PrintWriter(bw);
            pw.println("-----------printStream测试----------------");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
