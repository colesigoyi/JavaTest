package test.com.qf.EnumDemo;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-07-01 10:54
 * @ desc: 枚举
 **/

public class EnumDemo {
    public static final int RED = 0x1;
    public static final int GREEN = 0x2;
    public static final int BLUE = 0x3;
    public int color;
    @Test
    public void test1(){
        color = RED;
        color = 4;
    }


    public Color colorEnum;
    @Test
    public void test2(){
        //colorEnum = Color.RED;
        //colorEnum = Color.BLUE;
        colorEnum = Color.GREEN;
        System.out.println(colorEnum);
        System.out.println(colorEnum.name());
        System.out.println(colorEnum.ordinal());
        System.out.println(colorEnum.toString());

        Color[] values = Color.values();
        System.out.println(Arrays.toString(values));//[RED, GREEN, BLUE]

    }
}
