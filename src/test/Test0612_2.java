package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-12 01:43
 * @ desc: 接口应用-策略模式：定义了一系列的算法，将每一种算法封装起来并可以相互替换使用
 *                策略模式让算法独立于使用它的客户应用而独立变化
 *                把可变的行为抽象出来，这样的好处是这些行为可以在真正使用时相互替换
 **/

public class Test0612_2 {
    public static void main(String[] args) {
        BaseService user = new UserService();
        user.setISave(new NetSave());
        user.add("user");
    }
}
/*
传统做法
abstract class BaseService{
    public void save(String data){

    }
}
class UserService extends BaseService{
    public void save(String data){
        System.out.println("把数据保存到文件");
    }
}
*/
//把可变的行为抽象出来，定义一系列的算法
//制定一个保存的规范，可以包含多重保存方法
interface ISave{
    public void save(String data);
}
//两种保存方式，分别是文件保存和网络保存，还可以添加多重保存方式
class FileSave implements ISave{
    public void save(String data){
        System.out.println("把数据保存到文件中..." + data);
    }
}
class NetSave implements ISave {
    public void save(String data) {
        System.out.println("把数据保存到网络上..." + data);
    }
}
//面向接口编程
abstract class BaseService{
    private ISave iSave;
    //选择一种保存方法
    public void setISave(ISave iSave){
        this.iSave = iSave;
    }
    public void add(String data){
        System.out.println("检查数据合法性...");
        iSave.save(data);
        System.out.println("数据保存完毕。");
    }
}
class UserService extends BaseService{

}