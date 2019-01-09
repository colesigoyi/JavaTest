/*
从键盘输入一个整数，逆序数出
输入：12           输出：21
输入：123          输出：321
输入：1234         输出：4321
输入：12345        输出：54321
就是分别把个位，十位，百位，千位等个位的数字取出来
        个位：     num % 10
        十位：     num / 10 % 10
        百位：     num / 10 / 10 % 10
        千位：     num / 10 /10 /10 % 10
 */
import java.util.Scanner;
class Demo64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();

        String res = "";            //保存逆序之后的各个数值

        //如果是负数，先把负号打印出来，把负数变为整数

        if ( num < 0){
//          System.out.print("-");
            res = res + "-";
            num = -1 * num;
        }

        while( num != 0) {
            int r = num % 10;
//          System.out.print( r );
            res += r;
            num = num / 10;
        }
        System.out.println("逆序后：" + res);
    }
}
