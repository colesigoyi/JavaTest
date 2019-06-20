package test.com.qf.IO.FileDemo;

import java.io.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-21 00:48
 * @ desc: 文件分割与合并
 **/

public class FileDivisionMergeDemo {

    static PathFile path = new PathFile();

    public static void main(String[] args) {
        File file = new File(path.getPath() + "/千锋Java.mp4");
        System.out.println(file.getPath());
        division(file, 1024*1024*5, path.getPath());
    }

    /**
     * 文件分割
     * targetFile:要切割的文件
     * cutSize：每个文件的大小
     */
    private static void division(File targetFile, long cutSize, String path){
        if(targetFile == null){
            return;
        }
        //计算总分割的文件数
        int num = targetFile.length()%cutSize == 0?
                (int)(targetFile.length()/cutSize):(int)(targetFile.length()/cutSize+1);

        try {
            //构造一个文件输入流
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(targetFile));
            BufferedOutputStream out = null;

            byte[] bytes = null;//每次要读取的字节数
            int len = -1;
            int count = 0;//没一个文件要读取的次数

            for (int i=0; i<num; i++){
                out = new BufferedOutputStream(new FileOutputStream(new File(
                        path + (i+1) +"-" + targetFile.getName())));
                if(cutSize <= 1024){
                    bytes = new byte[(int)cutSize];
                    count = 1;
                }else {
                    bytes = new byte[1024];
                    count = (int)cutSize/1024;
                }
                while (count > 0 && (len=in.read(bytes)) != -1){
                    out.write(bytes, 0, len);
                    out.flush();
                    count--;
                }

                if(cutSize%1024 != 0){
                    bytes = new byte[(int)cutSize%1024];
                    len = in.read(bytes);
                    out.write(bytes, 0, len);
                    out.flush();
                    out.close();
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 文件合并
     */
    private static void merge(){

    }
}
