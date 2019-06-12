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
        Student1 s1 = new Student1("txf",01,27);
        System.out.println(s1.toString());
        System.out.println(s1);//toString方法可以省略
        Student1 s2 = new Student1("txf",01,27);
        boolean b = s1.equals(s2);
        System.out.println(b);//false

        String s3 = new String("数组");
        String s4 = new String("数组");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
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
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Student1){
            Student1 s = (Student1)obj;
            if(!this.name.equals(s.name)){
                return false;
            }
            if(this.sid != s.sid){
                return false;
            }
            if(this.age != s.age){
                return false;
            }
            return true;
        }
        return false;
    }
}
