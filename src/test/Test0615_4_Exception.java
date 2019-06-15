package test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 17:13
 * @ desc: 异常处理
 **/

public class Test0615_4_Exception {
    public static void main(String[] args) {
        try {
            div(20,0);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("结束");//用try使得后面的代码可以执行
        //div(20, 0);
        input();
    }
    //throws带s在方法的声明上使用，throw与throws配合一起使用
    private static int div(int a, int b) throws ArithmeticException{
        try {
            int c = a/b;
            return c;
        }catch (ArithmeticException e){
            throw new ArithmeticException("除数不能为0");//当一个方法执行到throw，跳出，后面不执行
        }finally {
            System.out.println("运行结束");
        }
    }
    private static void input(){
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e){
            System.out.println("输入不匹配");
        }
    }
}
