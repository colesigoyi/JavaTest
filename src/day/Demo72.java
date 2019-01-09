/*
*
**
***
****
*****
 */
import java.util.Scanner;
class Demo72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入打印*号的个数");
        int num = sc.nextInt();
        for(int x = 1; x <=num; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
