package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-07 12:33
 * @ desc: 方法的重写：
 *          面试题：overloading与overriding的区别？
 *                overloading：方法的重载，发生在同一个类中，方法名相同，参数列表不同，返回值无关
 *                overriding：方法的重写，发生在子父类中，方法名相同，参数列表相同，返回值相同，子类的访问修饰符要大于或等于父类的访问修饰符
 *                            子类的异常声明必须小于或等于父类的异常声明，如方法被private,static,final修饰，那么不能被重写
 **/

public class Test0607_1 {
    public static void main(String[] args) throws Exception {
        HomeDog2 homeDog = new HomeDog2("旺财","公");
        //homeDog.name = "家狗";
        homeDog.print();
        homeDog.eat();//代码的重用
        HuskyDog2 husky = new HuskyDog2("拆家王子","公");
        husky.show();
        husky.eat();
    }
}
class Dog2{
    protected String name;
    protected String sex;

    public Dog2(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void eat() throws Exception{//异常声明
        System.out.println("吃饭");
    }
}

class HomeDog2 extends Dog2{
    public HomeDog2(String name,String sex){
        super(name, sex);//只能在第一句，只能调一次
        this.name = name;
        System.out.println("我是HomeDog的构造方法");
    }
    public void print(){
        //super.属性 表示调用父类的属性，如果是继承过来的属性，那么super可以省略
        System.out.println(name + "很忠诚");
    }
    //重写父类的方法
    public void eat() throws Exception{
        System.out.println(name + "喜欢吃骨头");
    }
}

class HuskyDog2 extends Dog2{
    public HuskyDog2(String name, String sex){
        super(name,sex);
        //super(name, sex);
        System.out.println("我是HuskyDog的构造方法");
    }
    public void show(){
        System.out.println(name + "在表演");
    }
    //重写父类的方法
    public void eat() throws Exception{
        super.eat();//调用父类的方法
        System.out.println(name + "喜欢吃狗粮");
    }
}
