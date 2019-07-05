package test.com.qf.AnnotationDemo;

import java.lang.annotation.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-07-05 15:29
 * @ desc: 自定义注解
 **/
@Documented//表示生成文档
@Retention(RetentionPolicy.RUNTIME)//适用范围
@Target(ElementType.TYPE)//只能用在类或者接口使用
@SuppressWarnings("all")
@Inherited//子类可以继承
public @interface MyAnnotation {
    //定义变量
    public String name();
    public int age() default 2;//给变量设置默认值
    public String[] like();//定义一个数组变量
    public Color color();//定义一个枚举类型的变量
}
