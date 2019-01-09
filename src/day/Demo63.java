/*
编写一个程序，从键盘上输入一个十进制正整数，输出它的二进制数
    num == 46
    shang = num;
    r = shang % 2;          //r == 0
    shang = shang / 2       //shang == 23
    r = shang % 2;          //r = 1
    shang = shang / 2;      //shang == 11
 */
import java.util.Scanner;

class Demo63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个十进制的正整数");

        int num = sc.nextInt();

        int shang = num;
        int r = 0;
        String res = "";             //保存余数

        while ( shang !=0 ) {
            r = shang % 2;
            res = r + res;          //刚刚求出来的余数应该放在前面
            shang = shang / 2;
        }
        System.out.println(num + "二进制显示为:0b" + res);
    }
}
