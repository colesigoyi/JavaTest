/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */
import java.util.Scanner;
class Demo75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入打印*号的个数");
        int num = sc.nextInt();
        for (int x = 1; x <= num; x++) {
            //打印空格，空格的数量==num-行数
            for (int y = 1; y <= num - x; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int x = num - 1; x >= 1; x--) {
            //打印空格，空格的数量==num-行数
            for (int y = 1; y <= num - x; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= x; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}