package day1214;

import java.util.ArrayList;
import java.util.List;

/**
 * @author taoxuefeng
 * @create 2018-12-14 20:07
 * @desc 查找特定位置
 **/

public class Gather {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        for(int j=0; j<list.size(); j++) {
            System.out.println(list.get(j));
        }
        int i = (int)(Math.random()*list.size());
        System.out.println("随机获取数组中的元素" + list.get(i));
        list.remove(i);
        System.out.println("将获取的元素从数组中移除后，数组中的元素是：");
        for(int j=0; j<list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}
