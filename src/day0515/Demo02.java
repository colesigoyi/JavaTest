package day0515;

class Demo02 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.xx = 11;     //通过对象访问变量

        Person p2 = new Person();

        System.out.println(p1.oo);
        System.out.println(p2.oo);
        //通过一个对象修改了静态变量，再通过其他变量访问静态变量时就是修改了之后的值
        //所有对象共享一个静态变量
        p1.oo = 999;
        System.out.println(p2.oo);
        //静态变量，规范用法是使用类名直接访问
        System.out.println(Person.oo);
        //虽可以通过对象名来访问到静态变量，但是，静态变量跟对象没有任何关系
        p1 = null;
//        System.out.println(p1.xx);      //产生空指针异常
        System.out.println(p1.oo);

        //需求：想统计一下Person类到底定义了多少个对象
        test();
        System.out.println("个数" + p2.count);
    }
    public static void test(){
        Person p3 = new Person();
        Person p4 = new Person();
        System.out.println("个数" + p4.count);


    }
}
