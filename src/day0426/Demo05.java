package day0426;

import java.util.Scanner;

/*
定义一个有参数，没有返回值的方法
 */
class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        oddEven( a );
        /*
        在调用方法时，如果方法有参数，需要传递对应的数据
        1、方法没有返回值，方法调用语句就作为单独一条语句存在
        2、在定义方法时制定了一个int类型的参数，在调用方法时，就需要传递一个int类型的数据
         */
        oddEven(10);    //传递一个int类型的常量，把10传递给参数num
        int n = 11;
        oddEven(n);          //传递一个int类型的常量，把变量n的值11传递给参数num
        oddEven( 3+4 );//传递一个int类型的表达式，把3+4的和7传递给参数num
        oddEven( n + 5);//传递一个int类型的表达式，把n+5的和16传递给参数num


    }
    /*
    判断一个数的奇偶性，在屏幕上打印奇数还是偶数
    @param num 用来接受一个数
     */
    public static void oddEven(int num) {
        if( num%2==0){
            System.out.println(num + "是偶数");
        }else {
            System.out.println(num + "是奇数");
        }

    }
}
