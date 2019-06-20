package test.com.qf.IO.FileDemo;

import java.io.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-19 19:50
 * @ desc: 缓冲流:
 *              缓存的目的：解决在写入文件操作时，频繁的操作文件所带来的性能降低的问题
 *
 *              BufferOutputStream内部默认缓存大小为8KB，每次写入时存储到缓存中的byte数组里
 *              当数组存满时，会把数组中的数据写入文件当中，缓存下标归零
 *
 *          字符流
 *          1.加入字符缓冲流，增强读取功能（readLine）
 *          2.更高效的读取数据
 *
 *          FileReader:内部使用InputStreamReader（Sun.nio.cs.StreamDecoder），解码过程，byte->char，默认缓存大小8k
 *          BufferedReader:默认缓存大小8k，但是可以手动指定缓存大小,把数据直接读取到缓存中，减少每次转换过程，效率更高
 *          BufferedWriter:同上
 **/

public class BufferStreamDeam {
    public static PathFile path = new PathFile();
    public static void main(String[] args) {

        //PathFile path = new PathFile();
        //System.out.println(path.getPath());
        byteWriter(path.getPath());
        byteReader(path.getPath());
        charWriter(path.getPath());
        charReader(path.getPath());
    }
    //-----------------------------------字节缓冲流-------------------------------------
    private static void byteWriter(String path){
        File file = new File(path + "Test.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            //构造一个字节缓冲流
            BufferedOutputStream bos = new BufferedOutputStream(out);

            String info = "----Buffer测试----";
            bos.write(info.getBytes());
            bos.close();
            //out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void byteReader(String path){
        File file = new File(path + "Test.txt");
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            //构造一个字节缓冲流
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = bis.read(bytes)) != -1){
                System.out.println(new String(bytes,0,len));
            }
            bis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //-----------------------------------字符缓冲流-------------------------------------
    private static void charReader(String path){
        File file = new File(path + "Test.txt");
        try {
            Reader reader = new FileReader(file);
            //卫子夫六提供缓冲，以达到高效读取
            BufferedReader br = new BufferedReader(reader);
            char[] cs = new char[1024];
            int len = -1;
            while ((len=br.read(cs)) != -1){
                System.out.println(new String(cs, 0, len));
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void charWriter(String path){
        File file = new File(path + "Test.txt");
        try {
            Writer writer = new FileWriter(file);
            //构造一个字节缓冲流
            BufferedWriter bw = new BufferedWriter(writer);

            String info = "----BufferedWriter测试----";
            bw.write(info);
            bw.flush();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
