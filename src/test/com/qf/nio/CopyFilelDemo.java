package test.com.qf.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 21:38
 * @ desc: NIO通道Channel
 **/

public class CopyFilelDemo {
    static PathFile path = new PathFile();
    public static void main(String[] args) {
        try {
            copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void copyFile() throws Exception{
        //创建一个输入流文件的通道
        FileChannel fcIn = new FileInputStream(path.getPath() + "/nio/computer.jpg").getChannel();
        //创建一个输出流文件的通道
        FileChannel fcOut = new FileOutputStream(path.getPath() + "/nio/test/computer.jpg").getChannel();

        ByteBuffer buf = ByteBuffer.allocate(1024);

        while(fcIn.read(buf)!=-1){
            buf.flip();
            fcOut.write(buf);
            buf.clear();
        }
        fcIn.close();
        fcOut.close();
        System.out.println("copy success");
    }
}
