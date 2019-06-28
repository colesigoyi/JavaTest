package test.com.qf.CollectionDemo.collection;

import java.util.*;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-28 13:57
 * @ desc: 迭代器
 **/

public class IteratorDemo {
    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();
        Cat c1 = new Cat("喵喵",5,1);
        Cat c2 = new Cat("花花",2,2);
        Cat c3 = new Cat("汤姆",5,3);
        Cat c4 = new Cat("喵喵",3,1);
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        forEach(list);
        System.out.println("--------------------------");
        iterator(list);
        System.out.println("--------------------------");
        enumeration();
        System.out.println("--------------------------");
        foreach();

    }

    //foreach(1.5后)
    private static void forEach(Collection<Cat> c){
        for (Cat cat : c){
            System.out.println(cat);
        }
    }

    //Iterator(1.5之前统一处理迭代集合)
    private static void iterator(Collection<Cat> c){
        Iterator<Cat> iter = c.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    private static void enumeration(){
        Vector<String> vs = new Vector<>();
        vs.add("tom");
        vs.add("jack");
        vs.add("nancy");
        vs.add("lily");

        Enumeration<String> enu = vs.elements();
        while (enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }
    }

    /**
     * JDK1.8新的迭代方法
     */
    private static void foreach(){
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jack");
        list.add("nancy");
        list.add("lily");

        //list.forEach((String s)->{System.out.println(s);});
        list.forEach(s->System.out.println(s));
        //list.forEach(System.out::println);//::表示调用方法
    }
}
