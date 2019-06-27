package test.com.qf.CollectionDemo.collection;

import java.util.Comparator;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-27 12:55
 * @ desc: 比较器
 **/

public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge()-o2.getAge();
    }
}
