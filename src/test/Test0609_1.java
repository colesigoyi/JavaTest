package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-09 22:18
 * @ desc: 多态
 **/

public class Test0609_1 {
    public static void main(String[] args) {
        //HomeChicken hc = new HomeChicken("小鸡鸡");
        //用父类的引用指向子类对象（用大的类型表示小的类型）
        Chicken1 hc = new HomeChicken("小鸡鸡");
        hc.eat();

        //YeChicken yc = new YeChicken("大鸡鸡");
        Chicken1 yc = new YeChicken("大鸡鸡");
        yc.eat();

        //hc = yc;
        //hc.eat();
        eat(hc);
        eat(yc);
    }
    //抽象（粒度）面相抽象编程（或者面相接口编程），好处是扩展方便
    public static void eat(Chicken1 c){
        System.out.println("鸡吃饭");
        c.eat();
    }
}
abstract class Chicken1{
    private String name;
    public Chicken1(){}

    public Chicken1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}

class HomeChicken extends Chicken1{
    public HomeChicken(String name){
        super(name);
    }
    public void eat(){
        System.out.println(this.getName() + ",我爱吃米");
    }
}

class YeChicken extends Chicken1{
    public YeChicken(String name){
        super(name);
    }
    public void eat(){
        System.out.println(this.getName() + "，我爱吃虫子");
    }
}