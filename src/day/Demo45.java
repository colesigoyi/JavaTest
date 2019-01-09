/*
输入日期，输出这个日期对应的这一年的第几天
输入：2017 1 5 输出： 5
输入：2017 2 5 输出： 5 + 31
输入：2017 3 5 输出： 5 + 28 + 31
 */
import java.util.Scanner;

class Demo45 {
    public static void main(String[] args) {
        //输入日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个日期");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        //计算
        int sumDays = 0;        //保存输入的日期时间年的额第几天

        switch (month){         //利用case的穿透性进行累加计算
            case 12:
                sumDays += 31;
            case 11:
                sumDays += 30;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:             //3月，需要累加2月份天数
                if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    sumDays += 29;
                }
                else {
                    sumDays += 28;
                }
            case 2:             //2月，需要把1月的天数累加
                sumDays += 31;
            case 1:             //累加当月的天数
                sumDays += day;
        }

        //输出
        System.out.println(year + "年" + month + "月" + day + "日是今年的第" + sumDays + "天。");
    }
}
