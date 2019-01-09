package day0430.Demo02.classdefination;

import day0509.Person;

/*
在定义类时，可以给成员变量付初值
类创建了对象，如果没有给对象的这个成员变量赋值，这个成员变量的值就是定义时赋的初始值
 */
class person {
    /*
    属性保存在变量中
     */
    String name;
    int age;
    String gender;
    String country = "中国";  //定义成员变量时可以付初值
    boolean isMirred;
    /*
    构造代码块

    作用：给所有对象进行相同的初始化操作

    特点：在创建对象的时候，在构造方法执行之前，限制性构造代码块

    注意：在定义类时可以给变量赋值，编译之后，这个变量的初始化操作就会编译到构造方法体的最前面
        构造代码块编译之后，也会编译到构造方法的前面
        类中变量的初始化和构造代码块，那个定义在前，就先执行哪个
    */
    {
        System.out.println("我是构造代码块，每次在创建对象时，" +
                "在执行构造方法之前先执行我");
        //一般情况下，当所有的对象都需要进行的初始化操作，就可以放在构造代码块中
        cry();
    }

    public person(String _name, int _age, String _country){
        System.out.println("我是有参构造");
        name = _name;
        age = _age;
        country = _country;
    }
    public person(){
        System.out.println("我是无参构造");
    }
    public void cry(){
        System.out.println("哇~~~~~~~~~");
    }



    public void showInfo() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("gender:" + gender);
        System.out.println("country:" + country);
        System.out.println("isMirred:" + isMirred);
    }
}
