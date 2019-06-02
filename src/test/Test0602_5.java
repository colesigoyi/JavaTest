package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-02 10:25
 * @ desc: 二分查找
 **/

public class Test0602_5 {
    public static void main(String[] args) {
        //必须保证数列是有序的
        int[] nums = {10,20,30,40,50,60,70};
        int index = binarySearch(nums, 60);
        System.out.println(nums[index]);

    }
    public static int binarySearch(int[] nums, int key){
        int start = 0;
        int end = nums.length-1;

        while (end >= start){
            int middle = (start + end)/2; //>>>1
            int midVal = nums[middle];
            if( midVal < key ){
                start = middle + 1;
            }else if(nums[middle] > key){
                end = middle - 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
