package day0515;
/*
1、使用static关键字可以修饰成员变量，称为静态变量
2、实例变量属于某个具体的对象,静态变量不属于某个对象，整各类所共享
3、通过一个对象修改了静态变量，再通过其他变量访问静态变量时就是修改了之后的值
4、静态变量存储在方法区当中，所有的对象都能访问到他
5、实例变量是在创建对象时在堆中分配存储空，对象被垃圾回收器收走，实例变量就被释放了
    静态变量在类加载内存时就在方法去当中分配存储空间，一直到程序的结束
6、建议直接使用类名来访问静态变量
7、静态变量的使用场景：
        当某个数据需要对所有对象共享时，就可以把这个数据定义为静态变量
 */

class Person {

    int xx;                 //实例变量
    static int oo = 0;          //静态变量
    static int count = 0;          //静态变量


    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        xx++;
        count++;
    }

    public Person() {
        xx++;
        count++;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
