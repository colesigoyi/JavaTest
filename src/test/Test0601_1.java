package test;

import java.util.Scanner;

/**
 * @ program: java_test
 * @ author:  TaoXueFeng
 * @ create: 2019-06-01 19:27
 * @ desc:
 **/

public class Test0601_1 {
    public static void main(String[] args) {
        //调用方法
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean bool = isRunNian(num);
        if(bool){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
        print();
    }
    public static boolean isRunNian(int year) {
        if((year%4==0 && year%100 != 0) || year%400 == 0){
            return true;
        }else {
            return false;
        }
    }
    public static void print() {
        for(int i=0; i<10; i++){
            if(i==5){
                return;//表示方法结束
            }
            System.out.println(i);
        }
    }
}
