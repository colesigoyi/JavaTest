package test;

/**
 * @ program: java_test
 * @ author:  TaoXueFeng
 * @ create: 2019-06-01 19:44
 * @ desc: 方法的重载
 **/

public class Test0601_3 {
    public static void main(String[] args) {
        System.out.println(add(1,1));
        System.out.println(add(1.3,2.5));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
}
