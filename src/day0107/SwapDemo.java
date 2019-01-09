package day0107;

import java.util.*;

/**
 * @author taoxuefeng
 * @create 2019-01-07 20:32
 * @desc 有数组a[n]，利用java代码讲述组元素颠倒
 **/

public class SwapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入随机数个数：");
        int num = sc.nextInt();

        List numList2 = new ArrayList();

        int[] numList = new int[num];
        for(int i=0;i<num;i++) {
            numList[i] = (int)(Math.random()*100);
            numList2.add((int)(Math.random()*100));
        }
        System.out.println(numList2);
        System.out.print("随机数组为：");
        System.out.println(Arrays.toString(numList));
        System.out.print("前后调换：");
        swap(numList);
        System.out.println(Arrays.toString(numList));
        Sort(numList);
        System.out.print("递增排序为：");
        System.out.println(Arrays.toString(numList));
    }
    public static void swap(int a[]) {
        int len = a.length;
        for(int i=0; i<len / 2; i++) {
            int temp = a[i];
            a[i] = a[len-1-i];
            a[len-1-i] = temp;
        }
    }

    public static void Sort(int[] list) {
        int i, j;
        for(i=0; i<list.length; i++) {
            for(j=1; j<list.length-i; j++) {
                if(list[j-1] > list[j]) {
                    SortUtils.swapNum(list,j-1,j);
                }
            }
        }
    }
}
class SortUtils {
    public static void swapNum(int nums[], int before, int after) {
        int moddle = nums[before];
        nums[before] = nums[after];
        nums[after] = moddle;
    }
    /**
     * @Description: 打印数组
     * @param nums 数组
     * @return: void
     */
    public static void printArray(int nums[]) {

        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
