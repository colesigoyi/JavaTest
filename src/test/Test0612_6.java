package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-12 23:27
 * @ desc: 适配器模式：将一个类的接口转换成客户希望的另外一个接口。
 *         适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 **/

public class Test0612_6 {
    public static void main(String[] args) {
        IPowerA powerA = new PowerAImpl();//实例化
        work(powerA);
        IPowerB powerB = new PowerBImpl();
        //work(powerB);//接口不兼容，无法传入
        Adapter adapter = new Adapter(powerB);
        work(adapter);
    }

    public static void work(IPowerA a){
        System.out.println("正在连接...");
        a.insert();
        System.out.println("工作结束.");
    }
}
//适配器模式
class Adapter implements IPowerA{
    private IPowerB powerB;
    public Adapter(IPowerB powerB){
        this.powerB = powerB;
    }
    public void insert(){
        powerB.connect();
    }
}
interface IPowerA{
    public void insert();
}
class PowerAImpl implements IPowerA{
    public void insert(){
        System.out.println("电源A开始工作");
    }
}

interface IPowerB{
    public void connect();
}
class PowerBImpl implements IPowerB{
    public void connect(){
        System.out.println("正在工作");
    }
}
//--------------------------------------------------------
interface IAnimal{
    public void sing();
    public void cry();
    public void run();
    public void swim();
}
abstract class AnimalFunction{
    public void sing() {}
    public void cry() {}
    public void run() {}
    public void swim() {}
}
//利用适配器模式就不能重写接口的所有方法
class Dog3 extends AnimalFunction{
    public void run(){
        System.out.println();
    }
}