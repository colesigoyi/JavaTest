package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 12:41
 * @ desc: 基本数据类型包装类
 **/

public class Test0615_1 {
    public static void main(String[] args) {
        //把基本数据类型转换为包装类，称为自动装箱
        Integer i1 = new Integer(10);//把10装进Integer内，叫做装箱
        //把包装类转换为基本数据类型，称为自动拆箱
        int i2 = i1.intValue();

        Integer i3 = 10;//简写,建议这种方式

        Integer i4 = new Integer("12");
        //把数值字符串转换成int类型
        String num1 = "12";
        int i5 = Integer.parseInt(num1);

        Integer i6 = Integer.valueOf(num1);

        int i7 = Integer.valueOf(num1);//自动拆箱,效率没有parseInt高，多了一步拆箱的过程

        //面试题：
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);
        System.out.println(x1==x2);//比较地址           false：两个对象
        System.out.println(x1.equals(x2));//比较数值    true：重写了equals，数值相等

        Integer x3 = new Integer(128);
        Integer x4 = new Integer(128);
        System.out.println(x3==x4);//比较地址           false：两个对象
        System.out.println(x3.equals(x4));//比较数值    true：数值相等

        Integer x5 = 10;
        Integer x6 = 10;
        System.out.println(x5==x6);//比较地址           true：把一个字节以内的数都做了享元，共享一个
        System.out.println(x5.equals(x6));//比较数值    true：数值相等

        Integer x7 = 128;
        Integer x8 = 128;
        System.out.println(x7==x8);//比较地址           false：超过一个字节就不在享元，是两个对象
        System.out.println(x7.equals(x8));//比较数值    true

    }
}
