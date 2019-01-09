package day0429;

import java.util.Scanner;

/*
打印万年历
 */
class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//从键盘上接受年月
        System.out.print("请输入年数：");
        int year = sc.nextInt();
        System.out.print("请输入月数：");
        int month = sc.nextInt();
        getPrintCalendar(year, month);//打印这个月的日历

    }
    //打印指定日期的日历
    private static void getPrintCalendar(int year, int month) {
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        //这个月的第一天是星期几
        int fromDay = getWeekDay(year, month);

        //打印这个月第一天之前的空白
        for(int i=1; i<=fromDay; i++) {
            System.out.print("\t");
        }

        int count = fromDay;    //定义变量统计打印的天数
        //打印这个月的第一天
        for(int day=1; day<=getDaysOfMonth(year, month); day++) {
            System.out.print(day + "\t");
            count++;            //统计
            //判断是否换行
            if(count%7==0){
                System.out.println();
            }
        }
    }
    //返回year年month月day天是星期几，数字0代表星期日，1~6代表星期一~星期六
    private static int getWeekDay(int year, int month) {
        //先计算1900年1月1日到指定year年month月day天共多少天
        int sum = getDaysFrom19000101(year, month);
        return sum%7;
    }

    //计算1900-1-1到year-month-day总共多少天
    private static int getDaysFrom19000101(int year, int month) {
        int sum = 0;
        //1）先计算1900-1-1到year-1年12月31日共多少天
        for(int y=1900; y<year; y++) {
            sum += getDaysOfYear(y);    //累加每年的天数
        }
        //2）再加上当年的天数
        sum += getDaysToDateInCurrentYear(year, month);
        return sum;
    }
    //计算当年从1月1日到指定的month月day日共多少天
    private static int getDaysToDateInCurrentYear(int year, int month) {
        int sum = 0;
        //累加前month-1个月的天数
        for( int m=1; m<month; m++) {
            sum += getDaysOfMonth(year, m);
        }
        //累加当月的天数
        return sum + 1;
    }
    //计算year年m月有多少天
    private static int getDaysOfMonth(int year, int m) {
        switch (m) {
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
    //计算每年的天数
    private static int getDaysOfYear(int y) {
        if(isLeapYear(y)) {
            return 366;
        }
        return 365;
    }
    //判断某一年是否为闰年
    private static boolean isLeapYear(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }
}
