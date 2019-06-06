package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-06 17:52
 * @ desc:  继承：继承时从已有的类创建新类的过程
 *              继承一个父类，只能继承非私有的数据（属性和方法）
 *         protected：
 *              访问权限修饰符，在继承关系中使用，在父类中使用protected修饰
 *              的属性或方法可以被子类继承
 *         创建子类对象时，父类的构造方法也会被调用，为什么？
 *              因为子类要使用父类的数据，那么就要通过父类的构造方法来初始化数据
 *              创建子类对象时会调用父类的默认构造方法
 **/

public class Test0606_1 {
    public static void main(String[] args) {
        HomeDog homeDog = new HomeDog("旺财");
        //homeDog.name = "家狗";
        homeDog.print();
    }
}
class Dog1{
    protected String name;
    private String sex;

    public Dog1(){
        System.out.println("我是Dog1的构造方法");
    }
    public void rat(){
        System.out.println("吃饭");
    }
}

class HomeDog extends Dog1{
    public HomeDog(String name){
        this.name = name;
        System.out.println("我是HomeDog的构造方法");
    }
    public void print(){
        System.out.println(name + "很忠诚");
    }
}

class HuskyDog extends Dog1{
    public HuskyDog(){
        System.out.println("我是HuskyDog的构造方法");
    }
    public void show(){
        System.out.println(name + "在表演");
    }
}
