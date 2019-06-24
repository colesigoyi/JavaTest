package test.com.qf.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 22:20
 * @ desc:
 **/

public class PathFilesDemo {
    static PathFile path = new PathFile();
    public static void main(String[] args) {
        File file = new File(path.getPath() + "computer.jpg");

        //path
        Path p1 = Paths.get(path.getPath(), "computer.jpg");
        System.out.println(p1);

        Path p2 = file.toPath();
        System.out.println(p2);

        Path p3 = FileSystems.getDefault().getPath(path.getPath(),"computer.jpg");

        //Files类
        Path p4 = Paths.get(path.getPath() + "test.txt");
        String info = "输入测试";
        try {
            Files.write(p4,info.getBytes("UTF-8"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //读取文件
        try {
            byte[] bytes = Files.readAllBytes(p4);
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
