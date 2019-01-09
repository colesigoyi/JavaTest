/*
    从键盘上输入一个1~7之间的数字，输出这个数字对应星期几
 */
import java.util.Scanner;

class Demo33 {
    public static void main(String[] args) {
        //从键盘上输入一个1~7之间的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1~7之间的数字");
        int num = sc.nextInt();
        int x = 2;
        //判断星期几
        String weekday = "";        //保存数字对应的星期几
        switch ( num ) {
            case 1:
                weekday = "星期一";
                break;
//          case x:                 //x为变量
            case 2:
                weekday = "星期二";
                break;
            case 3:
                weekday = "星期三";
                break;
            case 4:
                weekday = "星期四";
                break;
            case 5:
                weekday = "星期五";
                break;
            case 6:
                weekday = "星期六";
                break;
            case 7:
                weekday = "星期日";
                break;
            default:
                weekday = "你输入的数字不合理";
        }
        System.out.println( weekday );
    }
}
