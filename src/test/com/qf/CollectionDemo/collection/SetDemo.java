package test.com.qf.CollectionDemo.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-27 11:36
 * @ desc: Set接口
 *            1、无序（不保证顺序）
 *            2、不允许重复元素
 *         HashSet、TreeSet、LinkedHashSet
 **/

public class SetDemo {
    public static void main(String[] args) {
        hashSet();
    }

    /**
     * HashSet
     * 1、实现原理：基于哈希表（HashMap）实现
     * 2、不允许重复，可以有一个null元素
     * 3、不保证顺序恒久不变
     * 4、添加元素时把元素作为HashMap的Key存储，HashMap的value使用一个固定的object对象
     * 5、排除重复元素是通过equals来检查两个元素是否相同
     * 6、判断两个对象是否相同，先判断两个对象的hashCode是否相同（如果两个对象的hashcode相同，
     * 不一定是同一个对象，如果不同，那一定是不同对象），如果不同，则两个对象不是同一个对象，如果相同，还要进行equals判断，
     * equals相同则是同一个对象，equals不同则是不同对象
     * 7、自定义对象，要认为属性值都相同时为同一个对象时，这种需求就要重写对象所在类的hashCode与equals方法
     */
    private static void hashSet(){
        Set<String> set = new HashSet<>();
        set.add("1_刘备");
        set.add("2_曹操");
        set.add("3_张飞");
        set.add("4_关羽");
        set.add("5_诸葛亮");
        set.add("5_诸葛亮");

        System.out.println(set.size());//5

        String[] name = set.toArray(new String[]{});
        for (String s: name){
            System.out.println(s);
        }

        Cat c1 = new Cat("喵喵",5,1);
        Cat c2 = new Cat("花花",2,2);
        Cat c3 = new Cat("汤姆",4,3);
        Cat c4 = new Cat("喵喵",5,1);//c1与c4属性值相同

        Set<Cat> cats = new HashSet<>();
        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        cats.add(c4);
        System.out.println(cats.size());

        for (Cat c: cats){
            System.out.println(c);
        }
        System.out.println("id=" + c1.getId() + ",c1=" + c1.hashCode());
        System.out.println("id=" + c2.getId() + ",c2=" + c2.hashCode());
        System.out.println("id=" + c3.getId() + ",c3=" + c3.hashCode());
        System.out.println("id=" + c4.getId() + ",c4=" + c4.hashCode());

    }

    /**
     *TreeSet
     */
    private static void treeSet(){

    }

    /**
     *LinkedHashSet
     */
    private static void linkedHashSet(){

    }
}
