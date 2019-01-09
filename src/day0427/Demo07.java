package day0427;

import java.util.Scanner;

/*
定义一个方法，判断一个数是否为回文素数，回文素数指的是一个数同时为素数和回文数
如131是一个素数，同时也是一个回文数，编写程序，显示钱100个回文素数，每行显示10个
 */
class Demo07 {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        while( true ) {
            if(isPrimePalindromeNumber(num)) {
                System.out.print(num + "\t");
                count++;
                if( count%10 ==0) {//判断是否需要换行
                    System.out.println();
                }
                if(count >=100) {//判断是否到100个
                    break;
                }
            }
            num++;
        }
    }

    public static  boolean isPrimePalindromeNumber(int num) {
        if (isPrime(num) && isPalindrome(num)) {
            return true;
        }
        return false;
    }
    //判断一个数是否为回文数，回文数是指一个数逆序之后和原来的数相等
    public static boolean isPalindrome(int num) {
        if( num == getReverse(num)) {
            return true;
        }
        return false;
    }

    public static int getReverse(int num) {
        int result = 0;
        int r=0;
        while( num != 0) {
            r=num%10;
            result = result*10 + r;
            num /= 10;
        }
        return result;
    }

    public static boolean isPrime( int num ) {
        if(num<2) {
            return false;
        }
        for( int x=2; x<num; x++) {
            if( num%x==0 ){
                return false;
            }
        }
        return true;
    }

}