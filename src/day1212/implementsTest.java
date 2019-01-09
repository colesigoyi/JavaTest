package day1212;

/**
 * @author taoxuefeng
 * @create 2018-12-12 14:58
 * @desc 测试接口练习
 **/

import java.util.*;
import java.sql.*;
import static java.lang.Math.max;
import static java.lang.System.out;

class Test {
    int i=0;
}
public class implementsTest implements draw{
    //测试完整类包名称
    java.sql.Date date1 = new java.sql.Date(233);
    java.util.Date date2 = new java.util.Date();
    final double PI = 3.1415926;
    static Random rand = new Random();
    int i_1 = rand.nextInt(20);
    int i_2 = rand.nextInt(20);
    public String toString() {
        return i_1 + " " + i_2 + " ";
    }

    @Override
    public void draw() {
        System.out.println("调用接口draw");
    }
    public static void main(String[] args) {
        implementsTest im = new implementsTest();

        im.draw();
        out.println("1和4比较，最大的为：" + max(1,4));
        //PI = 8.8;
        System.out.println(im.toString());
    }

}

interface draw{
    public void draw();
        }

final class FinalTest {
    int a=0;
    void doit() {
    }
    public static void main(String[] args) {
        FinalTest f = new FinalTest();
        f.a++; //因为变量a不是final
        System.out.println(f.a);
    }
}