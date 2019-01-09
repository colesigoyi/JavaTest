package day1215;

import java.util.*;

/**
 * @author taoxuefeng
 * @create 2018-12-15 18:58
 * @desc 练习Map集合
 **/

public class UpdateMapStu {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("01","李同学");
        map.put("02","王同学");
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("key集合中的元素：");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Collection<String> coll = map.values();
        it = coll.iterator();
        System.out.println("values集合中的元素：");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
