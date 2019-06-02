package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-03 00:14
 * @ desc:  面相过程：以步骤为单位，一步一步完成某个具体的事情
 *          面向对象：以对象为单位，通过调度组合不同的对象来完成某一个事情
 **/

public class Test0603_1 {
    public static void main(String[] args) {
        //int i = o; //基本数据类型

        Horse h = null; //声明一个类的变量（除了八种基本数据类型以外
                            // 都是引用数据类型，包括数组）

        //创建一个Horse类型的对象，实例对象
        h = new Horse();
        h.name = "赤兔马";
        h.age = 5;

        h.run();//调用方法，那么方法就会被执行
        h.eat();

        //匿名对象，只能使用一次，用完后该对象就会被释放
        new Horse().eat();

        h = null;//把对象释放
        //h.eat();//当对象不存在，调用该对象的属性和方法将报错（空指针异常）
    }
}
//定义一个类（类型）自己定义的类型是引用类型
class Horse {
    //在类中定义属性（特征）
    String name;
    int age;

    public void run(){
        System.out.println("我是"+ name +",我" + age + "岁了！跑的很快！");
    }
    public void eat(){
        System.out.println("我吃的很多！");
    }
}
