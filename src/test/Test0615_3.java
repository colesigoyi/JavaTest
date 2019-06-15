package test;

import java.util.Scanner;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 13:46
 * @ desc:异常处理
 **/

public class Test0615_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数：");
        int num1 = sc.nextInt();
        System.out.print("请输入除数：");
        int num2 = sc.nextInt();
        div(num1, num2);

    }

    private static void div(int num1, int num2){
        int[] arr = {1,2,3,4,5};

        try {

            //System.out.println(arr[5]);//ava.lang.ArrayIndexOutOfBoundsException: 5 数组下标越界
            arr = null;
            System.out.println(arr.length);//java.lang.NullPointerException 空指针异常
            int result = num1/num2;
            System.out.println("result=" + result);
            //catch排前面的范围要小，范围大的放后面
        }catch (ArithmeticException e){//数学算数异常
            System.out.println("除数不能为0");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            System.out.println("异常报告");
        }
        System.out.println("程序结束");
    }
}
