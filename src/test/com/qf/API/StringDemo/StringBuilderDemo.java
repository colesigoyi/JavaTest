package test.com.qf.API.StringDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-17 15:33
 * @ desc: StringBuilder操作
 **/

public class StringBuilderDemo {
    public static void main(String[] args) {

        //面试题：StringBuffer与StringBuilder的区别
        //      StringBuffer线程安全，性能低，在多线程中使用
        //      StringBuilder线程不安全，性能高，适合在单线程中使用，这种情况占多数
        StringBuilder sb = new StringBuilder();

        /**
        字符串相加操作
        1、多个常量相加没有性能问题，在编译期优化
        2、变量与常量相加，会产生多个垃圾对象
        **/

        String a = "a" + 1;
        String b = a + "b";

        String c = null;
        for(int i=0; i<5; i++){
            c+=1;//每次循环会产生一个StringBuilder对象，实现拼接性能低，最好是手动创建StringBuilder来拼接
        }

        /**
        1、字符串相加，在编译后，会使用StringBuilder来优化代码，实现拼接
         **/

    }
}
