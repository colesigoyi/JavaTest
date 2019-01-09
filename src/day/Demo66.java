/*
求1-2+3-4+5-6...n的和
 */
import java.util.Scanner;
class Demo66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入正整数n");
        int n = sc.nextInt();

        int  sum = 0;               //保存表达式的和

        for (int i = 1; i <= n ; i++){
            if(i%2 == 1){
                sum += i;
            }else {
                sum -= i;
            }
        }
        System.out.println("sum=" + sum );
    }
}
