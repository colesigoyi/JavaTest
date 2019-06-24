package test.com.qf.Decorator;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 16:41
 * @ desc: 具体的装饰者类
 **/

public class BlackBeanDecortaor extends Decorator {

    public BlackBeanDecortaor(Drink drink) {
        super(drink);
    }
    @Override
    public float cost() {
        return super.cost() + 2.0f;
    }

    @Override
    public String description() {
        return super.description() + " + 黑豆";
    }
}
