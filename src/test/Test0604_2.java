package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-04 23:59
 * @ desc: static关键字
 *          1.静态变量或方法不属于对象，依赖类
 *          2.静态变量是全局变量，生命周期从类创建加载后一直到程序结束
 *          3.静态变量只存一份，在静态方法区存储
 *          4.静态变量是本类所有对象共享一份
 *          5.建议不要使用对象名去调用静态变量，直接用类名调用
 *          6.static修饰一个方法，那么该方法属于类，用类名直接调用
 **/

public class Test0604_2 {
    public static void main(String[] args) {
        //Role beibei = new Role("刘备","蜀国");
        //Role yunchang = new Role("关羽","蜀国");
        //Role feifei = new Role("张飞","蜀国");
        Role beibei = new Role("刘备");
        Role yunchang = new Role("关羽");
        Role feifei = new Role("张飞");

        System.out.println(beibei.geiInfo());
        System.out.println(yunchang.geiInfo());
        System.out.println(feifei.geiInfo());

        System.out.println(Role.country);//直接用类名调用静态变量
    }
}
//角色
class Role{
    private String name;
    //private static String country = "蜀国";//把它该变成静态的，直接赋值蜀国，变成全局变量
    static String country = "蜀国";//把它该变成静态的，直接赋值蜀国，变成全局变量
    public Role(String name) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String geiInfo(){
        return "name= " + name + ";country=" + country;
    }
}