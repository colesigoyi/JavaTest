package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-02 01:11
 * @ desc:
 **/

public class Test0602_3 {
    public static void main(String[] args) {
        int[][] scores= {{78,88,89},{67,57,89},{87,68,99}};
        int classLen = scores.length;
        for(int i=0; i<classLen; i++){
            int sum = 0;
            int count = scores[i].length;
            for(int j=0; j<count; j++){
                sum += scores[i][j];
            }
            int avg = sum/count;
            System.out.println("第"+ (i+1) + "班的平均成绩是：" + avg);
        }
    }
}
