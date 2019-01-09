package day0509;

class Demo02 {
    public static void main(String[] args) {
        /*
        Person p1 = new Person();
        p1.name = "lisi";
        p1.gender = "男";
        p1.height = 178;
        p1.age = 70;
        p1.personID = "100100100";
        p1.showInfo();

        int age = 123;      //定义变量的同时就给变量赋值
        */

        //想在创建对象的同时，就给对象的各个成员变量（字段）赋值
        Person p2 = new Person("zhangsan","男",178,70,"111000111000");
        p2.showInfo();

        Person p3 = new Person("dalao","男");
        p3.showInfo();

//      p3.Person();   不能通过对象来调用构造方法，只能跟在new运算符后面由系统调用
    }
}
