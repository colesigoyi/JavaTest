/*
判断一个数是否为素数，素数又叫质数，是除了1和他本身之外不能被其他数整除的数
 */
import java.util.Scanner;
class Demo70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();

        //先假设num是素数
        boolean isPrime = true;
        //从2到num-1，如果有一个数能把num整除，说明num不是素数
        for (int x = 2; x < num; x++){
            //如果有一个数x能把num整除，说明num不是素数
            if(num%x == 0){
                isPrime = false;        //修改素数标志
                break;
            }
        }
        //根据素数标志isPrime判断是否为素数
//      if( isPrime == false){
        if( !isPrime ){
            System.out.println(num + "不是素数");
        }else {
            System.out.println(num + "是素数");
        }
    }
}
