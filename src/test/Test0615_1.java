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

        String num1 = "12";
        int i5 = Integer.parseInt(num1);

    }
}
