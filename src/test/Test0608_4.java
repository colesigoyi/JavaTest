package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-08 14:13
 * @ desc: 接口
 **/

public class Test0608_4 {
    public static void main(String[] args) {
        Girl mm = new Girl("马丽");
        mm.eat();
        mm.run();
        mm.sleep();
    }
}

interface IEat{
    //public abstract void eat();//接口中只能定义抽象方法
    void eat();//简写方式,在接口中定义的方法没有声明修饰符，默认为piblic abstract
    //public static final int NUM = 10;//在接口中定义一个常量
    int NUM = 10;//简写方式

    //JDK1.8后新特性，可以被所有实现类继承
    public default void print(){
        System.out.println("eat");
    }
}
interface IRun{
    void run();
}
//接口之间可以多继承（注意：类只能单继承）
interface ISleep extends IEat, IRun{
    void sleep();
}

//具体类实现接口必须实现接口的所有方法
class Girl implements ISleep, IEat{
    private String name;

    public Girl(){}

    public Girl(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("我是" + name + "，我爱吃");
    }

    @Override
    public void run() {
        System.out.println("吃完就跑");
    }

    @Override
    public void sleep() {
        System.out.println("我爱睡觉");
    }
}