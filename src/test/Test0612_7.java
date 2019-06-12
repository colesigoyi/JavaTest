package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-12 23:46
 * @ desc: 内部类：内部类就是在一个类的内部定义的类
 *          1.成员内部类：直接在类中定义的类
 *          2.方法内部类：在一个类中的方法内定义一个类
 *            （1）方法内部类只能在定义该内部类的方法内实例化，不可以在此方法外对其实例化
 *            （2）从内部类引用的本地变量必须是最终变量或实际上的最终变量
 *          3.静态内部类：在类中定义一个静态修饰的内部类
 *              静态的含义是该内部类可以像其他静态成员一样，没有外不累对象时，也能够访问他，
 *              静态嵌套类仅能访问外不累的静态成员和方法
 *          4.匿名内部类就是没有名字的内部类
 *              （1）继承式的匿名内部类
 *              （2）接口式的匿名内部类
 *              （3）参数式的匿名内部类
 **/

public class Test0612_7 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //在外部创建成员内部类的实例
        //通常不建议这样来实例化内部类对象
        //Outer.Inner inner = outer.new Inner();
        //inner.print();
        outer.innerPrint();
        outer.show();

        Outer.Inner3 inner3 = new Outer.Inner3();
        inner3.print();

        outer.print1();
        outer.print2();
        outer.print3(new IEat2() {
            @Override
            public void eat() {
                System.out.println("参数式匿名内部类");
            }
        });
    }
}

class Outer{
    private String name;
    //-------------------成员内部类-----------------------------
    //内部做一个封装
    //建议在外部类中定义一个方法，对外提供给访问内部类的接口
    public void innerPrint(){
        Inner inner = new Inner();
        inner.print();
    }
    //成员内部类
    private class Inner{
        public void print(){
            System.out.println("成员内部类");
        }
    }
    //--------------------方法内部类---------------------------
    //show方法的局部变量或方法的参数，实际必须是常量final
    public void show(){
        final int x = 10;
        class Inner2{
            public void print(){
                //x++;Error:从内部类引用的本地变量必须是最终变量或实际上的最终变量
                System.out.println("方法内部类" + x);
            }
        }
        Inner2 inner2 = new Inner2();
        inner2.print();
    }
    //-------------------静态内部类--------------------------------
    //无法从静态上下文中引用非静态变量
    static class Inner3{
        public void print(){
            System.out.println("静态内部类");
        }
    }
    //--------------------匿名内部类--------------------------------
    //继承式的匿名内部类
    public void print1(){
        Cat2 cat = new Cat2(){
            public void eat(){
                System.out.println("继承式的匿名内部类");
            }
        };//一条语句
        cat.eat();
    }
    //接口式匿名内部类
    public void print2(){
        IEat2 eat = new IEat2() {
            @Override
            public void eat() {
                System.out.println("接口式匿名内部类");
            }
        };
        eat.eat();
    }
    //参数式匿名内部类
    public void print3(IEat2 eat){
        eat.eat();
    }

}
abstract class Cat2{
    public void eat(){}
}
interface IEat2{
    public void eat();
}