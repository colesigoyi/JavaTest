package test.com.qf.IO.FileDemo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-18 17:49
 * @ desc: File类的使用
 **/

public class FileDemo {
    public static void main(String[] args) {

        String path = "/Users/***/Documents/02_学习文件/" +
                "01_Java/java/java_study/src/test/com/qf/IO/FileDemo/";

        //File类表示一个文件或目录
        File f1 = new File(path + "newTest.txt");
        if(!f1.exists()){//判断文件是否存在
            try {
                f1.createNewFile();
                System.out.println("文件创建成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("文件已存在");
        }
        //f1.isFile 是否为文件
        System.out.println("是否为文件夹：" + (f1.isDirectory()?"是":"否"));

        File f2 = new File(path + "my");
        boolean b = f2.delete();
        System.out.println(b);

        String[] names = f2.list();//输出文件夹内的文件名,有文件夹的话输出文件夹名字，只看当前目录
        System.out.println(Arrays.toString(names));

        File[] fs = f2.listFiles();//列出当前目录下的所有文件，以file对象返回
        for (File f : fs){
            System.out.println("长度：" +  f.length());//长度
            System.out.println("名称：" +  f.getName());//
            System.out.println("相对路径：" +  f.getPath());//相对路径
            System.out.println("绝对路径：" +  f.getAbsolutePath());//绝对路径
            System.out.println("是否为隐藏文件：" +  f.isHidden());//
            System.out.println("是否可读：" +  f.canRead());//

            Date date = new Date(f.lastModified());
            DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            System.out.println("文件最后修改时间：" +  df.format(date));//
            System.out.println("----------------------------");


        }
        //相对路径与绝对路径的区别
        File f3 = new File("Test.txt");
        System.out.println("相对路径：" +  f3.getPath());//相对路径
        System.out.println("绝对路径：" +  f3.getAbsolutePath());//绝对路径

        File f4 = new File(path + "TestFile1");
        f4.mkdirs();//创建文件夹
        //f4.renameTo(new File(path + "TestFile1"));//重命名
        f4.renameTo(new File(path + "my/Test"));//移动文件

        File f5 = new File(path);
        //File[] files = f5.listFiles(new FileFilter(){
        //    @Override
        //    public boolean accept(File pathname) {
        //        return pathname.getName().endsWith(".txt");//过滤文件
        //    }
        //});

        File[] files = f5.listFiles((pathname) -> pathname.getName().endsWith(".txt"));
        for (File f:files){
            System.out.println(f.getName());
        }
    }
}
