/*
石头/剪刀/布游戏，随机生成一个0、1、2的数字分标表示石头、剪刀、布
提示用户输入0、1、2，判断输赢
 */
import java.util.Scanner;

class Demo44 {
    public static void main(String[] args) {
        //堆积生成一个0、1、2的数字分标表示石头/剪刀/布
        int computer = (int)(Math.random()*3);

        //提示用户输入0、1、2
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入0、1、2的数字分别代表石头、剪刀、布");
        int person = sc.nextInt();

        //判断输赢
        if ( (computer == 0 && person == 1) || (computer == 1 && person == 2) || (computer == 2 && person == 0)){
            //计算机赢
            System.out.println("计算机赢");
        }else if ((computer == 0 && person == 2) || (computer == 1 && person == 0) || (computer == 2 && person == 1)){
            System.out.println("人赢");
        }else {
            System.out.println("平局");
        }
        //输出计算机和人分别出的是什么
    }
}
