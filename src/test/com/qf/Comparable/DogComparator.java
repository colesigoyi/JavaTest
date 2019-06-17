package test.com.qf.Comparable;

import java.util.Comparator;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-17 19:53
 * @ desc:
 **/

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getAge()-o2.getAge();
    }
}
