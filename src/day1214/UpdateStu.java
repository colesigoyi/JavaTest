package day1214;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author taoxuefeng
 * @create 2018-12-14 20:42
 * @desc 实现Comparable接口，重写该接口的compareTo()方法
 **/

public class UpdateStu implements Comparable<Object>{
    String name;
    long id;

    public UpdateStu(String name, long id) { //构造方法
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        UpdateStu upstu = (UpdateStu) o;
        int result = id > upstu.id ? 1 : (id==upstu.id ? 0:-1);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        UpdateStu stu_1 = new UpdateStu("李同学",01011);
        UpdateStu stu_2 = new UpdateStu("陈同学",01021);
        UpdateStu stu_3 = new UpdateStu("王同学",01031);
        UpdateStu stu_4 = new UpdateStu("马同学",01041);
        TreeSet<UpdateStu> tree = new TreeSet<>();
        tree.add(stu_1);
        tree.add(stu_2);
        tree.add(stu_3);
        tree.add(stu_4);
        Iterator<UpdateStu> it = tree.iterator();
        System.out.println("Set集合中的所有元素：");
        while (it.hasNext()) {
            UpdateStu stu = (UpdateStu)it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
        it = tree.headSet(stu_2).iterator();
        System.out.println("截取前面部分的集合：");
        while (it.hasNext()) {
            UpdateStu stu = (UpdateStu)it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
        it = tree.subSet(stu_2,stu_3).iterator();
        System.out.println("截取中间部分的集合：");
        while (it.hasNext()) {
            UpdateStu stu = (UpdateStu)it.next();
            System.out.println(stu.getId() + " " + stu.getName());
        }
    }
}
