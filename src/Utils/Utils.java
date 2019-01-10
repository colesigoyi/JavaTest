package Utils;

import java.util.Scanner;

/**
 * @author taoxuefeng
 * @create 2019-01-10 12:37
 * 功能描述：工具类，负责统一整理常用功能
 **/

public class Utils {
    /**
    * 功能: 交换数组中两个元素位置
    * @Param: [nums, before, after]
    * @return: void
    */
    public static void swapNum(int nums[], int before, int after) {
        int middle = nums[before];
        nums[before] = nums[after];
        nums[after] = middle;
    }
    /**
    * 功能: 打印数组
    * @Param: [nums]
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
    /**
    * 功能: 获得一个数组
    * @Param: [num]
    * @return: int[]
    */
    public static int[] creatArray(int num) {
        int[] numList = new int[num];
        for(int i=0;i<num;i++) {
            numList[i] = (int)(Math.random()*100);
        }
        return numList;
    }
    /**
    * 功能: 获得一个数
    * @Param: []
    * @return: int
    */
    public static int getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入随机数个数：");
        int numslen = sc.nextInt();
        return numslen;
    }
}