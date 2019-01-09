package day0517.OverWrite;

class Demo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三";
        stu.age = 18;
        stu.gender = "男";
        stu.height = 180;
        stu.score = 100;
        stu.stuID = "10010011";
        stu.showInfo();
        System.out.println(stu.getClass());
    }
}
