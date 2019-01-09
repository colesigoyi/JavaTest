package day1215;

import java.util.*;

/**
 * @author taoxuefeng
 * @create 2018-12-15 19:30
 * @desc 通过HashMap类实例化Map集合，并遍历该map集合，然后创建TreeMap实例实现将集合中的元素顺序输出
 **/

public class Emp {
    private String e_id;
    private String e_name;

    public Emp(String e_id, String e_name) {
        this.e_id = e_id;
        this.e_name = e_name;
    }

    public String getE_id() {
        return e_id;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

}
class MapText {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Emp emp1 = new Emp("351","张三");
        Emp emp2 = new Emp("381","李思");
        Emp emp3 = new Emp("451","赵六");
        Emp emp4 = new Emp("521","黄其");
        Emp emp5 = new Emp("111","王五");

        map.put(emp4.getE_id(),emp4.getE_name());
        map.put(emp5.getE_id(),emp5.getE_name());
        map.put(emp1.getE_id(),emp1.getE_name());
        map.put(emp2.getE_id(),emp2.getE_name());
        map.put(emp3.getE_id(),emp3.getE_name());

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = (String)it.next();
            String name = (String)map.get(str);
            System.out.println(str + " " + name);
        }
        TreeMap<String,String> treemap = new TreeMap<>();
        treemap.putAll(map);
        Iterator<String> iter = treemap.keySet().iterator();
        System.out.println("TreeMap类实现的Map集合，键对象升序：");
        while (iter.hasNext()) {
            String str = (String)iter.next();
            String name = (String)treemap.get(str);
            System.out.println(str + " " + name);
        }
    }
}
