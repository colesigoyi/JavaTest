package test.com.qf.API.MathAndRandom;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-17 18:49
 * @ desc: Date类
 **/

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        //java.sql.Date sqlDate = new java.sql.Date();两个相同名类，第二个需要全名
        System.out.println(date);

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = new GregorianCalendar();

        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH);
        int day = c1.get(Calendar.DAY_OF_MONTH);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int minute = c1.get(Calendar.MINUTE);
        int second = c1.get(Calendar.SECOND);
        int milliSecond = c1.get(Calendar.MILLISECOND);

        StringBuilder sb = new StringBuilder(50);
        sb.append(year).append("年").append(month).append("月").append(day).append("日")
                .append(hour).append(":").append(minute).append(":").append(second).append(" ")
                .append(milliSecond);
        System.out.println(sb.toString());

        //日期格式化
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        String nowDate = df.format(date);
        System.out.println(nowDate);
    }
}
