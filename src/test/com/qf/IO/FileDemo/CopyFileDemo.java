package test.com.qf.IO.FileDemo;

import java.io.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-19 17:29
 * @ desc: 复制文件:从一个输入流中读取数据，同时通过输出流写入目标位置
 *         一边读一边写
 **/

public class CopyFileDemo {
    public static void main(String[] args) {
        String path = "/Users/taoxuefeng/Documents/02_学习文件/" +
                "01_Java/java/java_study/src/test/com/qf/IO/FileDemo/";
        String src = "computer.jpg";
        String target = "my/computer.jpg";
        System.out.println("开始复制！");

        copy(path + src,path + target);
        System.out.println("复制完成！");
    }

    private static void copy(String src, String target){
        File srcFile = new File(src);
        File targetFile = new File(target);

        InputStream in = null;
        OutputStream out =null;

        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(targetFile);

            byte[] bytes = new byte[1024];
            int len = -1;

            while ((len = in.read(bytes)) != -1){
                out.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(in != null){
                    in.close();
                }
                if(out != null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
