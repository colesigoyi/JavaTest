package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-03 02:03
 * @ desc: 封装性： private关键字：访问权限修饰符，表示私有的，私有的属性或方法只能在本类中访问
 *                 public公共的，公有的属性或方法可以被类外部的其他类访问
 *                 想要在类外部访问私有属性，我们需要提供公有的方法来间接访问
 *                 通常在一个类中，属性都私有化，并对外提供getter and setter方法
 **/

public class Test0603_2 {
    public static void main(String[] args) {

        Person1 p1 = new Person1();
        //属性没有封装，在本类之外创建对象后可以直接访问属性
        p1.name = "tao";
        p1.age = 18;

        Person2 p2 = new Person2();
        //p2.name = "tao";//直接赋值会报错Error:name可以在test.Person2中访问private
        //p2.age = 18;//Error:age可以在test.Person2中访问private
        p2.setAge(18);//调用方法,可以用方法控制赋值，可以对赋值的过程进行修改
        p2.setName("tao");

    }
}
//属性没有封装之前
class Person1 {
    //属性的封装
    String name;
    int age;
}
class Person2 {
    //相当于北京限行
    private String name;
    private int age;
    //相当于进京证
    //对外提供一个为name属性设值得方法
    public void setName(String n) {
        //this指当前对象的name
        this.name = n;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //对外提供一个获取属性的方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}