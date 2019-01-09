/*
从键盘上输入正数和负数，分别统计正数和负数的个数，并计算所有数之和，输入0表示结束
 */
import java.util.Scanner;

class Demo51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;            //用来保存输入的正整数
        int count1 = 0;
        int count2 = 0;
        int sum = 0;

        while (num != 0){
            System.out.println("请输入一个数,输入0结束");
            num = sc.nextInt();
            sum = sum + num;
            if (num < 0){
                count1++;
            }else if(num > 0) {
                count2++;
            }
        }
        System.out.println("正数个数为：" + count2 + "，负数个数为：" + count1);
        System.out.println("sum=" + sum);
    }
}
