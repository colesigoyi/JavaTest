package day0516;
/*
静态方法
    1、使用static修饰的方法为静态方法
    2、在静态方法中，我们可以直接使用静态成员，不能直接使用非静态成员
        非静态成员属于某个具体对象，在使用静态方法时，这个对象还没有创建
        在实例方法中可以直接使用静态成员
    3、静态方法不属于某个具体对象，而是整个类共享
    4、建议直接使用类名直接使用静态方法
    5、静态方法的应用场景
        一般在定义工具类时使用静态方法
 */
public class TestStaticMethod {

    int xx = 10;            //实例变量
    static int oo = 20;     //静态变量

    public void method(){
        System.out.println("我是实例变量，需要通过对象调用");
        System.out.println("xx==" + xx);
        System.out.println("oo==" + oo);    //在实例方法中可以直接使用静态成员
    }
    public static void sMethod(){
        System.out.println("我是静态方法");
//      System.out.println("xx==" + xx);    //不能直接使用非静态成员
        System.out.println("oo==" + oo);
    }

}
