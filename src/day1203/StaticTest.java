package day1203;

/**
 * @author taoxuefeng
 * @create 2018-12-03 18:01
 * @desc 测试static关键字
 **/
import org.junit.Test;

import java.util.*;
import java.util.stream.StreamSupport;

public class StaticTest {
    final static double PI = 3.1415926;
    static int id;

    public static void method_1() {
        System.out.println("方法一执行");
    }

    @Test
    public void method_2() {
        id = 1;
        System.out.println(StaticTest.PI);
        System.out.println(StaticTest.id);
        StaticTest.method_1();
    }

}
