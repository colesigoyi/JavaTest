package day0426;

import java.util.Scanner;

/*
测试断点调试
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        if( num > 0){
            System.out.println("正整数");
        }else if( num < 0){
            System.out.println("负整数");
        }

        int sum = 0;
        while( num >= 0){
            sum += num;
            num--;
        }
        System.out.println("sum==" + sum);
    }
}
