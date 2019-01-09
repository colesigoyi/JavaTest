/*
从键盘输入一个整数，逆序数出
 */
import java.util.Scanner;
class Demo65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();

        int res = 0;            //保存逆序之后的数值

        //如果是负数，先把负号打印出来，把负数变为整数


        while( num != 0) {
            int r = num % 10;
            //构建新的整数
            res = res * 10 + r;
            num = num / 10;
        }
        System.out.println("逆序后：" + res);
    }
}