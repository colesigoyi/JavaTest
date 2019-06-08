package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-08 13:27
 * @ desc: final关键字:
 *          1、使用final声明一个属性，就是常量，常量烦人命名规则建议使用大写
 *          2、常量必须在定义时或者在构造器中初始化
 *          3、使用final声明的方法，不能被子类重写，只能被继承
 *          4、使用final关键字声明的类，该类就转变为最终类，没有子类的类，final修饰的类无法被继承
 *          5、在方法参数中使用final，在该方法内部不能修改参数的值（内部类范围）
 **/

public class Test0608_2_final {

    public static void main(String[] args) {
        System.out.println(Constant.PERSON_NUM);
        FinalClass c = new FinalClass();
        c.setLength(10);
    }
}

//常量类（工具类的一种）:在实际项目开发中，常量类通常用于定义项目中一些公共的不变的数据
final class Constant{
    public static final int PERSON_NUM = 10;
    public static final String SERVER_ROOT_URL = "http://www.baidu.com";
    public static final String CACHE_PATH = "data_cache";
}

final class FinalClass{
    public final int DAY_NUMBER;//工作天数

    public FinalClass(){
        DAY_NUMBER = 22;
    }
    public final void print(){
        System.out.println("我是final方法");
    }
    public void setLength(final int size){
        //size++;//Error:(38, 9) java: 不能分配最终参数size
        System.out.println(size);
    }
}
//class SubClass extends FinalClass{//Error:(36, 24) java: 无法从最终test.FinalClass进行继承
    /*
    public void print(){
        System.out.println("重写final方法");
        //Error:(35, 17) java: test.SubClass中的print()无法覆盖test.FinalClass中的print()
        //  被覆盖的方法为final
    */