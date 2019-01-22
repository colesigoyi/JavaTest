package day0122;

import Utils.Utils;

/**
 * @program: java_test
 * @author: taoxuefeng
 * @create: 2019-01-22 23:06
 * @desc: 冒泡排序
 **/

public class BubbleSort {
    public static void main(String[] args) {
        int numslen = Utils.getNum();
        int[] nums = Utils.creatArray(numslen);
        System.out.println("冒泡排序之前nums：");
        Utils.printArray(nums);
        bubbleSort(nums);
        System.out.println("冒泡排序之后nums：");
        Utils.printArray(nums);
    }
    public static void bubbleSort(int[] nums) {
        int i, j;
        for(i=0; i<nums.length; i++) {
            for(j=1; j<nums.length-i; j++) {
                if(nums[j-1]>nums[j]) {
                    Utils.swapNum(nums, j-1, j);
                }
            }
        }
    }
}
