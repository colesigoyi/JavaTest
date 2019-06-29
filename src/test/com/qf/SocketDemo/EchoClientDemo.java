package test.com.qf.SocketDemo;

import java.io.*;
import java.net.Socket;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-29 20:42
 * @ desc: 客户端
 **/

public class EchoClientDemo {
    public static void main(String[] args) {
        //创建一个Socket对象，指定要链接的服务器
        try {
            Socket socket = new Socket("localhost",6666);
            //获取socket的输入输出流
            PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            ps.println("hello,my name is ECHO");
            ps.flush();
            //读取服务器端返回的数据
            String info = br.readLine();
            System.out.println(info);
            ps.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
