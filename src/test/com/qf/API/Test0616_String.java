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
        String str = "abcdefg";
        char c = str.charAt(1);
        System.out.println(c);//b

        System.out.println(str.toCharArray());//遍历数组，以字符数组的形式

        char[] cs = {'a', 'b', 'c'};
        String s = new String(cs);

        String s2 = new String(cs, 0, 1);
        System.out.println(s2);

        System.out.println(Arrays.toString(str.getBytes()));//[97, 98, 99, 100, 101, 102, 103]

    }
}
