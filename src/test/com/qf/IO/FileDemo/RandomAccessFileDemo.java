package test.com.qf.IO.FileDemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 02:49
 * @ desc:
 **/

public class RandomAccessFileDemo {
    static PathFile path = new PathFile();
    public static void main(String[] args) {
        try {
            //读取文件
            RandomAccessFile r = new RandomAccessFile(path.getPath() + "/computer.jpg", "r");
            //写入文件
            RandomAccessFile w = new RandomAccessFile(path.getPath() + "/my/computer.jpg", "rw");

            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = r.read(bytes)) != -1){
                w.write(bytes, 0, len);
            }
            w.close();
            r.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.addSuppressed(e);
        }
    }
}
