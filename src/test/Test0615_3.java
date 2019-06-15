package test;

import java.util.Scanner;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 13:46
 * @ desc:异常处理
 *               1、Throwable是异常的基类，氛围Error和Exception，在编程中我们关注Exception
 *               2、Exception分为编译期异常（受检）和运行期异常（非受检）
 *               3、异常会导致程序中断，无法继续执行
 *               4、在开发中，我们需要把可能出现的异常代码使用try语句包裹
 *               5、处理异常可以让程序保持运行状态
 *               6、catch可以有多个，顺序为从子类到父类，大的放后面，小的放前面
 **/

public class Test0615_3 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数：");
        int num1 = sc.nextInt();
        System.out.print("请输入除数：");
        int num2 = sc.nextInt();
        div(num1, num2);
        */
        method();

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
            //产生异常，系统会生成异常类的实例化对象
        }catch (ArithmeticException e){//数学算数异常
            System.out.println("除数不能为0");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            System.out.println("发生异常");
        }finally {  //最终语句
            System.out.println("执行完毕");
        }
        System.out.println("程序结束");
    }
    //面试题
    private static int method(){
        int a = 10;
        int b = 5;
        try{
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            int c = a/b;
            System.out.println("a/b=" + c);
            return c;//如果try里有return，回去先找有没有finally，执行finally之后再执行return
        }catch (Exception e){
            //代码测试时使用
            e.printStackTrace();
        }finally {
            System.out.println("finally");//会执行finally
        }
        return -1;
    }
}
