package day0516;
/*
定义子类
Son类继承Father类，就有了Father类的实例变量和实例方法

通过子类名或子类对象名虽然可以访问到父类的静态成员，但是不是继承

如果在子类中定义了 和父类继承下来的成员变量重名的成员时
 */
public class Son extends Father {
    int xx = 101;
    /*
    在Son类中，定义了一个变量xx，在Son类的对象就有两个xx变量
    如果直接通过Son对象访问的xx是在子类中添加的xx
     */
    static {
        System.out.println("我是子类的静态构造代码块，在使用Son类时，要对" +
                "Son类进行初始化，就会执行我");
    }
    public void sonMethod(){
        System.out.println("in son,method");
        //在子类方法中，直接使用的xx是子类添加的xx（101）
        System.out.println("xx==" + xx);
        //在子类中，想访问从父类继承下来的xx
        System.out.println("从父类继承下来的xx:" + super.xx);
        //如果不存在命名冲突，访问父类继承下来的成员时，可省略super
        method();
        //个人习惯：不管有没有命名冲突，在访问父类成员时，都会加上super关键字
    }
}
