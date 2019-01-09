package day0427;

import java.util.Scanner;

/*
定义一个方法，求某范围内所有素数之和
 */
class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个数：");
        int b = sc.nextInt();
        System.out.println(a +"到" + b + "之间的素数之和为：" + sumPrime(a, b));
    }

    public static int sumPrime(int from, int to) {
        int sum = 0;
        for(int x = from; x<=to; x++) {
            if(isPrime(x)) {
                sum += x;
            }
        }
        return sum;
    }
    //判断一个数是否为素数
    private static boolean isPrime(int num) {
        if(num<2) {
            return false;
        }
        //如果从2到num-1有某个数能把他整除，就不是素数
        for(int i=2; i<num; i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}
