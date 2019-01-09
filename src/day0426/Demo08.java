package day0426;

import java.util.Scanner;

/*
定义一个方法，有一个参数，有返回值
 */
class Demo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        /*
        方法有返回值，需要对方法的返回值进行处理
         */
        System.out.println( isPrime(num));
        //把1~100之间所有素数打印到屏幕上
        for( int i = 1; i <=100; i++) {
            if( isPrime( i )) {
                System.out.println( i );
            }
        }

    }
    /*
    判断一个数，是否为素数，如果是素数返回true，不是返回false
    @param num 接受一个整数
    @return 返回num是否为素数
     */
    public static boolean isPrime(int num) {
        //对接受的数进行验证
        if(num < 2) {
            return false;
        }
        for( int x = 2; x<num ; x++) {
            if( num%x==0) {
                return false;
            }
        }

        return true;
    }

}
