package test;

import java.util.Arrays;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-05 01:39
 * @ desc: 对象数组与管理
 *          使用对象数组实现多个Chicken的管理
 *          动态数组：
 *          1、数组是一种线性数据结构
 *          2、数组不适合做删除或插入操作，适合添加，查找，遍历
 **/

public class Test0604_6 {
    public static void main(String[] args) {
        ChickenManager cm = new ChickenManager(5);
        //添加
        cm.add(new Chicken(1,"小小",5));
        cm.add(new Chicken(2,"小蓝",3));
        cm.add(new Chicken(3,"小绿",6));
        cm.add(new Chicken(4,"小白",5));
        cm.add(new Chicken(5,"小黑",2));


        cm.add(new Chicken(6,"小黑",2));
        System.out.println("数组的长度是：" + cm.length());

        System.out.println("------------查找所有---------------");
        cm.printAll();

        System.out.println("------------查找---------------");
        Chicken c = cm.find(6);
        c.print();

        System.out.println("------------更新---------------");
        cm.update(new Chicken(1,"改变",12));
        cm.printAll();


    }
}
//小鸡管理类
class ChickenManager{
    private Chicken[] cs = null;
    private int count = 0;//记录当前数组的元素个数（下标）

    public ChickenManager(int size){
        if(size>0){
            cs = new Chicken[size];
        }else {
            cs = new Chicken[5];
        }
    }
    public int length(){
        return cs.length;
    }
    //添加：实现动态数组
    public void add(Chicken c){
        if(count>=cs.length){//数组已经满，需要扩充

            //算法1：扩充原来数字大小的一半 cs.length*/2+1
            //算法2：扩充原来数组的一倍 cs.length*2
            int newLen = cs.length * 2;
            cs = Arrays.copyOf(cs, newLen);

        }
        cs[count] = c;
        count++;
    }
    //删除
    public void delete(int id){
        for(int i=0; i<count; i++){
            if(cs[i].getId() == id){
                //找到了要删除的对象，把该对象之后的对象向前移动
                for (int j=i; j<count-1; j++){
                    cs[j] = cs[j+1];
                }
                //把最后一个对象赋值为空
                cs[count-1] = null;
                count--;//下标减一
                break;
            }
        }

    }
    //更新
    public void update(Chicken c){
        Chicken temp = find(c.getId());
        if(temp != null){
            temp.setName(c.getName());
            temp.setAge(c.getAge());
        }
    }
    //查找
    public Chicken find(int id){
        for (int i=0; i<count; i++){
            if(cs[i].getId() == id){
                return cs[i];
            }
        }
        return null;
    }
    //输出所有
    public void printAll(){
        for (int i=0; i<count; i++){
            cs[i].print();
        }
    }
}

//小鸡类（数据对象）value object(VO)
class Chicken{

    private int id;
    private String name;
    private int age;
    public Chicken(){}//一般情况下最好保留默认的构造方法
    public Chicken(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print(){
        System.out.println("id=" + id + ",name=" + name + ",age=" + age);
    }
}
