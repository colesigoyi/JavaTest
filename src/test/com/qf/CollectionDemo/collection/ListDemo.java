package test.com.qf.CollectionDemo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-27 00:40
 * @ desc: Collection接口：用于存储单个对象大的集合
 *          List接口：
 *                  1、有序的
 *                  2、允许多个空元素
 *                  3、具体的实现有：ArrayList、Vector、LinkedList
 *                在实际开发中，我们如何选择List的具体实现？
 *                  1、安全性问题：Vector
 *                  2、是否频繁插入或者删除操作：LinkedList
 *                  3、是否是存储后遍历：ArrayList
 *          Set接口：
 **/

public class ListDemo {
    public static void main(String[] args) {
        arrayList();
        vector();
        linkedList();
    }
    /**
     * ArrayList
     * 1、实现原理：采用动态对象数组实现，默认构造方法创建一个空数组
     * 2、第一次添加元素，扩展容量为10；之后的扩容算法：原来数组大小+原来数组的一半
     * 3、不适合进行删除或者插入操作
     * 4、使用集合来存储多个不同类型的元素（对象），那么在处理时会比较麻烦
     * 5、为了防止数组动态扩充次数过多，建议创建ArrayList时，给定初始容量
     * 6、多线程不安全，适合在单线程访问使用，效率较高
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
    /**
     * Vector
     * 1、实现原理：采用动态对象数组实现，默认构造方法创建了一个容量为10的对象数组
     * 2、扩充的算法：当增量为0时，扩充为原来大小的两倍，当增量大于0时，扩充为原来大小+增量
     * 3、不适合删除或插入操作
     * 4、使用集合来存储多个不同类型的元素（对象），那么在处理时会比较麻烦
     * 5、线程安全，适合在多线程访问时使用，在单线程中效率较低
     * 面试题：Vector与ArrayList的区别
     */
    private static void vector(){
        Vector<String> vec = new Vector();//泛型，约束类型
        vec.add("张老师");
        vec.add("王老师");
        vec.add("李老师");
        vec.add("孙老师");
        vec.add("刘老师");
        System.out.println("---------------------");
        int size = vec.size();
        for (int i = 0; i < size; i++){
            System.out.println(vec.get(i));
        }
    }
    /**
     * LinkedList
     * 1、实现原理：采用双向链表结构实现
     * 2、适合插入或者删除操作，性能高
     * 3、
     * 4、使用集合来存储多个不同类型的元素（对象），那么在处理时会比较麻烦
     * 5、线程安全，适合在多线程访问时使用，在单线程中效率较低
     * 面试题：Vector与ArrayList的区别
     */
    private static void linkedList(){
        LinkedList<String> ll = new LinkedList();//泛型，约束类型
        ll.add("张老师");
        ll.add("王老师");
        ll.add("李老师");
        ll.add("孙老师");
        ll.add("刘老师");
        System.out.println("---------------------");
        int size = ll.size();
        for (int i = 0; i < size; i++){
            System.out.println(ll.get(i));
        }
    }
}
