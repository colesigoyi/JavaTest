
/*
    从键盘上读取一个字符，判断这个字符是否为英文字母
    a~z A~Z
 */
import java.util.Scanner;

class Demo21{
    public static void main(String[] args){
        //从键盘上读取一个字符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符：");
        String str = sc.next();
        char cc = str.charAt(0);

        //判断这个字符是否为字母
//      if ((65 <= cc <= 90) || (97 <= cc <=122)){        //Error: 二元运算符 '<=' 的操作数类型错误
//      if ((65 <= cc && cc <= 90) || (97 <= cc && cc <=122)){
        if (('A' <= cc && cc <= 'Z') || ('a' <= cc && cc <='z')){
            System.out.println("输入了英文字母：" + cc);
        }
        else {
            System.out.println("输入的不是英文字母！");
        }
        System.out.println();
    }
}