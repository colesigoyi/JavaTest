package day0509;

class DemoDog {
    public static void main(String[] args) {
        Demo01 myDog = new Demo01();
        myDog.showInfo();
        System.out.println();

        //引用类型变量可以赋值给null
        myDog = null;
        //编译正确，运行时就会产生空指针异常
        System.out.println(myDog.nickname);
        myDog.bark();
    }
}
