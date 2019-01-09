/*
求任意两个数范围之间的奇数之和
 */
import java.util.Scanner;

class Demo68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int m = sc.nextInt();
        int n = sc.nextInt();
        //保证m < n
        if(m > n){
            int t = m;
            m = n;
            n = t;
        }
        //遍历这两个整数m和n范围内所有的数，如果是奇数就累加
        int sum = 0;
        for( int i = m; i <= n; i++){
            if( i%2 != 0){
                sum +=i;
            }
        }
        System.out.println(m + "和" + n + "范围内奇数和为：" + sum);
    }
}
