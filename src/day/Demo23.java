/*
从键盘输入一个正数，判断这个数的奇偶性
 */

import java.util.Scanner;

class Demo23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正数：");
        int num = sc.nextInt();
        if ( num > 0){
            if ( num % 2 == 0) {
                System.out.println(num + "是偶数。");
            }
            else {
                System.out.println(num + "是奇数。");
            }
        }
        else {
            System.out.println("输入的数字有误！");
        }
    }
}
