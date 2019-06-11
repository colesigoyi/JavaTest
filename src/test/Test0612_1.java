package test;


/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-12 01:12
 * @ desc: 抽象类应用--模板方法模式
 *          定义一个操作中的算法的骨架，而将一些可变部分的实现延迟到子类中，
 *          模板方法模式使得子类可以不改变一个算法的结构即可重新定义概算发的某些特定的步骤
 **/

public class Test0612_1 {
    public static void main(String[] args) {
        Usermanager um = new Usermanager();
        um.action("admin","add");

    }
}
abstract class BaseManager{
    public void action(String name, String method){
        if("admin".equals(name)){
            execute(method);
        }else {
            System.out.println("你没有操作权限，请联系管理员。");
        }
    }
    public abstract void execute(String method);
}

class Usermanager extends BaseManager {
    //用户是否登录的验证
    //验证成功后执行某个操作
    public void execute(String method){
        if("add".equals(method)){
            System.out.println("执行了添加操作");
        }else if("del".equals(method)){
            System.out.println("执行了删除操作");
        }
    }
}
class Classmanager{

}