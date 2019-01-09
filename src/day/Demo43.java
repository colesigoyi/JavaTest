/*
    彩票游戏，随机生成两个一位数的随机数字，提示用户输入猜测的数字
    如果完全匹配奖10000，职匹配数字没有匹配顺序奖金3000，职匹配一个数字奖金1000
    如果生成的随机数为18，如果用户输入18奖金10000，如果用户输入81奖金3000，如果用户输入16奖金1000
 */
import java.util.Scanner;

class Demo43 {
    public static void main(String[] args) {
        //随机生成两个一位数的随机数
        int a =(int)(Math.random() * 10);
        int b =(int)(Math.random() * 10);

        System.out.println( a + "," + b);

        //提示用户输入猜测的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你猜测的数字");
        int x = sc.nextInt();
        int y = sc.nextInt();

        //判断
        if (a==x && b==y){
            System.out.println("你真牛B，中了10000元");
        }else if (a==y && b==x){
            System.out.println("运气稍差，中了3000元");
        }else if (a==x || a==y || b==x || b==y){
            System.out.println("继续加油，中了1000元");
        }else {
            System.out.println("BD，欢迎再来玩哦");
        }
    }
}
