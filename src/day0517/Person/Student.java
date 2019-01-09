package day0517.Person;

import day0517.Person.Person;

class Student extends Person {
    String stuID;
    int score;
    private void study(){

    }

    public Student(String name, int age, String gender, int height, int weight, String city, String country) {
        super(name, age, gender, height, weight, city, country);
    }

    public Student(String stuID, int score) {
        this("",0,"" ,0 ,0 ,"" ,"" ,stuID ,score );
        this.stuID = stuID;
        this.score = score;
    }

    public Student(String name, int age, String gender, int height, int weight, String city, String country, String stuID, int score) {
        super(name, age, gender, height, weight, city, country);
    }


    //子类的构造方法
    public Student(){
        //super();      //调用父类的无参构造
        //super("","",0,0,0,"",""); //制定调用父类的有参构造
        System.out.println("Student的构造方法");
    }
}
