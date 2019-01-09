package day0427;

import java.util.Scanner;

/*
定义一个方法求两个整数范围之内所有数的累加和
 */
class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数:");
        int m = sc.nextInt();
        System.out.print("请输入第二个整数:");
        int n = sc.nextInt();
        //方法1
        System.out.println("sum=" + getSum1(m, n));
        //方法2
        if (m > n) {
            int a = m;
            m = n;
            n = a;
        }
        System.out.println("sum=" + getSum2(m, n));
    }
    //方法1
    public static int getSum1(int num1, int num2) {
        int sum = 0;
        if (num1 > num2) {
            int a = num1;
            num1 = num2;
            num2 = a;
        }
        for (int x = num1; x <= num2; x++) {
            sum += x;
        }
        return sum;
    }
    //方法2
    public static int getSum2(int from, int to) {
        int sum = 0;
        for (int x = from; x <= to; x++) {
            sum += x;
        }
        return sum;

    }
}