package day0430;
/*
定义Person类
共同的属性(静态特征)：姓名，性别，身高，体重。身份证号...
共同的行为：吃，喝，睡...

构造方法：1、创建对象时，就给对象的各个字段赋值
        2、
 */
public class Demoperson {
    //属性保存在变量中
    public String name;
    public String gender;
    public int height;
    public int weight;
    public String personID;

    //行为适用方法来表示                 //static修饰main方法
    public void eat() {
        System.out.println("人都需要吃饭");
    }
    public void drink() {
        System.out.println("人都需要喝水");
    }
    public void showInfo() {
        System.out.println("--------个人信息-------");
        System.out.println("name:" + name);
        System.out.println("genger:" + gender);
        System.out.println("身高:" + height);
        System.out.println("体重:" + weight);
        System.out.println("ID:" + personID);
    }
}
