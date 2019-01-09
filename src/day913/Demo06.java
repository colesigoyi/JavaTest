package day913;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author taoxuefeng
 * @create 2018-09-27 上午12:40
 * @desc
 **/

public class Demo06 {
    public static void main(String[] args) {
        String today_time = getTime01();
        System.out.println(today_time);
        int returnfinally = checkFinally();
        System.out.println(returnfinally);

    }

    public static String getTime01() {
        Calendar cal = Calendar.getInstance();
        //long millis = Calendar.getInstance().getTimeMillis();
        int year = cal.get(Calendar.YEAR);
        int mounth = cal.get(Calendar.MONTH);
        int hour_of_day = cal.get(Calendar.HOUR_OF_DAY);
        int date = cal.get(Calendar.DATE);
        String str = "时间段";
        if(rangeInDefined(hour_of_day, 0, 5)){
            str = "凌晨";
        }else if(rangeInDefined(hour_of_day, 6, 9)) {
            str = "上午";
        }else if(rangeInDefined(hour_of_day, 10, 14)) {
            str = "中午";
        }else if(rangeInDefined(hour_of_day, 15, 18)) {
            str = "下午";
        }else if(rangeInDefined(hour_of_day, 19, 21)) {
            str = "晚上";
        }else if(rangeInDefined(hour_of_day, 21, 24)) {
            str = "深夜";
        }
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        String time_message = year
                                + "年" + mounth
                                + "月" + date
                                + "日 " + str
                                + " " + hour_of_day
                                + ":" + minute
                                + ":" + second;
        return time_message;
        //System.out.println(time_message);

    }
    public static boolean rangeInDefined(int current, int min, int max)
    {
        return Math.max(min, current) == Math.min(current, max);
    }
    @Test
    public void changeFormat() throws UnsupportedEncodingException {
        String s1 = "你好";
        String s2 = new String(s1.getBytes("GB2312"),"ISO-8859-1");
        System.out.println(s2);
    }
    @Test
    public void getRandomNumber() {
        Random randomNumber = new Random();
        for(int j=1; j<6; j++) {
            System.out.print("第" + j + "排随机数：");
            for(int i=1; i<10; i++) {
                String num = randomNumber.nextInt(100) + "  ";
                System.out.print(num);
            }
            System.out.print("\n");
        }
    }
    @Test
    public void getTime02() {
        Date origntime = new Date();
        SimpleDateFormat format01 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String time = format01.format(origntime.getTime());
        System.out.println("当前时间：" + time);
    }
    public static int checkFinally() {
        try {
            int a = 1/0;
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

}

