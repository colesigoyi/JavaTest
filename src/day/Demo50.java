/*
    使用标志控制循环次数

    输入任意多个正整数，输入-1结束，输出最大值
    输入：45
         123
         789
         125
         -1
    输出：
         789
 */
import java.util.Scanner;

class Demo50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;            //用来保存输入的正整数
        int maxNum = 0;
        while (num != -1){
            System.out.println("请输入一个正整数,输入-1结束");
            num = sc.nextInt();
            //判断刚输入的数比maxNum的值还大，当前这个数就是最大数
            if (maxNum < num){
                maxNum = num;
            }
        }
        if (maxNum > 0){
            System.out.println("其中最大值为:" + maxNum);
        }else {
            System.out.println("你还没有输入正整数");
        }
    }
}
