package test.com.qf.MathAndRandom;

import static java.lang.Math.floor;//静态导入,直接使用
/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-17 18:09
 * @ desc: math类
 **/

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.abs(-10));//绝对值
        System.out.println(Math.random());//0-1随机数
        System.out.println(Math.round(Math.random()*100));//0-100随机数
        System.out.println(Math.round(Math.random()*1000)/1000.0);//保留三位小数
        System.out.println(Math.sqrt(2));//求平方根

        System.out.println(floor(1.23456));//静态导入，直接使用

    }
}
