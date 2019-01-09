package day0521.polymorphism;
/*
定义一个子类继承father类
 */
class Son extends Father {
    int xx = 101;

    public void method(){
        System.out.println("in Son method");
        System.out.println("xx==" + xx);
    }

    public static void sMethod(){
        System.out.println("in Son,static method");
    }
}
