package day1220;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author taoxuefeng
 * @create 2018-12-20 20:01
 * @desc 获取文件信息
 **/

public class GetFileInfo {
    public static void main(String[] args) {
        String name;
        String canR;
        String canW;
        String exists;
        long length;
        String file_Path;
        String isDirectory;
        long changeTime;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dt;

        File file = new File("/Users/taoxuefeng/Desktop/info.txt");
        if(file.exists()) {
            name = file.getName();
            exists = "文件存在";
            length = file.length();
            file_Path = file.getAbsolutePath();
            changeTime = file.lastModified();
            dt = df.format(new Date(changeTime));
            if(file.canRead()) {
                canR = "可读";
            }else {
                canR = "不可读";
            }
            if(file.canWrite()) {
                canW = "可写";
            }else {
                canW = "不可写";
            }
            if(file.isDirectory()) {
                isDirectory = "目录";
            }else {
                isDirectory = "文件";
            }
            System.out.println(exists);
            System.out.println("文件名：" + name);
            System.out.println("文件长度：" + length);
            System.out.println("绝对路径：" + file_Path);
            System.out.println("类型：" + isDirectory);
            System.out.println(canR);
            System.out.println(canW);
            System.out.println("最后修改时间：" + dt);
        }else {
            System.out.println("文件不存在！");
        }
    }
}
