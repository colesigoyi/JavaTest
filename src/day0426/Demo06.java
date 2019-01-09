package day0426;

import java.util.Scanner;

/*
定义一个有多个参，数没有返回值的方法
 */
class Demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int a = sc.nextInt();
        System.out.print("请输入第二个数：");
        int b = sc.nextInt();
        max(a,b);       //把变量a的值传递给了num1，把变量b的值传递给了num2
    }
    /*
    定义一个方法，把两个整数的较大者打印到屏幕上
    不需要返回值，返回值类型就用void表示
    求两个整数的较大者，需要通过两个参数来接受，参数之间用逗号隔开
     */
    public static void max(int num1, int num2) {
        if(num1 > num2){
            System.out.println("其中最大值为：" + num1);
        }else {
            System.out.println("其中最大值为：" + num2);
        }
    }
}
