package test.com.qf.API;

import java.util.Arrays;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-16 22:55
 * @ desc: String操作
 **/

public class Test0616_String {
    public static void main(String[] args) {
        String str = " abcdefgabc 12312345 ";
        char c = str.charAt(1);
        System.out.println(c);//b

        System.out.println(str.toCharArray());//遍历数组，以字符数组的形式

        char[] cs = {'a', 'b', 'c'};
        String s = new String(cs);

        String s2 = new String(cs, 0, 1);
        System.out.println(s2);

        System.out.println(Arrays.toString(str.getBytes()));//[97, 98, 99, 100, 101, 102, 103, 97, 98, 99, 49, 50, 51, 49, 50, 51, 52, 53]

        System.out.println(str.replace('b','B'));

        System.out.println(str.replaceAll("\\d","*"));

        System.out.println(str.substring(0,4));//截取

        System.out.println(Arrays.toString(str.split("d",2)));

        System.out.println(str.contains("2"));//是否包含某字符串

        System.out.println(str.indexOf("f"));//从头查找是否存在，显示第一个位置

        System.out.println(str.lastIndexOf("g"));//从后往前找

        System.out.println(str.isEmpty());//是否为空

        System.out.println(str.length());//长度

        System.out.println(str.trim());//去掉开头和结尾的空格

        System.out.println(str.concat("****"));//与字符串拼接

        System.out.println(str.valueOf(true));//转换成字符串
    }
}
