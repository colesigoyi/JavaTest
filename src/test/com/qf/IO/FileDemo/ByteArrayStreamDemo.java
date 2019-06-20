package test.com.qf.IO.FileDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-20 15:29
 * @ desc: 字符数组流:基于内存操作，内部维护的一个字节数组，我们可以利用流的读取机制，来处理字符串
 *                  无需关闭
 **/

public class ByteArrayStreamDemo {
    public static void main(String[] args) {
        byteArray();
    }

    private static void byteArray(){
        String s = "2345345234jjhdkahdiu(*&^GYUNBHMHU#$%&GV";
        ByteArrayInputStream bais = new ByteArrayInputStream(s.getBytes());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int curr = -1;//每次读取的字节
        int count = 0;//字母个数统计
        while ((curr = bais.read()) != -1){
            if((curr >= 65 && curr <= 90) || (curr >= 97 && curr <= 122)){
                count++;
                baos.write(curr);
            }
        }
        //此时无需关闭，字节数组流基于内存的操作流，和文件没关系
        System.out.println("字母个数为：" + count);
        System.out.println("字母内容：" + baos.toString());
    }
}
