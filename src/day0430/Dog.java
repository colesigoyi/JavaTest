package day0430;
/*
在类的一个成员方法中，可以调用另外一个成员方法
狗类
属性：昵称，性别，年龄，身高，体重，品种...
行为：叫，看门，吃，摇尾巴，显示狗的信息
 */
public class Dog {
    String nickname;
    String gender;
    int age;
    String variaty;     //品种
    public void showInfo() {
        System.out.println("--------狗信息-------");
        System.out.println("nickname:" + nickname);
        System.out.println("genger:" + gender);
        System.out.println("age:" + age);
        System.out.println("variaty:" + variaty);
    }
    //叫唤
    public void bark() {
        System.out.println("汪~~汪~~汪~~~");
    }
    //狗在吃东西时摇尾巴
    public void eat() {
        System.out.println("狗喜欢吃肉");
        shake();                        //调用另外一个成员方法
    }
    //小狗看门时，会叫唤
    public void guard() {
        System.out.println("狗在看门，生人勿进！");
        bark();
    }
    public void shake() {
        System.out.println("摇尾巴");
    }
}
