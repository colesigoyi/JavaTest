package day0426;

import java.util.Scanner;

/*
递归调用
在方法体中又调用了它自身
在定义方法时，主要确定两点：
    1、找规律
    2、确定结束条件
 */
class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = getFactorial(n);
        System.out.println(n + "!=" + result);
    }
    /*
    n!=(n-1)!*n
    1! = 1
     */
    public static long getFactorial(int n ) {
        if( n==1 ){
            return 1;
        }
        return getFactorial( n-1) * n;
    }
    /*
    5!=1*2*3*4*5
    4!=1*2*3*4
    n!=(n-1)!*n

    public static long factorial(int n) {
        long res = 1;
        for (int x = 1; x <=n; i++) {
            res *= x;
        }
        return res;
        */
}

