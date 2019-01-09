/*
 * 从键盘上输入一个整数，判断它是正数，负数，0
 *
 * @TaoXueFeng
 * @create 2018-01-23 下午8:14
 **/
import java.util.Scanner;

class Demo29 {
    public static void main(String[] args) {
        //从键盘上输入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        //判断它是正数，负数，0
        if (num > 0){
            System.out.println(num + "是正数");
        }
        else if (num < 0){
            System.out.println(num + "是负数");
        }
        else {
            System.out.println(num + "是0");
        }
    }
}

