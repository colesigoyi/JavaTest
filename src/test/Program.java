package test;

/**
 * @program: java_test
 * @author: taoxuefeng
 * @create: 2019-05-27 18:43
 * @desc: lambda
 **/

public class Program {
    public static void main(String[] args) {
        // 1、使用接口实现类
        Comparator comparator1 = new MyComparator1();
        Comparator comparator2 = new MyComparator2();

        // 2、使用匿名内部类
        Comparator comparator3 = new Comparator() {
            @Override
            public int compare(int a, int b) {
                return a-b;
            }
        };

        // 3、使用Lambda表达式
        Comparator comparator4 = (a, b) -> a-b;
    }
}

//实现comparator接口
class MyComparator1 implements Comparator {
    @Override
    public int compare(int a, int b){
        return a-b;
    }
}

class MyComparator2 implements Comparator {
    @Override
    public int compare(int a, int b){
        return a*b;
    }
}

//接口
@FunctionalInterface
//修饰函数式接口，接口中的抽象方法只能有一个
interface Comparator {
    //方法
    int compare(int a, int b);
}
