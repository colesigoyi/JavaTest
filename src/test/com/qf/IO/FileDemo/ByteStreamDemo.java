package test.com.qf.IO.FileDemo;

import java.io.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-18 22:38
 * @ desc: 字节输出输入流
 *          输出流：超类OutputStream，对文件的输出流使用子类FileOutputStream
 *          输入流：超类InputStream，对文件的输出流使用子类FileInputStream
 **/

public class ByteStreamDemo {

    public static void main(String[] args) {

        out();
        in();

    }
    private static void out(){
        String path = "/Users/***/Documents/02_学习文件/" +
                "01_Java/java/java_study/src/test/com/qf/IO/FileDemo/";
        //0.确定文件
        File file = new File(path + "newTest.txt");

        //1.构建文件输出流对象
        try {

            OutputStream out = new FileOutputStream(file, true);//append为true表示追加
            //2.要输出的内容
            String info = "测试代码\r\n";//表示换行
            //String line = System.getProperty("line.separator");//获取换行符
            //3.把内容写入盗文就爱你
            out.write(info.getBytes());
            //4.关闭流
            out.close();
            System.out.println("写入成功！");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void in(){
        //0.确定目标文件
        String path = "/Users/taoxuefeng/Documents/02_学习文件/" +
                "01_Java/java/java_study/src/test/com/qf/IO/FileDemo/";
        //1.构建一个文件输入流对象
        File file = new File(path + "newTest.txt");
        try {
            InputStream in = new FileInputStream(file);
            //2.
            byte[] bytes = new byte[1024];
            StringBuilder buf = new StringBuilder();
            int len = -1;//长度表示每次读取的字节长度
            //把数据读到数组中，并返回读取到字节数，当不等于-1时，表示读取到数据，等于-1表示文件已经读完
            while ((len = in.read(bytes)) != -1){
                //根据读取到的字节数，在转换成字符串内容，添加到StringBuffer中
                buf.append(new String(bytes));
            }
            //打印内容
            System.out.println("--------开始复制--------");
            System.out.println(buf);
            //关闭输入
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
