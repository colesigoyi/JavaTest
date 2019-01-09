package day0516;
/*
饿汉式单例设计模式
    1、把构造方法私有化
    2、再累中提供一个本类的对象
    3、提供一个方法，返回这个对象
 */
class Singleton {
    //1、显示的定义了一个构造方法，系统只有这一个私有的构造方法
    private Singleton(){
    }
    //2、提供一个私有的静态的本类的对象
    private  static Singleton obj = new Singleton();
    //3提供一个静态的公共的方法返回本类的对象
    public static Singleton getInstance(){
        return obj;
    }
}
/*
懒汉式单例设计模式
    1、把构造方法私有化
    2、再累中提供一个本类的对象
    3、提供一个方法，返回这个对象
 */
class Singleton2 {
    //1、显示的定义了一个构造方法，系统只有这一个私有的构造方法
    private Singleton2(){
    }
    //2、提供一个私有的静态的本类的对象,懒汉式在定义对象之后不进行初始化
    private  static Singleton2 obj;
    //3提供一个静态的公共的方法返回本类的对象
    public static synchronized Singleton2 getInstance(){
        if(obj == null){
            obj = new Singleton2();
        }
        return obj;
    }
}
class DemoSingleton {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        //obj、obj2是对象名，保存的是堆中对象的引用（地址）
        System.out.println(obj);
        System.out.println(obj2);
    }
}
