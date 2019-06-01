package test;

import java.util.Scanner;

/**
 * @ program: java_test
 * @ author:  TaoXueFeng
 * @ create: 2019-06-01 19:40
 * @ desc: 等腰三角形
 **/

public class Test0601_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入高度：");
        int num = sc.nextInt();
        printTriangle(num);
    }
    public static void printTriangle(int line) {
        for(int i=1; i<=line; i++){
            for(int j=i; j<line; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
