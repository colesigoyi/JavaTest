/*
在屏幕上打印*号，个数由用户确定-----循环嵌套
 */
import java.util.Scanner;
class Demo73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入打印*号的行数");
        int m = sc.nextInt();
        System.out.println("请输入打印*号的列数");
        int n = sc.nextInt();
        for(int x = 1; x <=m; x++) {
            for (int y = 1; y <= n; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}