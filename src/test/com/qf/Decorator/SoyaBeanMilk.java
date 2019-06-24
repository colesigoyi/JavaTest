package test.com.qf.Decorator;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-24 16:35
 * @ desc:
 **/

public class SoyaBeanMilk implements Drink {
    public static void main(String[] args) {

    }

    @Override
    public float cost() {
        return 10;
    }

    @Override
    public String description() {
        return "纯豆浆";
    }
}
