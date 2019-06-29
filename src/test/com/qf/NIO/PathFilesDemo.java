package test.com.qf.NIO;

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
        //写入文件
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

        //复制文件
        try {
            Files.copy(p3,Paths.get(path.getPath() + "/test/computer3.jpg"),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //移动文件
        try {
            Files.move(p3,Paths.get(path.getPath() + "/test/computer.jpg"),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //删除文件
        try {
            Files.delete(p3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //创建新目录，出了最后一个部件，其他的必须已经存在
        try {
            Files.createDirectory(Paths.get(path.getPath() + "creatFile"));
            //Files.createDirectories(path);//创建多级不存在的目录
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建文件
        try {
            Files.createFile(Paths.get(path.getPath() + "creat.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        //添加前缀后缀创建临时文件或临时目录
        //Path newPath = Files.createTempDirectory(dir, prefix, suffix);
        //Path newPath = Files.createTempFile(dir, prefix, suffix);
    }
}
