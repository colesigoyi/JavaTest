package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-03 20:00
 * @ desc: 值传递与引用传递
 **/

//示例一：值传递
public class Test0603_5 {
    public static void main(String[] args) {
        int x = 10;//局部变量，存在栈中
        method(x);//复制一份给局部变量，x没改变
        System.out.println("x=" + x);//10
    }
    public static void method(int mx){
        mx = 20;
    }
}
//示例二：引用传递
class RefDemo1{
    public static void main(String[] args){
        Duck d = new Duck();
        method(d);
        System.out.println("Duck age=" + d.age);//Duck age=5
    }
    public static void method(Duck duck){
        duck.age = 5;
    }
}
class Duck{
    int age = 2;//省略封装
}
//示例三：String类型传递
//字符串本身就是对象
class RefDemo02{
    public static void main(String[] args){
        String name = "小飞";
        method(name);
        System.out.println("name = " + name);//小飞
    }
    public static void method(String sname){
        //sname的指向改变了
        sname = "小备";//字符串相当于对象
    }
}
//示例四：String传递
class RefDemo03{
    public static void main(String[] args) {
        Person p = new Person();
        method(p);
        System.out.println("person name = " + p.name);//备备
    }
    public static void method(Person per){
        per.name = "备备";
    }
}
class Person{
    String name = "飞飞";//省略封装
}