package test.com.qf.IO.FileDemo;

import java.io.File;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-18 22:06
 * @ desc:在指定的目录中查找文件
 **/

public class FileDemo2 {
    public static void main(String[] args) {

        String path = "/Users/taoxuefeng/Documents/02_学习文件/" +
                "01_Java/java/java_study/src/test/com/qf/IO/FileDemo";


        findFile(new File(path),".txt");

    }

    public static void findFile(File target, String ext){
        if(target==null){//如果问件事目录
            return;
        }
        if(target.isDirectory()){
            File[] files = target.listFiles();
            if(files != null){
                for(File f:files){
                    findFile(f,ext);//递归调用
                }
            }
        }else {//此处表示为文件
            String name = target.getName().toLowerCase();
            if(name.endsWith(ext)){
                System.out.println(target.getAbsolutePath());
            }
        }
    }
}
