package test.com.qf.Decorator;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 16:43
 * @ desc: 测试类
 **/

public class Test {
    public static void main(String[] args) {

        Drink drink = new SoyaBeanMilk();
        SugerDecorator suger = new SugerDecorator(drink);
        EggDecorater egg = new EggDecorater(suger);
        BlackBeanDecortaor blackBean = new BlackBeanDecortaor(egg);

        System.out.println("你点的豆浆时：" + blackBean.description());
        System.out.println("总价：" + blackBean.cost());

    }
}
