package test.com.qf.BigNumberDemo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-18 14:27
 * @ desc: 大整数
 **/

public class Test {
    public static void main(String[] args) {

        //大整数运算
        String val1 = "78234982734982748927498234";
        String val2 = "78234423662347234656498234";
        BigInteger b1 = new BigInteger(val1);
        BigInteger b2 = new BigInteger(val2);

        System.out.println(b1.add(b2));//+156469406397329983583996468
        System.out.println(b1.subtract(b2));//-
        System.out.println(b1.multiply(b2));//*
        System.out.println(b1.divide(b2));// /除
        System.out.println(b1.remainder(b2));//%取余
        System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));// / and %

        String val3 = "78234.982734982748927498234";
        String val4 = "2";
        BigDecimal b3 = new BigDecimal(val3);
        BigDecimal b4 = new BigDecimal(val4);

        System.out.println(b3.add(b4));//+156469406397329983583996468
        System.out.println(b3.subtract(b4));//-
        System.out.println(b3.multiply(b4));//*
        System.out.println(b3.divide(b4));// /除  Non-terminating decimal expansion; no exact representable decimal result.
        //System.out.println(b3.scale() - b4.scale());
        System.out.println(b3.remainder(b4));//%取余
        System.out.println(Arrays.toString(b3.divideAndRemainder(b4)));// / and %

        double pi = 3.1415926;
        //取一位整数，结果：3
        System.out.println(new DecimalFormat("0").format(pi));
        //取一位整数和两位小数，结果3.14
        System.out.println(new DecimalFormat("0.00").format(pi));
        //取两位整数和三位小数，整数不足部分以0填补，结果：03.142
        System.out.println(new DecimalFormat("00.000").format(pi));
        //取所有整数部分，结果：3
        System.out.println(new DecimalFormat("#").format(pi));
        //以百分比方式计数，并取两位小数，结果：314.16%
        System.out.println(new DecimalFormat("#.##%").format(pi));

        long num = 234252342;
        System.out.println(new DecimalFormat("###,###").format(num));//234,252,342


    }
}
