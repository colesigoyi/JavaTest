package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-12 17:19
 * @ desc: object类
 **/

public class Test0612_3 {
    public static void main(String[] args) {
        //Student1 s = new Student1();
        //System.out.println(s.toString());//test.Student1@2503dbd3
        Student1 s = new Student1("txf",01,27);
        System.out.println(s.toString());
        System.out.println(s);//toString方法可以省略
        Student1 s2 = new Student1("sk",02,25);
        boolean b = s.equals(s2);
        System.out.println(b);//false
    }
}

class Student1{
    private String name;
    private int sid;
    private int age;
    public Student1(){}

    public Student1(String name, int sid, int age) {
        this.name = name;
        this.sid = sid;
        this.age = age;
    }
    //重写object类中的toString方法
    public String toString(){
        return "ID=" + sid + ",name=" + name + ",age=" + age;
    }
}
