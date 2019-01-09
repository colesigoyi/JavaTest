/*
    从键盘上输入一个数字（1~7）代表今天星期几，输入间隔的天数n，输出n天后是星期几
    5
    间隔天数：1   输出：星期六
            2   输出：星期日
            3   输出：星期一
 */
import java.util.Scanner;

class Demo40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字（1~7）代表今天星期几");
        int dayNum = sc.nextInt();

        System.out.println("请输入间隔的天数n");
        int n = sc.nextInt();

        //计算
        int destNum = (dayNum + n) % 7;     //对7求余

        //判断星期几
        switch ( destNum ){
            case 0:
                System.out.println("星期日");
                break;
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
        }
    }
}
