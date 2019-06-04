package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-05 01:00
 * @ desc: 单例设计模式：保证一个类中仅有一个实例，并提供一个全局访问它的全局访问点
 *                  1.构造方法私有化
 *                  2.声明一个本类对象
 *                  3.给外部提供一个静态方法获取对象实例
 *         两种实现方式：1.饿汉式:在类被加载后，对象被创建，到程序结束后释放
 *                    2.懒汉式：在第一次调用getInstance方法时被创建，到程序结束后被释放
 *         在项目中为什么使用单例，单例的好处是什么？
 *         1.在设计一些工具类时（通常工具类只有功能方法，没有属性，new多个对象和一个没区别）
 *         2.工具类可能会被频繁调用
 *
 *         目的：是为了节省重复创建对象所带来的内存消耗，从而来提高效率
 *
 *         能不能使用构造方法私有化+静态方法来替代单例？
 *
 **/

public class Test0604_5_designMode {
    public static void main(String[] args) {
        //Singleton1 s = new Singleton1();
        Singleton1 s = Singleton1.getInstance();//调用方法获得对象
        s.print();
        Singleton1 s1 = Singleton1.getInstance();//调用方法获得对象
        s1.print();

        System.out.println(s == s1);//true

        Singleton2 s2 = Singleton2.getInstance();//调用方法获得对象
        s.print();
        Singleton2 s22 = Singleton2.getInstance();//调用方法获得对象
        s1.print();

        System.out.println(s2 == s22);//true
    }
}

//饿汉式：占用内存时间长，提高效率
class Singleton1{
    private Singleton1(){
    }
    private static Singleton1 s = new Singleton1();
    public static Singleton1 getInstance(){//getInstance获取实例
        return s;
    }
    public void print(){
        System.out.println("测试方法");
    }
}
//懒汉式：占用内存时间短，效率稍低（懒加载，延迟加载）建议用懒汉式
//多线程访问时会有安全问题
class Singleton2{
    private Singleton2(){};
    private static Singleton2 s;

    public static Singleton2 getInstance(){
        if(s==null){
            s = new Singleton2();
        }
        return s;
    }
    public void print(){
        System.out.println("测试方法");
    }
}
//使用构造方法私有化+静态方法来实现工具类，比如Math，
class Tools{
    private Tools(){}
    public static void print1(){

    }
    public static void print2(){

    }
}
