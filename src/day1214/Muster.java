package day1214;

import java.util.*;

/**
 * @author taoxuefeng
 * @create 2018-12-14 19:51
 * @desc 遍历集合练习
 **/

public class Muster {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();//实例化集合类对象
        //分别通过ArrayList、LinkedList类实例化List集合
        //List<E> list1 = new ArrayList<>();
        //List<E> list2 = new LinkedList<>();
        for (int i=0; i<20; i++) {
            list.add(i);
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int str = (int)it.next();
            System.out.println(str);
        }
    }
}
