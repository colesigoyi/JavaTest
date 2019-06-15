package test.com.qf.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 19:19
 * @ desc: JDK1.7新特性
 **/

public class JDK7Demo {

    public static void main(String[] args) {
        //1.5之后Scanner
        //Scanner sc = new Scanner(System.in);
        //1.5之前接收控制台输入（直接使用IO流）
        //自动关闭流（1.7新特性）
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入数字：");
            String info = br.readLine();
            int num = Integer.parseInt(info);
            System.out.println(info);
            //br.close();//放进try后就可以不用手动关闭了，会自动关闭
        }catch (IOException | NumberFormatException e){//同级别的可以放在一起
            e.printStackTrace();
        }
    }
}
