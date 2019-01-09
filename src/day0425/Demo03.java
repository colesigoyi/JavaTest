package day0425;

import java.util.Scanner;

/*
打印九九乘法表
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入需要打印的行数：");
        int a = sc.nextInt();
        if(a > 9){
            System.out.println("请输入1~9之间的数");
        }
        else {
            int num = 0;
            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= x; y++) {
                    num = x * y;
                    System.out.print(y + "*" + x + "=" + num + "\t");
                }
                System.out.println();
            }
        }
    }
}
