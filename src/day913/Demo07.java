package day913;

import java.util.Arrays;

/**
 * @author taoxuefeng
 * @create 2018-10-07 19:31
 * @desc 数组的练习
 **/

public class Demo07 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,5,6,4,8};  //静态初始化
        int[] intArray2 = {1,2,3};  //静态初始化简化方式
        int[] intArray3 = new int[3];   //动态初始化
        float[] floatArray = new float[]{1.0F,2.0F,3.0F};
        double[] doubleArray = new double[]{1.0,2.0,3.0};

        for(int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i] + " ");
        }
        int sum = 0;
        for(int i=0; i<intArray.length; i++) {
            sum += intArray[i];
        }
        System.out.println("和是：" + sum);
        int maxNum = intArray[0];
        for(int i=0; i<intArray.length; i++) {
            if(maxNum < intArray[i]) {
                maxNum = intArray[i];
            }
        }
        System.out.println("其中最大值为：" + maxNum);
        //foreach循环
        for(int num : intArray) {
            System.out.println(num);
        }
        int num1 = 1;
        int result1 = 0;
        result1 += num1;
        int num2 = 1;
        int result2 = ++num2;
        System.out.println(result1);
        System.out.println(result2);
        /*System.out.println(Arrays.toString(intArray2));
        System.out.println(intArray2[0]);
        System.out.println(Arrays.toString(floatArray));
        System.out.println(Arrays.toString(doubleArray));*/
    }
}
