package day0426;
/*
方法的重载
1、为什么重载
    同一个类中，相同的功能使用相同的方法名
2、如何实现重载
    方法名相同，方法的参数类型或者参数个数不同
在编译时，编译器会找与实参最匹配的方法
 */
class Demo11 {
    public static void main(String[] args) {
        //在调用方法时，编译器会找最匹配的方法
        System.out.println(sum(3.4, 4.5));
        System.out.println(sum(3, 4));
        System.out.println(sum(3, 4, 4));
        //之所以能够打印不同数据类型的数据，就是因为println方法已经实现了重载
        System.out.println(3.4);
        System.out.println(3);
        System.out.println(true);
        System.out.println("A");
        System.out.println('B');

    }


    /*
    定义方法，返回两个整数的和
     */
    public static int sum(int x, int y) {
        return x + y;
    }
    public static int sum(int x, int y, int z) {
        return x + y + z;
    }
    public static double sum(double x, double y) {
        return x + y;
    }
}
