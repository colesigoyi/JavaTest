package test.com.qf.IO.FileDemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 15:14
 * @ desc: 压缩与解压文件
 **/

public class CompressionAndDecomprossionDemo {
    static PathFile path = new PathFile();
    public static void main(String[] args) {
        //compression(path.getPath() + "/test.zip",new File(path.getPath() + "/my"));
        decompression(path.getPath() + "/test.zip",path.getPath() + "deTest/");
    }

    /**
     * 压缩
     */
    private static void compression(String zipFileName, File targetFile){
        System.out.println("正在压缩...");
        try {
            //要生成的压缩文件
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
            BufferedOutputStream bos = new BufferedOutputStream(out);
            zip(out, targetFile, targetFile.getName(),bos);
            bos.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("压缩完成");
    }
    //zip
    private static void zip(ZipOutputStream zOut, File targetFile, String name, BufferedOutputStream bos) {
        //判断是否为目录
        if(targetFile.isDirectory()){
            File[] files = targetFile.listFiles();
            if(files.length == 0){//空文件夹
                try {
                    zOut.putNextEntry(new ZipEntry(name + "/"));//处理空目录
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            for (File f: files){
                //递归处理
                zip(zOut,f,name + "/" + f.getName(),bos);
            }
        }else {
            try {
                zOut.putNextEntry(new ZipEntry(name));
                InputStream in = new FileInputStream(targetFile);
                BufferedInputStream bis = new BufferedInputStream(in);
                byte[] bytes = new byte[1024];
                int len = -1;
                while ((len=bis.read(bytes)) != -1){
                    bos.write(bytes, 0, len);
                }
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 解压
     */
    private static void decompression(String targetFileName, String parent){
        System.out.println("正在解压...");
        try {
            //构建解压的输入流

            ZipInputStream zIn = new ZipInputStream(new FileInputStream(targetFileName));
            ZipEntry entry = entry = zIn.getNextEntry();
            File file = null;

            while (entry!=null && !entry.isDirectory()){

                file = new File(parent, entry.getName());
                if(!file.exists()){
                    new File(file.getParent()).mkdirs();//创建此文件的上级目录
                }
                OutputStream out = new FileOutputStream(file);
                BufferedOutputStream bos = new BufferedOutputStream(out);
                byte[] bytes = new byte[1024];
                int len = -1;
                while ((len=zIn.read(bytes)) != -1){
                    bos.write(bytes, 0, len);
                }
                bos.close();
                System.out.println(file.getAbsolutePath() + "  解压完成");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
