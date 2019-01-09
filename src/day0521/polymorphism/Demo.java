package day0521.polymorphism;

class Demo {
    public static void main(String[] args) {
        Father f = new Father();
        System.out.println(f.xx);
        f.method();
        f.sMethod();

        System.out.println("-----------------------");
        f = new Son();
        System.out.println(f.xx);   //10
        /*
        Son类继承了Father类，就继承了实例变量xx
        Son类中有添加了一个实例变量xx，现在Son类有两个同名的实例变量xx，
        f是父类的引用，f现在指向了子类的对象
        通过f访问的实例变量xx，就是子类从父类继承下来的xx
        对于实例变量来说不存在多态的问题
        f这个引用是Father类型的，多以xx就是Father类型中定义的xx
         */
        f.method();     //相同的语句执行不同而操作，就是多态
        f.sMethod();
        /*
        子类虽然可以定义和父类重名的静态方法，但是不是重写，就不存在多态问题
        f是Father类定义的引用，通过f访问的静态方法就是Father类中的静态方法
         */
        /*
        多态的四个条件：
            1、继承
            2、子类重写父类的方法
            3、让父类的引用指向子类的对象
            4、通过父类的引用 调用被重写的方法
         */
    }
}
