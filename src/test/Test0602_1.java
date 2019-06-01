package test;

import java.util.Scanner;
import java.util.Random;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-02 00:51
 * @ desc:请输入一个小于50的数：45
 *        猜错了，继续加油！
 *        正确结果为：
 *        4 43 23 0 14
 **/

public class Test0602_1 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int len = nums.length;
        Random ranNum = new Random();
        for(int i=0; i<len; i++){
            nums[i] = ranNum.nextInt(50);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个小于50的数：");
        int userNum = sc.nextInt();

        boolean flag = false;
        for(int x:nums){
            if(userNum == x){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("恭喜你猜对了！");
        }else {
            System.out.println("猜错了，继续加油！");
            System.out.println("正确结果为：");
            for(int i=0; i<len; i++){
                System.out.print(nums[i] + " ");
            }
        }


    }
}
