package test;

/**
 * @ program: java_test
 * @ author:  TaoXueFeng
 * @ create: 2019-06-01 20:31
 * @ desc: 数组:一组能够存储相同数据类型的数据集合
 *              数组一定要有长度
 *              数组中的每个数据称为元素
 *              数组元素的位置从0开始
 *              数组中的位置称为下标
 **/

public class Test0601_4 {
    public static void main(String[] args) {
        //第一种形式
        int[] nums_1 = new int[5];
        /*
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
         */
        for(int i=0; i<nums_1.length; i++){
            nums_1[i] = i+1;
        }

        //第二种形式
        int[] nums_2;
        nums_2 = new int[5];

        //第三种形式
        int[] nums_3 = new int[]{1,2,3,4,5};
        //第四种形式
        int[] nums_4 = {1,2,3,4,5};
        //所有的数组都有一个属性是：length
        System.out.println(nums_4.length);
    }
}
