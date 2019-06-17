package test.com.qf.Comparable;

import java.util.Arrays;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-17 19:15
 * @ desc: 对象比较器:
 *         自定义对象要实现比较排序
 *          1、要实现Comparable接口的comparaTo方法
 **/

public class ComparableDemo {
    public static void main(String[] args) {

        int[] nums = {23,52,15,63,43,73};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] names = {"jakes", "tom", "nancy", "Kit"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Cat[] cats = {new Cat("小白",1),new Cat("小黑",3), new Cat("小花", 2)};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));// test.com.qf.Comparable.Cat cannot be cast to java.lang.Comparable

        Dog[] dogs = {new Dog("小白",1),new Dog("小黑",3), new Dog("小花", 2)};
        Arrays.sort(dogs, new DogComparator());
        System.out.println(Arrays.toString(dogs));
    }
}
