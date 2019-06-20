package test.com.qf.IO.FileDemo;

import java.io.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-21 00:25
 * @ desc: 数据流:与机器无关的操作Java的基本数据类型
 **/

public class DataStreamDeam {
    static PathFile path = new PathFile();
    public static void main(String[] args) {
        write(path.getPath());
        read(path.getPath());
    }

    private static void write(String path){
        File file = new File(path + "/test.dat");
        try {
            OutputStream out = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(out);
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeInt(10);//写入4个字节
            dos.writeByte(1);//写入1个字节
            dos.writeUTF("中");//写入5个字节

            dos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read(String path){
        File file = new File(path + "/test.dat");
        try {
            InputStream in = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(in);
            DataInputStream dis = new DataInputStream(bis);

            int num = dis.readInt();
            byte b = dis.readByte();
            String s = dis.readUTF();
            System.out.println(num +","+ b +","+ s);

            dis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
