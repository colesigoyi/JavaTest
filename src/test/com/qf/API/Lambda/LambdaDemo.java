package test.com.qf.API.Lambda;

import java.util.Arrays;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-18 16:53
 * @ desc: Lambda表达式
 **/

public class LambdaDemo {
    public static void main(String[] args) {
        IEat ieat = new IEatImpl();
        ieat.eat();

        IEat ieat2 = new IEat() {
            @Override
            public void eat() {
                System.out.println("吃香蕉");
            }
        };
        ieat2.eat();

        //lambda表达式
        //          优点：1.让代码更简洁 2.不会单独生成class文件
        //IEat ieat3 = ()->{System.out.println("吃橘子");};

        //没有参数时使用
        IEat ieat3 = ()->System.out.println("吃橘子");
        ieat3.eat();

        //带参数时使用，参数的类型可以省略
        IEat2 ieat4 = (thing) -> {System.out.println("吃" + thing);};
        ieat4.eat("香蕉");

        //带参数时使用，参数的类型可以省略，代码块中有多行代码
        IEat2 ieat5 = (thing) -> {
            System.out.println("吃" + thing);
            System.out.println("喝" + thing + "汁");
        };
        ieat5.eat("香蕉");

        //带返回值的方法
        IEat3 ieat6 = (thing) -> {
            System.out.println("吃" + thing);
            return 10;
        };

        //带返回值的方法中只有一句实现代码
        IEat3 ieat7 = (thing) -> thing==null?0:1;
        ieat7.eat("milk");

        //带final关键字
        IEat4 ieat8 = (final String thing,final String name) -> thing==null?0:1;
        ieat7.eat("milk");

        IEat4 ieat9 = (final String thing,final String name) -> thing==null?0:1;
        ieat9.eat("milk","汤姆");

        Student[] students = {new Student("张三",18),
                new Student("李四",16),
                new Student("王五",19)
        };
        //Arrays.sort(students,new Comparator<Student>(){
        //    public int compare(Student o1, Student o2){
        //        return o1.getAge()-o2.getAge();
        //    }
        //});
        //Comparator<Student> c = (o1, o2) -> o1.getAge()-o2.getAge());
        Arrays.sort(students, (o1, o2) -> o1.getAge()-o2.getAge());
        System.out.println(Arrays.toString(students));

    }
}
//只有一个抽象方法的接口
interface IEat{
    public void eat();
}

class IEatImpl implements IEat{
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
//带参数的接口
interface IEat2{
    public void eat(String thing);
}

class IEatImpl2 implements IEat2{
    @Override
    public void eat(String thing) {
        System.out.println("吃" + thing);
    }
}

//带返回值
interface IEat3{
    public int eat(String thing);
}

class IEatImpl3 implements IEat3{
    @Override
    public int eat(String thing) {
        System.out.println("吃" + thing);
        return 10;
    }
}

//带final关键字
interface IEat4{
    public int eat(final String thing,final String name);
}

class IEatImpl4 implements IEat4{
    @Override
    public int eat(String thing,String name) {
        System.out.println("吃" + thing);
        return 10;
    }
}

interface IEat5{
    public int eat(final String thing,final String name);
    public default void print(){//默认方法不影响Lambda
        System.out.println("默认方法");
    }
    public static void print2(){//静态方法不影响Lambda
        System.out.println("静态方法");
    }
}
