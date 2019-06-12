package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-12 23:46
 * @ desc: 内部类：内部类就是在一个类的内部定义的类
 *          1.成员内部类：直接在类中定义的类
 *          2.方法内部类：在一个类中的方法内定义一个类
 *                  从内部类引用的本地变量必须是最终变量或实际上的最终变量
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
}