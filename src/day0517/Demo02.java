package day0517;

class Demo02 {
    public static void main(String[] args) {
        Person01 p1 = new Person01("李四",23,"男","110020000213001");
        Person01 p2 = new Person01("李四",23,"男","110020000213001");
        /*
        p1和p2位对象名，本质就是变量名，p1、p2变量中存储的内容是堆中对象的引用
        p1和p2是重新在堆中new出来的对象，每次创建对象时，总是分配新的存储空间，p1和p2变量中的地址是不一样的
         */
        System.out.println(p1==p2);     //false
        /*
        当使用双等号比较两个引用类型变量时，判断的是这两个引用类型变量是否指向堆中的同一个对象
        现实中，如果两个人的身份证号一样，就可以认为是同一个人
        如果我想判断两个对象的内容是否一样时，可以使用equals（）方法
         */
        System.out.println(p1.equals(p2));
        Student stu = new Student();
        System.out.println(stu.getClass());
        System.out.println(p1.getClass());

    }
}
