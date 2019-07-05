package test.com.qf.AnnotationDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-07-04 23:32
 * @ desc: 注解
 **/

public class AnnotationDemo {
    public static void main(String[] args) {

    }
    @SuppressWarnings("all")//消除警告信息
    //测试注解
    @Test
    public void test1(){
        Cat cat = new Cat("miaomiao",4);
        cat.printInfo();//调用一个已经过时的方法，不建议使用


        List list = new ArrayList();
        list.add("abc");
        list.add(10);
        list.add(10.1f);

    }
}
