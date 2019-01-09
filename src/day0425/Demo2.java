package day0425;

import java.util.Scanner;

/*
输入两个数n和a，如n==4，a==3，求3 + 33 + 333 + 3333的和
 */
class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数n和a");
        int n = sc.nextInt();
        int a = sc.nextInt();

        int sum = 0;        //保存累加和
        int num = 0;        //保存每次需要累加的数

        for(int x=0; x<n; x++){
            //先构建需要累加的数
            num = num*10 + a;

            sum += num;
        }
        System.out.println("sum=="+ sum);
    }
}
