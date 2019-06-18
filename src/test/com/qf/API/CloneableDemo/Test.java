package test.com.qf.API.CloneableDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-18 13:39
 * @ desc: 克隆测试类
 **/

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("喵喵",2);
        try {
            Cat newCat = (Cat) cat.clone();

            System.out.println("cat=" + cat);
            System.out.println("newCat=" + newCat);//两个不同的对象
            System.out.println(cat==newCat);//false
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
