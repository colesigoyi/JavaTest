package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-02 01:33
 * @ desc: 排序算法:稳定排序算法是相同的数位置不变
 *                      1.冒泡排序是稳定排序算法
 *                      2.选择排序是不稳定的排序算法
 *                      3.直接插入排序算法
 **/

public class Test0602_4_sort {

    public static void main(String[] args) {
        int[] nums = {32,53,5,35,64,53,753,82,123,145,643,235,864,75,83,47,43};
        int len = nums.length;
        System.out.print("排序前：");
        for(int i:nums){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("冒泡排序：");
        bubbleSort(nums);

        System.out.println();
        System.out.print("选择排序：");
        selectSort(nums);

        System.out.println();
        System.out.print("插入排序：");
        insertSort(nums);
    }
    public static void bubbleSort(int[] nums){
        int len = nums.length;
        int ep;
        for(int i=0; i<len; i++){
            for(int j=1; j<len-i; j++){
                if(nums[j]<nums[j-1]){
                    ep = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = ep;
                }
            }
        }
        for(int i:nums){
            System.out.print(i + " ");

        }
    }

    public static void selectSort(int[] nums){
        int len = nums.length;
        int minIndex = 0;
        for(int i=0; i<len; i++){
            minIndex = i;
            for(int j=i+1; j<len; j++){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){  //判断是不是和自己比较
                nums[i] = nums[minIndex];
            }

        }
        for(int i:nums){
            System.out.print(i + " ");

        }
    }

    public static void insertSort(int[] nums){
        int len = nums.length;
        int temp;
        for(int i=1; i<len; i++){
            temp = nums[i];
            int j = 0;
            for(j=i-1; j>=0; j--){
                if(nums[j]>temp){
                    nums[j+1] = nums[j];
                }else {
                    break;
                }
            }
            if(nums[j+1] != temp){
                nums[j+1] = temp;
            }
        }
        for(int i: nums){
            System.out.print(i + " ");
        }
    }
}
