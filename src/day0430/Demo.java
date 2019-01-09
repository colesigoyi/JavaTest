package day0430;

class Demo {
    public static void main(String[] args) {

        //1）创建对象
        Demoperson p1 = new Demoperson();
        /*
        Demoperson是一个类名，在java中，类是一种引用数据类型，Demoperson是一个数据类型
        p1是对象名，实际上就是Demoperson这个类型定义的变量名，我们称之为对象名
        给p1这个对象进行赋值时，new 类名()的返回值赋值给p1变量
        new是运算符，会在堆区分配一块存储空间，把这块存储空间的起始地址赋值给p1
        p1变量中保存的是堆中内存的一个地址(引用)
         */
        //2）类创建了对象之后，对象就可以通过成员运算符（.）访问它的属性和方法
        p1.name = "laozhang";
        p1.gender = "男";
        p1.height = 175;
        p1.weight = 70;
        p1.personID = "11110000";

        p1.eat();
        p1.drink();


        System.out.println(p1);
    }
}
