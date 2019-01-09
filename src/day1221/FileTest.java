package day1221;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author taoxuefeng
 * @create 2018-12-21 14:07
 * @desc 使用FileOutputStream类向文件内写入信息，并通过FileInputStream降文件中的数据读取到控制台
 **/

public class FileTest {
    public static void main(String[] args) {
        File file = new File("/Users/taoxuefeng/Desktop/word.txt");
        if(file.exists()) {
            write(file);
            read(file);
        }else {
            creatFile(file);
        }
    }
    public static void write(File file) {
        try {
            FileOutputStream out = new FileOutputStream(file);
            byte buy[] = "信息已变更3.0".getBytes();
            out.write(buy);
            out.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void read(File file) {
        try {
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = in.read(byt);
            System.out.println("文件中的信息是：" + new String(byt,0,len));
            in.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void creatFile(File file) {
        try {
            file.createNewFile();
            System.out.println(file.getName() + "创建完成。");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
