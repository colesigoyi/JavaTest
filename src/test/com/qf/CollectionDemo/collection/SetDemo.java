package test.com.qf.CollectionDemo.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-27 11:36
 * @ desc: Set接口
 *            1、无序（不保证顺序）
 *            2、不允许重复元素
 *         HashSet、TreeSet、LinkedHashSet
 *
 *         如果要排序，选择TreeSet
 *         如果不要排序，也不用保证顺序：就选择HashSet
 *         不要排序，要保证顺序：选择LinkedHashSet
 **/

public class SetDemo {
    public static void main(String[] args) {
        hashSet();
        treeSet();
        linkedHashSet();
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
     *
     * 小结：
     *  （1）、哈希表的存储结构：数组+链表，数组里的每一个元素以链表的形式存储
     *  （2）、如何把对象存储到哈希表中，先计算对象的hashCode值，再对数组的长度求余数16，来决定对象要存储在数组的哪个位置
     *  （3）、解决hashSet中的重复值使用方式参考第6点
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
     * 有序的，基于TreeMap（二叉树数据结构）,对象需要比较大小，通过对象比较器Comparator来实现
     * 对象比较器还可以用来去除重复元素,如果自定义的数据类没有实现比较器接口，将无法添加到TreeSet集合中。
     *
     */
    private static void treeSet(){
        TreeSet<Cat> tree = new TreeSet<>(new CatComparator());//加入CatComparator比较器

        Cat c1 = new Cat("喵喵",5,1);
        Cat c2 = new Cat("花花",2,2);
        Cat c3 = new Cat("汤姆",5,3);
        Cat c4 = new Cat("喵喵",3,1);//c1与c4属性值相同

        tree.add(c1);
        tree.add(c2);
        tree.add(c3);
        tree.add(c4);

        System.out.println(tree.size());//2 age=5的当成同一个

        for (Cat c: tree){
            System.out.println(c);
        }
        System.out.println("---------------------");
    }

    /**
     *LinkedHashSet:
     * 实现原理：哈希表和链接列表实现
     * 维护着一个运行与所有条目的双重链接列表，此链接列表定义了迭代顺序，即按照将元素插入到set中的顺序（插入顺序）进行迭代
     */
    private static void linkedHashSet(){
        LinkedHashSet<Cat> lhs = new LinkedHashSet<>();
        Cat c1 = new Cat("喵喵",5,1);
        Cat c2 = new Cat("花花",2,2);
        Cat c3 = new Cat("汤姆",5,3);
        Cat c4 = new Cat("喵喵",3,1);//c1与c4属性值相同
        lhs.add(c1);
        lhs.add(c2);
        lhs.add(c3);
        lhs.add(c4);

        for (Cat c:lhs){
            System.out.println(c);
        }

    }
}
