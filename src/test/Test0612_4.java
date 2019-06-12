package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-12 18:27
 * @ desc: 简单工厂模式：是由一个工厂对象决定创建出哪一种产品类的实例。
 *          简单工厂模式时工厂模式家族中最简单使用的模式
 **/

public class Test0612_4 {
    public static void main(String[] args) {
        //使用者和被使用者两者之间耦合，产生依赖，当被使用者改变时，会影响使用者
        IProduct phone1 = new Phone();
        phone1.work();
        //使用工厂模式来降低两者的依赖
        IProduct phone = ProductFactory.getProduct("phone");
        if(null != phone){
            phone.work();
        }

    }
}
//相当于制作工艺
interface IProduct{
    public void work();
}
//相当于产品
class Phone implements IProduct{
    public void work(){
        System.out.println("手机开始工作");
    }
}
class Computer implements IProduct{
    public void work(){
        System.out.println("电脑开始工作");
    }
}

//工厂模式
//相当于工厂：在工厂里，利用制作工艺，制作产品
class ProductFactory{
    public static IProduct getProduct(String name){
        if("phone".equals(name)){
            return new Phone();
        }else if("computer".equals(name)){
            return new Computer();
        }
        else {
            return null;
        }
    }
}