package day0517.Person;

class Person {
    String name;
    int age;
    String gender;
    int height;
    int weight;
    String city;
    String country;

    public void eat(){

    }
    public void sleep(){

    }

    public Person(String name, int age, String gender, int height, int weight, String city, String country) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.city = city;
        this.country = country;
    }
    //通过this调用另外一个构造方法
    public Person(String name, int age, String gender) {
        this(name,age, gender,0 ,0 ,"" ,"" );
    }

    public Person(){
        System.out.println("Person类的无参构造方法");
    }
}
