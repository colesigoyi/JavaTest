/*
    if条件可以使一个逻辑表达式
    从键盘上输入一个年份，判断这一年是不是闰年
 */
import java.util.Scanner;

class Demo20 {
    public static void main(String[] args) {
        //从键盘上输入一个年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();

        //判断这一年是否为闰年
        //闰年的条件：能被4整除但是不能被100整除，或者能被400整除
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + "是闰年");
        else
            System.out.println(year + "不是闰年");
    }
}
