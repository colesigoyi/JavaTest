package test.com.qf.IO.FileDemo;

import java.io.Serializable;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-20 14:18
 * @ desc: Dog类
 **/
//如果一个类创建的对象，需要被序列化，那么这个类必须实现Serializabl接口
    //Serializabl是一个标记接口，没有任何定义，为了告诉JVM虚拟机该对象可以被序列化
    //什么时候对象需要被序列化？
        //1.把对象保存到文件中（存储到物理戒指）
        //2.对象需要在网络上传输时
    //如果对象没有实现Serializabl接口，会抛异常
public class Dog implements Serializable {
    private String name;
    private int age;
    private String sex;

    private transient int id;//在序列化中被忽略

    public static void main(String[] args) {

    }

    public Dog() {
    }

    public Dog(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
