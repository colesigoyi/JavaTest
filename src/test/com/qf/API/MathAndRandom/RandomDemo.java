package test.com.qf.API.MathAndRandom;

import java.util.Random;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-17 18:45
 * @ desc: Random类
 **/

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextLong());
        System.out.println(r.nextInt(10));//10以内的随机数

    }
}
