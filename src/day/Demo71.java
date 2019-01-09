/*
判断一个数是否为素数，素数又叫质数，是除了1和他本身之外不能被其他数整除的数
 */
import java.util.Scanner;

class Demo71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();

        //从1开始找能把num整除的数
        int chushu = 1;                      //能把num整除的除数
        for( int x=2; x < num; x++){
            if( num % x == 0){
                chushu = x;
            }
        }
        //如果这个除数比1大，就说明有一个数能把num整除，就说明不是素数
        if ( chushu >1 ){
            System.out.println(num + "不是素数");
        }else {
            System.out.println(num + "是素数");
        }
    }
}