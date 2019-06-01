package test;

/**
 * @ program: java_test
 * @ author: taoxuefeng
 * @ create: 2019-05-23 12:32
 * @ desc:
 **/

public class Test {
    public static void main(String[] args) {
        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);


        double[] List = {1.1, 2.2, 3.3, 4.4, 5.5};
        double max = 0;
        for(double num: List){
            if( num > max){
                max = num;
            }
        }
        System.out.println("max is:" + max);

        for(double element: List){
            System.out.println(element);
        }
    }
}
