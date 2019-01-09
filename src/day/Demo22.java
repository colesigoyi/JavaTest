/*
    从键盘上输入一个三位整数，判断这个数是否为水仙花数
    如果一个三位正整数等于各位数字的立方和，这个数就是水仙花数
    153 == 1*1*1 + 5*5*5 + 3*3*3
 */
import java.util.Scanner;

class Demo22 {
    public static void main(String[] args){
        //从键盘上输入一个三位正整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位正整数");
        int num = sc.nextInt();
        if (num >=100 && num <=999){
            int a = num % 10;
            int b = num/10 %10;
            int c = num/100;

            if (num == a*a*a + b*b*b +c*c*c){
                System.out.println(num + "是水仙花数");
            }
            else {
                System.out.println(num + "不是水仙花数");
            }
        }
        else {
            System.out.println("输入的数字有误！");
        }
    }
}
