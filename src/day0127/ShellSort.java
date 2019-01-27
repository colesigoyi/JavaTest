package day0127;

import Utils.Utils;

/**
 * @program: java_test
 * @author: taoxuefeng
 * @create: 2019-01-27 20:14
 * @desc: 希尔排序
 **/

public class ShellSort {
    public static void main(String[] args) {
        int numslen = Utils.getNum();
        int[] nums = Utils.creatArray(numslen);
        System.out.println("冒泡排序之前nums：");
        Utils.printArray(nums);
        shellSort(nums);
        System.out.println("冒泡排序之后nums：");
        Utils.printArray(nums);
    }
    public static void shellSort(int[] nums) {
        int len = nums.length;
        int temp, gap = len/2;
        while(gap > 0) {
            for(int i = gap; i<len; i++) {
                temp = nums[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && nums[preIndex] > temp) {
                    nums[preIndex + gap] = nums[preIndex];
                    preIndex -= gap;
                }
                nums[preIndex + gap] = temp;
            }
            gap /= 2;
        }
    }
}
