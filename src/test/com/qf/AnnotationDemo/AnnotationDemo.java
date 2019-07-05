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
        //cat.printInfo();//调用一个已经过时的方法，不建议使用


        List list = new ArrayList();
        list.add("abc");
        list.add(10);
        list.add(10.1f);

    }
    //反射来处理注解
    @Test
    public void test2(){
        Class<Cat> catClass = Cat.class;
        //获取类上指定的注解
        MyAnnotation annotation = catClass.getAnnotation(MyAnnotation.class);
        //获取注解上变量的值
        String name = annotation.name();
        Color color = annotation.color();
        String[] like = annotation.like();
        int age = annotation.age();

        try {
            Cat cat = catClass.newInstance();
            cat.setName(name);
            cat.setAge(age);
            cat.setColor(color);
            cat.setLike(like);
            System.out.println(cat);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
