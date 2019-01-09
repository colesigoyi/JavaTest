package day0427;

import java.util.Scanner;

/*
定义一个方法，判断一个数是否为回文素数，回文素数指的是一个数同时为素数和回文数
如131是一个素数，同时也是一个回文数
 */
class Demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num = sc.nextInt();
        if(isPrimePalindromeNumber(num) == true) {
            System.out.println(num + "是回文素数。");
        }else {
            System.out.println(num + "不是回文素数。");
        }
    }

    public static  boolean isPrimePalindromeNumber(int num) {
        if (isPrime(num) && isPalindrome(num)) {
            return true;
        }
        return false;
    }
    //判断一个数是否为回文数，回文数是指一个数逆序之后和原来的数相等
    private static boolean isPalindrome(int num) {
        if( num == getReverse(num)) {
            return true;
        }
        return false;
    }

    private static int getReverse(int num) {
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
