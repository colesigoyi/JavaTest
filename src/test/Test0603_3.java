package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-03 12:20
 * @ desc: 构造方法：构造方法是在类中定义，
 *         构造方法的定义格式：方法名与类名相同，无返回值类型的声明
 *         1、构造方法就是类构造对象时调用的方法，用于对象的初始化工作
 *         2、构造方法就是实例化一个类的对象时，也就是new的时候，最先调用的方法
 **/

public class Test0603_3 {
    public static void main(String[] args) {
        Dog dog = new Dog();//new的时候初始化：可以传参数
        Dog dog1 = new Dog("小黄",7);
    }
}
class Dog {
    //默认构造方法，若有带参的构造方法，默认的就不起作用
    //通常有其他构造方法时，要保留默认构造方法，有些框架要调用默认的构造方法，使用反射创建对象
    public Dog(){
        //System.out.println("构造方法执行");
    }
    public Dog(String name){
        this.name = name;
        System.out.println("带一个参数的构造方法执行");
    }
    public Dog(String name, int age){
        this(name);//调用带一个参数的构造方法,调用其它构造方法时只能放在第一行，限制了只能调用一次
                    //调用别的方法时要有出口，防止相互调用死循环
        //this.name = name;
        this.age = age;
        System.out.println("带两个参数的构造方法执行了");
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}