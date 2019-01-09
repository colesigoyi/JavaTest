package day1216;

import java.util.Date;

/**
 * @author taoxuefeng
 * @create 2018-12-16 17:15
 * @desc 字符串练习
 **/

public class Stringtest {
    public static void main(String[] args) {
        Date date = new Date();
        String day = String.format("%tT",date);
        System.out.println(day);
        String str = "abcAbcBC";
        String low_str = str.toLowerCase();
        String Upp_str = str.toUpperCase();
        System.out.println(low_str + "\n" + Upp_str);
    }
}
