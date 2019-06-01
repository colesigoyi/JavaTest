package test;

/**
 * @ program: java_test
 * @ author:  TaoXueFeng
 * @ create: 2019-06-01 20:43
 * @ desc: 数组的遍历
 **/

public class Test0601_5 {
    public static void main(String[] args) {
        int[] scores = {34,64,62,35,74};
        System.out.println(scores.length);

        //遍历
        int len = scores.length;
        for(int i=0; i<len; i++){
            int score = scores[i];
            System.out.print(score + " ");
        }
        System.out.println();
        //foreach JDK1.5之后的新增特性
        for (int sc: scores){
            System.out.print(sc + " ");
        }
        //调用方法
        System.out.println();
        System.out.println("---------------");
        print_1(scores);
        System.out.println("---------------");
        print_2(1,2,3,4,5);
    }
    public static void print_1(int[] x){
        int len = x.length;
        for(int i=0; i<len; i++){
            System.out.println(x[i]);
        }
    }
    //JDK1.5可变参数
    //可变参数只能是参数列表中的最后一个
    //可变参数可作为数组使用
    public static void print_2(int... x){
        int len = x.length;
        for(int i=0; i<len; i++){
            System.out.println(x[i]);
        }
    }
}
