/*
    输入一个年和月，输出该月对应的天数
 */
import java.util.Scanner;

class Demo35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年和月");
        int year = sc.nextInt();
        int month = sc.nextInt();

        //判断这个月的天数
        int days = 0;           //保存某个月的天数
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                //如果是闰年就是29天，否则28天
                if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    days = 29;
                }
                else {
                    days = 28;
                }
                break;
            default:
                System.out.println("你输入的月份有误");
                break;
        }
        System.out.println( year + "年" + month + "月总共有" + days + "天" );
    }
}
