/*
随机生成一个0~100之间的整数

提示用户输入猜测的数字，如果不相等，提示大小，并继续让用户输入，如果相等就结束游戏
    如果用户输入的大了，就提示大了
    如果用户输入的小了，就提示小了
 */
import java.util.Scanner;

class Demo53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 100);
        int count = 0;

        while ( true ){
            System.out.println("请输入猜测的数字");

            int gussyNum = sc.nextInt();
            count++;
            if( gussyNum > num ){
                System.out.println("猜测大了");
            } else if ( gussyNum < num ){
                System.out.println("猜测小了");
            }else {
                System.out.println("猜对了，你猜了" + count + "次");
                break;
            }
        }
    }
}
