package test;

import java.util.Scanner;

/**
 * @ program: java_test
 * @ author:  TaoXueFeng
 * @ create: 2019-06-01 17:54
 * @ desc: 方法与数组
 **/

public class Test0601 {
    public static void main(String[] args) {
        getMenu();//调用方法，此时方法才能被运行
        System.out.print("请输入要打印的行数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //在调用方法时传入的参数，称为实参
        getStar(num);
    }
    /*
    public访问权限修饰符
    static静态修饰符，描述的方法可以直接调用
    void表示返回值（无返回值）
    getMenu方法名
    定义一个方法，在没有调用时是不会运行的
     */
    public static void getMenu() {
        System.out.println("------菜单------");
        System.out.println("1、");
        System.out.println("2、");
        System.out.println("3、");
        System.out.println("4、");
    }
    /*
    带参数的方法
    形参：在方法定义时的参数称为形参
     */
    public static void getStar(int line) {
        for(int i=1; i<=line; i++){
            for(int j=1; j<=i;j++){
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }
}
