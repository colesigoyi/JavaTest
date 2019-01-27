package day0127;

import Utils.Utils;

/**
 * @program: java_test
 * @author: taoxuefeng
 * @create: 2019-01-27 19:54
 * @desc: 快速排序
 **/

public class QuickSort {
    public static void main(String[] args) {
        int numslen = Utils.getNum();
        int[] nums = Utils.creatArray(numslen);
        System.out.println("冒泡排序之前nums：");
        Utils.printArray(nums);
        quickSort(nums, 0, nums.length-1);
        System.out.println("冒泡排序之后nums：");
        Utils.printArray(nums);
    }

    public static int adjust(int[] nums, int f, int l) {
        int i = f, j = l;
        int X = nums[f];
        while( i < j){
            while( i < j && nums[j] > X) {
                j--;
            }
            if( i < j) {
                nums[i] = nums[j];
                i++;
            }
            while (i < j && nums[i] < X) {
                i++;
            }
            if( i< j) {
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i] = X;
        return i;
    }
    public static void quickSort(int[] s, int l, int r) {
        if(l < r) {
            int i = adjust(s, l, r);
            quickSort(s, l, i-1);
            quickSort(s, i+1, r);
        }
        }
    }
