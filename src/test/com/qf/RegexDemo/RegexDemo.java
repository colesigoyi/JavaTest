package test.com.qf.RegexDemo;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-30 01:08
 * @ desc: 正则表达式
 **/

public class RegexDemo {
    /**
     * 没有使用正则表达式来检查字符串是否由数字组成
     */
    @Test
    public void test1(){
        String s = "5201314";
        char[] chars = s.toCharArray();
        boolean flag = true;
        for (char aChar : chars) {
            if (aChar < '0' || aChar > '9') {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("是数字组成");
        }else {
            System.out.println("不是数字组成");
        }
    }
    @Test
    public void test2(){
        //创建一个匹配的模板
        Pattern p = Pattern.compile("a*b");
        Matcher matcher = p.matcher("aaaaaaaaab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
    @Test
    public void test3() {
        String s = "5201314";
        boolean b = s.matches("[0-9]+");
        boolean b1 = s.matches("\\d+");
        System.out.println(b + "-" + b1);
    }
}
