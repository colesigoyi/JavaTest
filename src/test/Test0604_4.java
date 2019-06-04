package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-05 00:42
 * @ desc: 代码块
 *          1.普通代码块：在方法中写的代码块
 *          2.构造块：在类中定义的代码块，在创建对象时调用，优于构造方法执行
 *          3.在类中使用static声明的代码块称为静态代码块
 **/

/*
//普通代码块：直接写在方法中的代码块就是普通代码块
public class Test0604_4 {
    public static void main(String[] args) {
        {//普通代码块
            String info = "局部变量-1";
            System.out.println(info);
        }
        String info = "局部变量-2";
        System.out.println(info);
    }
}
*/
public class Test0604_4 {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
class Student {
    static {
        System.out.println("我是静态代码块");
    }

    public Student(){
        System.out.println("构造方法");
    }

    {
        System.out.println("我是构造代码块");
    }
    public void study(){
        //限制作用域
        {
            int i = 10;
        }
        System.out.println("我是普通代码块");
    }
}
