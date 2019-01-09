package day913;

/**
 * @author taoxuefeng
 * @create 2018-09-25 上午1:03
 * @desc
 **/

import java.util.*;
import java.text.SimpleDateFormat;
public class Demo04 {
    public static void main(String[] args) {
        Date origntime = new Date();
        SimpleDateFormat format01 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format01.format(origntime.getTime());
        System.out.println("当前时间：" + time);
    }
}
