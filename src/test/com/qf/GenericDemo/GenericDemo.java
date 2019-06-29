package test.com.qf.GenericDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-29 22:51
 * @ desc: 泛型
 **/

public class GenericDemo {
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("txf");
        list.add(10);
        list.add(new Object());

        for (int i=0; i<list.size(); i++){
            //如果我们不能确定集合中的元素类型，那么我们需要在处里元素时要判断元素的类型是什么，才能执行相应的操作

        }
    }
}
