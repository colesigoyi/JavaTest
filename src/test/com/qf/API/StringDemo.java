package test.com.qf.API;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 21:00
 * @ desc: String字符串操作
 **/

public class StringDemo {
    public static void main(String[] args) {
        //String两种赋值方式
        //1、直接赋值(推荐使用第一种方式)
        String s1 = "String";//在常量池创建
        //2、使用new关键字创建对象，new表示申请内存空间

        //面试题：以下代码创建了几个对象？2个对象
        String s2 = new String("String");//在堆中创建

        System.out.println(s1==s2);//false
    }
}
