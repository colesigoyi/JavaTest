package test.com.qf.SocketDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-29 20:35
 * @ desc: ECHO服务器端
 **/

public class EchoServerDemo {
    public static void main(String[] args) {
        //创建一个服务器端的Socket（1024-65536端口号）
        try {
            ServerSocket server = new ServerSocket(6666);
            System.out.println("服务器已启动，正在等待客户端连接");
            //灯带客户端的连接，造成阻塞，如果有客户端连接成功，立即返回一个Socket对象
            Socket socket = server.accept();
            System.out.println("客户端连接成功:" + server.getInetAddress().getHostAddress());
            BufferedReader br =new BufferedReader(
                    new InputStreamReader(socket.getInputStream())) ;
            //通过输入流读取网络数据,如果没有数据，那么会阻塞
            String info = br.readLine();
            System.out.println(info);
            //获取输出流，向客户端返回消息
            PrintStream ps = new PrintStream(
                    new BufferedOutputStream(socket.getOutputStream()));
            ps.println("ECHO:" + info);
            ps.flush();;
            //关闭
            ps.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
