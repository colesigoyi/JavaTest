package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-04 23:13
 * @ desc: 两个对象之间的一对一关系
 *          比如一个英雄（Hero）对一个兵器（Weapon）
 *          双向一对一：
 *          单向一对一：
 **/

public class Test0604_1 {
    public static void main(String[] args) {

    }
}
//英雄类
class Hero{

    private String name;
    private int age;

    public Horse(){
    }

    public Hero(String name, int age) {
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
}
//兵器类
class Weapon{
    private String name;
    private int grade;

    public Weapon(){
    }

    public Weapon(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
