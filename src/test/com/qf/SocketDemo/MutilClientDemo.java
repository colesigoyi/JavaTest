package test.com.qf.SocketDemo;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-29 21:19
 * @ desc: 多客户端模拟
 **/

public class MutilClientDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建一个Socket对象，指定要链接的服务器
        try {
            Socket socket = new Socket("localhost",6666);
            //获取socket的输入输出流
            PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.print("请输入：");
            String info = sc.nextLine();
            ps.println(info);
            ps.flush();
            //读取服务器端返回的数据
            info = br.readLine();
            System.out.println(info);
            ps.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
