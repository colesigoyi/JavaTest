package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-02 01:19
 * @ desc: 找数组中的最值
 **/

public class Test0602_4 {
    public static void main(String[] args) {
        int[] num = {13, 25, 62, 45, 74, 84, 34, 7, 54, 63, 32};
        System.out.println("最大值："+ getMax(num));
        System.out.println("最小值："+ getMin(num));
    }
    public static int getMax(int[] num){
        int maxNum = num[0];
        int len = num.length;
        for (int i : num) {
            if (maxNum < i) {
                maxNum = i;
            }
        }
        return maxNum;
    }
    public static int getMin(int[] num){
        int minNum = num[0];
        int len = num.length;
        for (int i : num) {
            if (minNum > i) {
                minNum = i;
            }
        }
        return minNum;
    }
}
