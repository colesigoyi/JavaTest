package test.com.qf.CollectionDemo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-27 00:40
 * @ desc: Collection接口：用于存储单个对象大的集合
 *          List接口：
 *                  1、有序的
 *                  2、允许多个空元素
 *                  3、具体的实现有：ArrayList、Vector、LinkedList
 *          Set接口：
 **/

public class ListDemo {
    public static void main(String[] args) {
        arrayList();
    }
    /**
     * ArrayList
     */
    private static void arrayList(){
        //使用集合来存储多个不同类型的元素（对象），那么在处理时会比较麻烦，
        // 在实际开发中，不建议这样使用，我们应该在一个集合中存储相同的类型对象
        //List<String> list = new ArrayList<String>();//泛型，约束类型   1.7版本之前
        List<String> list = new ArrayList();//泛型，约束类型
        list.add("张老师");
        list.add("王老师");
        list.add("李老师");
        list.add("孙老师");
        list.add("刘老师");
        //list.add(10);
        int size = list.size();//size局部变量，进栈，访问效率高
        for(int i=0; i<size; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.contains("苍老师"));
        list.remove("王老师");
        System.out.println(list.size());
        String[] array = list.toArray(new String[]{});
        for(String s : array){
            System.out.println(s);
        }
    }
}
