package test.com.qf.CloneableDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-18 13:34
 * @ desc:克隆方法:将一个对象复制一份，称为对象的克隆技术
 *          对象需要具备克隆功能：
 *          1、实现Cloneable接口,(标记接口）
 *          2、重写Object类中的clone方法
 **/

public class Cat implements Cloneable{
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写object的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
