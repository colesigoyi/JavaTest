package day0509;

class Demo03 {
    public static void main(String[] args) {
        /*
        在数据封装之前，可以直接使用对象的字段
        封装之后，把字段私有化，在这访问时会报is not visible的错误

        Person p1 = new Person();
        p1.age = 18;
        p1.gender = "男";
        p1.height = 188;
        p1.name = "zhangsan";
        p1.showInfo();
        //如果可以直接修改对象的属性的话，有时赋值不符合实际情况
        p1.age = 1999;
        p1.gender = "药";
        p1.height = -155;
        p1.showInfo();
        */

        Person p2 = new Person("lisi","男");
        //把p2对象的姓名打印到屏幕上
//      System.out.println(p2.name);
        System.out.println(p2.getName());   //使用getter()方法返回字段的值

        p2.setGender("mo");
        System.out.println(p2.getGender());

        //对于height字段，只能赋值，不能读
        p2.setHeight(198);
//      System.out.println(p2.hight);

        Person p3 = new Person("zhaoliu","呵呵",888,666,"随便搞");

    }
}
