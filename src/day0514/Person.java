package day0514;

public class Person {
    String name;
    String gender;
    int height;
    int weight;
    String personID;


    public Person() {
    }
    /*
    构造方法
    方法的行参与字段名相同，在方法体中采用就近原则，使用的是形参而不是字段
    刚刚在堆中new出来的对象就是this对象
     */
    public Person(String name, String gender, int height, int weight, String personID) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.personID = personID;
    }
    /*
    当一个类中需要定义多个构造方法时，可以定义一个有最多参数的构造方法，其他构造方法可以互相调用
     */
    public Person(String name, String gender, int height, int weight) {
        this(name,gender,height,weight,"");
        //注意：this（）这条语句必须作为构造方法的第一条语句
    }
    public Person(String name, String gender, int height) {
        this(name,gender,height,0,"");
    }
    public Person(String name, String gender) {
        this(name,gender,0,0,"");
    }
    public Person(String name) {
        this(name,"",0,0,"");
    }

    //修改姓名
    //哪个对象调用这个方法，this就是指那个对象
    public void setName(String name){
        this.name = name;
    }

    public void showInfo() {
        System.out.println("--------个人信息-------");
        System.out.println("名字:" + name);
        System.out.println("性别:" + gender);
        System.out.println("身高:" + height);
        System.out.println("体重:" + weight);
        System.out.println("身份ID:" + personID);
    }
}