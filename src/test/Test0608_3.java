package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-08 13:53
 * @ desc: 抽象类:使用abstract关键字声明的类称为抽象类
 *              很多具有相同特征和行为的对象可以抽象伟一个类
 *              很多具有相同特征和行为的类可以抽象为一个抽象类
 *         抽象类规则：
 *          1、抽象类可以没有抽象方法，有抽象方法的类必须是抽象类
 *          2、非抽象类继承抽象类必须实现所有抽象方法
 *          3、抽象类可以继承抽象类，可以不实现父类抽象方法
 *          4、抽象类可以有实现方法和属性
 *          5、抽象类不能被实例化
 *          6、抽象类不能声明final，final类不能被继承
 *          7、抽象类可以有构造方法
 **/

public class Test0608_3 {
    public static void main(String[] args) {
        Man man = new Man();
        man.eat();
        man.move();
        Woman woman = new Woman();
        woman.eat();
        woman.move();
    }
}

abstract class Animal{
    public abstract void move();//方法的声明，抽象方法只有声明，没有实现
}
//规则3：抽象类可以继承抽象类，可以不实现父类抽象方法
abstract class Person0608 extends Animal{
    public abstract void eat();
    //规则1：抽象类可以没有抽象方法，有抽象方法的类必须是抽象类
    public void sleep(){
        System.out.println("睡觉");
    }
}
//继承抽象类的具体类必须实现所有抽象方法
class Man extends Person0608{

    public void move() {
        System.out.println("男人在跑步");
    }
    public void eat(){
        System.out.println("男人在吃");
    }
}
class Woman extends Person0608{

    public void move() {
        System.out.println("女人在跑步");
    }
    public void eat(){
        System.out.println("女人在吃");
    }
}