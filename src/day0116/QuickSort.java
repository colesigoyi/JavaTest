package day0116;

import Utils.Utils;

/**
 * @program: java_test
 * @author: taoxuefeng
 * @create: 2019-01-16 23:13
 * @desc: 快速排序
 **/
/*
快速排序由于排序效率在同为 O(N*logN)的几种排序方法中效率较高，因此经常被采用，再加上快速排序思想
——分治法也确实非常实用；

快速排序是 C.R.A.Hoare 于 1962 年提出的一种划分交换排序。它采用了一种分 治的策略，通常称其为分治法
(Divide-and-ConquerMethod)。 该方法的基本思想是:
1.先从数列中取出一个数作为基准数。
2.分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
3.再对左右区间重复第二步，直到各区间只有一个数。
虽然快速排序称为分治法，但分治法这三个字显然无法很好的概括快速排序的全部步骤。因此我的对快速
排序作了进一步的说明:挖坑填数+分治法；
 */
public class QuickSort {
    public static void main(String[] args) {
        int numslen = Utils.getNum();
        int[] nums = Utils.creatArray(numslen);
        System.out.println("快速排序之前nums：");
        Utils.printArray(nums);
        quickSort(nums, 0, nums.length-1);
        System.out.println("快速排序之后nums：");
        Utils.printArray(nums);
    }
    public static void quickSort(int[] s, int l, int r) {
        if (l < r) {
            int i = adjust(s, l, r);
                quickSort(s, l, i - 1);
                quickSort(s, i + 1, r);
            }
        }
    public static int adjust(int[] nums, int f, int l) {
        int i = f;
        int j = l;
        int X = nums[f];
        while (i < j) {
            while (i < j && nums[j] > X) {
                j--;
            }
            if (i<j) {
                nums[i] = nums[j];
                i++;
            }
            while (i < j && nums[i] < X) {
                i++;
            }
            if (i<j) {
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i] = X;
        return i;
    }
}
