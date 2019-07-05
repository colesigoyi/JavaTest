package test.com.qf.AnnotationDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-07-05 15:29
 * @ desc: 自定义注解
 **/

public @interface MyAnnotation {
    //定义变量
    public String name();
    public int age() default 2;//给变量设置默认值
    public String[] like();//定义一个数组变量
    public Color color();//定义一个枚举类型的变量
}
