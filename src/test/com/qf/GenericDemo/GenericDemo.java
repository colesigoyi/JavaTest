package test.com.qf.GenericDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-29 22:51
 * @ desc: 泛型只作用于编译期检查，在编译后，会被擦除
 **/

public class GenericDemo {
    @Test
    public void test1(){
        List<String> list = new ArrayList<>();//...=new ArrayList() //...=new ArrayList<String>();
        list.add("txf");
        list.add("123");
        //list.add(10);
        //list.add(new Object());

        for (int i=0; i<list.size(); i++){
            //如果我们不能确定集合中的元素类型，那么我们需要在处里元素时要判断元素的类型是什么，才能执行相应的操作
            String s = list.get(i);
            System.out.println(s);
        }
    }
    @Test
    public void testNode(){
        NodeDemo<String> stringNode = new NodeDemo<>("txf");
        NodeDemo<Integer> intNode = new NodeDemo<>(100);

        System.out.println(stringNode.getData());
        System.out.println(intNode.getData());
    }
    //通配符
    @Test
    public void wildcardDemo(){
        NodeDemo<Number> n1 = new NodeDemo<>(1);
        NodeDemo<Integer> n2 = new NodeDemo<>(2);

        getData1(n1);
        //getData1(n2);//n2为Integer，与下面的Number不同,n1=n2不支持

        getData2(n2);

        getData3(n2);

        getData4(n2);
    }

    public static void getData1(NodeDemo<Number> node){
        System.out.println(node.getData());
    }

    /**
     * 使用通配符定义泛型的类型，此时只能读取输出，不能修改
     * @param node
     */
    public static void getData2(NodeDemo<?> node){//?表示所有类型
        //node.setData(20);//无法设值
        System.out.println(node.getData());
    }
    //通配符上限
    public static void getData3(NodeDemo<? extends Number> node){//?表示所有类型
        //只能是Number的子类
        //node.setData(20);//无法设值
        System.out.println(node.getData());
    }
    //通配符下限
    public static void getData4(NodeDemo<? super Integer> node){//?表示所有类型
        //只能是具体的类或者是父类
        System.out.println(node.getData());
    }

    /**
     * 泛型方法
     * 交换位置
     * @param array
     * @param i
     * @param t
     * @param <T>：泛型
     *        T[]：返回类型
     * @return
     */
    public static <T> T[] func(T[] array, int i, int t){
        T temp = array[i];
        array[i] = array[t];
        array[t] = temp;
        return array;
    }
    @Test
    public void test4(){
        String[] arrays = {"a","b","c","d"};
        String[] strs = func(arrays, 0, 1);
        System.out.println(Arrays.toString(strs));
    }
}
