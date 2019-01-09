package day0427;

import java.util.Scanner;

/*
定义一个方法，求两个整数的最大公约数
 */
class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个数：");
        int b = sc.nextInt();
//        System.out.print("请输入第三个数：");
//        int c = sc.nextInt();
        System.out.println(a + "和" + b + "的最大公约数为：" + getGCD3(a, b));
    }

    public static int getGCD(int num1, int num2 ,int num3) {
        //从m或者n遍历到1，找第一个能同时把m与n整除的数
        for(int x=num1; x>=1; x--) {
            if(num1%x==0 && num2%x==0 && num3%x==0) {
                return x;
            }
        }return 1;
    }
    //从1遍历到n或者m，找公约数，保存，返回最大的那个公约数
    public static int getGCD2(int num1, int num2) {
        int gcd = 1;
        for(int x=1; x<=num1; x++) {
            if(num1%x==0 && num2%x==0) {
                gcd = x;
            }
        }return gcd;
    }
    /*
        经典算法：辗转求语法
        m == 18     n ==14

        r = m%n;    r == 4
        m = n;      m==14
        n = r;      n==4

        r = m%n     r==2
        m=n         m==4
        n=r         n==2

        r=m%n       r==0    ----->最大公约数为n
    */

    public static int getGCD3(int num1, int num2) {
        int r = num1 % num2;
        while( r != 0) {
            num1 = num2;
            num2 = r;
            r = num1 % num2;
        }
        return num2;
    }
}
