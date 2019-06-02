package test;

import java.util.Arrays;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-02 10:52
 * @ desc: Arrays工具类使用
 **/

public class Test0602_6_Arrays {
    public static void main(String[] args) {
        int[] nums = {45,67,78,98,123,435,678};

        //二分查找
        int index = Arrays.binarySearch(nums, 123);
        System.out.println("找到下标："  + index);

        //输出数组
        for(int i:nums){
            System.out.println(i);
        }
        //在测试输出数据时使用更加方便
        System.out.println(Arrays.toString(nums));

        //排序
        int[] nums_2 = {43,64,12,3,54,74,34,75,32};
        Arrays.sort(nums_2);
        System.out.println(Arrays.toString(nums_2));

        //数组的复制
        int[] nums_3 = Arrays.copyOf(nums_2,10);
        System.out.println(Arrays.toString(nums_3));
        //
        int[] newNum = new int[nums.length];
        System.arraycopy(nums,0,newNum,0,
                nums.length);
        System.out.println(Arrays.toString(newNum));
        //小结：数组的复制
        /*
        效率由高到低：System.arraycopy -> Arrays.copyOf -> for
         */

        //判断两个数组的值是否相等
        System.out.println(Arrays.equals(nums_2, nums_3));
        //填充数组
        Arrays.fill(newNum, 0);
        System.out.println(Arrays.toString(newNum));
    }
}
