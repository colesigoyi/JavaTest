package test.com.qf.Lambda;

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

        IEat ieat3 = ()->{System.out.println("吃橘子");};
        ieat3.eat();

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
