package day0518;
/*
final修饰的类不能被继承
 */
class TestFinal {
    int xx = 10;
    //实例变量，保存在堆区中，一旦定义时初始化不能被修改
    final int yy = 10;  //final修饰的成员变量，必须在定义时初始化

    static int mm = 33;
    //用final修饰的静态变量存储在方法区中，也不能被修改
    final static int dd =22;

    public void method(){
        System.out.println("在TestFinal类中的实例方法");
    }
    //用final秀是静态方法是没有意义的
    //如果就是使用了final修饰了弗雷德静态方法，也会约束子类不能定义重名的静态方法
    public final void fMethod(){
        System.out.println("在TestFinal类中使用final修饰的实例方法");
    }
    public static void sMethod(){

    }
}
