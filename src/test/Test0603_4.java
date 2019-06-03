package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-03 19:47
 * @ desc: this关键字
 *          调用类中的属性
 *          调用类中的方法或者构造方法
 *          表示当前对象：在方法被调用的过程中，哪个对象调用了方法，在方法内的this就表示谁
 *          类名.this
 **/

public class Test0603_4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("mimi");
        cat.setAge(3);
        cat.eat();
    }
}
class Cat{

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) { //name = "mimi"
        this.name = name;//this代表当前对象,this就是cat
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        //在方法中使用this调用其他的方法，this可以省略，this前面可以使用当前的类名.this
        //在后面的内部类知识点中会涉及到
        System.out.println("我是" + this.getName() + ",我爱吃鱼");//调用类中的方法或者构造方法
    }
}