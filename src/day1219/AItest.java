package day1219;

import java.util.Scanner;

/**
 * @author taoxuefeng
 * @create 2018-12-19 15:40
 * @desc
 **/

public class AItest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = sc.next();
            str = str.replace("吗","");
            str = str.replace("?","!");
            str = str.replace("？","！");
            System.out.println(str);
        }

    }
}
