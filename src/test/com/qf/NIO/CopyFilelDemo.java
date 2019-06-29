package test.com.qf.NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 21:38
 * @ desc: NIO通道Channel：通过文件通道实现文件复制
 *          比较IO操作的性能比较
 *              1、内存映射最快
 *              2、NIO读写文件
 *              3、使用了缓存的IO流
 *              4、无缓存的IO流
 **/

public class CopyFilelDemo {
    static PathFile path = new PathFile();
    public static void main(String[] args) {
        try {
            //copyFile();
            randomAccessFileCopy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void copyFile() throws Exception{
        //创建一个输入流文件的通道
        FileChannel fcIn = new FileInputStream(path.getPath() + "/computer.jpg").getChannel();
        //创建一个输出流文件的通道
        FileChannel fcOut = new FileOutputStream(path.getPath() + "/test/computer.jpg").getChannel();

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
    private static void randomAccessFileCopy() throws Exception{
        RandomAccessFile in = new RandomAccessFile(path.getPath() + "/computer.jpg","r");
        RandomAccessFile out = new RandomAccessFile(path.getPath() + "/test/computer2.jpg","rw");

        FileChannel fcIn = in.getChannel();
        FileChannel fcOut = out.getChannel();

        long size = fcIn.size();//输入流的字节大小
        //输入流的缓冲区
        MappedByteBuffer inBuf = fcIn.map(FileChannel.MapMode.READ_ONLY, 0, size);
        //输出流的缓冲区
        MappedByteBuffer outBuf = fcOut.map(FileChannel.MapMode.READ_WRITE, 0, size);

        for (int i=0; i<size; i++){
            outBuf.put(inBuf.get());
        }
        //关闭通道时回写入数据块
        fcIn.close();
        fcOut.close();
        in.close();
        out.close();
        System.out.println("copy success");
    }
}
