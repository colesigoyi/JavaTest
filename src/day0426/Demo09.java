package day0426;
/*
定义一个方法，有多个参数，有返回值
一个类中可以定义多个方法
 */
import java.util.Scanner;

class Demo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = sc.nextInt();
        if(year>0) {
            System.out.print("请输入月份：");
            int month = sc.nextInt();
            if (month > 0 && month < 13) {
                if (isLeapYear(year)) {
                    System.out.println(year + "是闰年。" + month + "月有" + getDaysMouth(year, month) + "天。");
                } else {
                    System.out.println(year + "不是闰年。" + month + "月有" + getDaysMouth(year, month) + "天。");
                }
            } else {
                System.out.println("输入月份有误");
            }
        }
        else {
            System.out.println("输入年份有误");
        }
    }
    /*
    定义方法，返回制定年，月的天数
     */
    public static int getDaysMouth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if( isLeapYear(year)) {
                    return 29;
                }else {
                    return 28;
                }
        }
        return 0;
    }

    /*
    当方法定义时制定的返回值不是void，在方法体中必须保证return一个值
     */
    public static boolean isLeapYear(int year) {
        if( year%4==0 && year%100!=0 ||year%400==0) {
            return true;
        }else {
            return false;
        }
    }
}
