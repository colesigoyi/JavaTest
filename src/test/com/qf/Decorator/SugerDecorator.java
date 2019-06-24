package test.com.qf.Decorator;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 16:39
 * @ desc:具体的装饰者类
 **/

public class SugerDecorator extends Decorator {
    public SugerDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 1.0f;
    }

    @Override
    public String description() {
        return super.description() + " + 糖";
    }
}
