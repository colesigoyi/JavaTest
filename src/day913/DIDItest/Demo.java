package day913.DIDItest;

import java.util.Scanner;

/**
 * @author taoxuefeng
 * @create 2018-09-13 下午3:08
 * @desc
 **/


/**
 * 我们把值包含因子  2、 3、 5 的数称作丑数，求第 num 个丑数，我们将 1 看做第一个丑数。
 * 例如 4  、    6  、   8 都是丑数，但是 14 不是 因为14 包含因子 7
 * @author luzi
 *
 */
public class Demo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();
            long startTime = System.currentTimeMillis();
            System.out.println(UglyNumber2(num));
            long endTime = System.currentTimeMillis();
            System.out.println("运行时间 ： " + (endTime - startTime) + "ms");
            startTime = System.currentTimeMillis();
            System.out.println(UglyNumber(num));
            endTime = System.currentTimeMillis();
            System.out.println("运行时间 ： " + (endTime - startTime) + "ms");
        }

    }

    //用暴力的方法，从 1 开始枚举自然数 到 第num 个丑数 target
    private static int UglyNumber(int num) {
        // TODO Auto-generated method stub
        if(num <= 0)
            return 0;
        int n = 0;
        int count = 0;
        while(count < num){
            n++;
            if(isUgly(n))
                count++;
        }

        return n;
    }

    public static boolean isUgly(int num){
        while(num%2 == 0)
            num /= 2;
        while(num%3 == 0)
            num /= 3;
        while(num%5 == 0)
            num /= 5;
        return (num == 1) ? true : false;
    }

    //根据丑数的规律，用一个辅助数组，大大减小时间复杂度
    public static int UglyNumber2(int num){
        if(num <= 0)
            return 0;
        int[] arr = new int[num];
        arr[0] = 1;
        int temp2 = 0;
        int temp3 = 0;
        int temp5 = 0;

        int nextNum = 1;

        while(nextNum < num){
            int min = Math.min(Math.min(arr[temp2]*2, arr[temp3]*3), arr[temp5]*5);
            arr[nextNum] = min;

            while(arr[temp2]*2 <= min)
                temp2++;
            while(arr[temp3]*3 <= min)
                temp3++;
            while(arr[temp5]*5 <= min)
                temp5++;

            nextNum++;
        }

        return arr[num - 1];
    }

}
