package day0516;
/*
静态构造代码块
    1、使用static可以修饰构造代码块，称为静态构造代码块
    2、在使用某个类时，类加载器把字节码文件加载到内存当中，在类使用之前需要对类进行初始化
        类初始化之前先执行静态构造代码块
    3、因为类的初始化只有一次，所以静态构造代码块也只执行一次
    4、应用场景：
        有的时候，在使用某个类时，这个类可能依赖外部资源，在使用类之前需要先把资源加载到类中
        就可以把家在外部资源的操作放到静态构造代码块
 */
class TestStaticCode {
    static int xx = 10;

    public static void sMethod(){
        System.out.println("静态方法");
    }

    /*构造方法是在创建对象时给对象的字段初始化，static修饰的成员跟对象没有关系
    public static TestStaticCode(){
    }
    */
    static {
        System.out.println("静态构造代码块");
    }

    {
        System.out.println("构造代码块，每次创建对象，执行构造方法之前先执行构造代码块");
    }
    public TestStaticCode(){
        System.out.println("无参构造");
    }

}
