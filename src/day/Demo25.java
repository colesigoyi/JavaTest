/*
整钱兑零钱，如果有一个小数2.94，显示包含多少个1元的，5毛的，2毛的，1毛的，5分的，2分的，1分的
 */
import java.util.Scanner;

class Demo25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入找零余额：");
        double money = sc.nextDouble();

        //因为小数不准确，我们需要把元为单位的钱数换算成以分为单位
        int sumFen = (int)(money * 100);        //以分为单位的总钱数

        //先计算包含多少个1元的
        int yiYuanNum = sumFen / 100;
        sumFen = sumFen % 100;                  //找完一块的，还剩的余额

        int wuMaoNum = sumFen / 50;
        sumFen = sumFen % 50;                   //找完五毛的，还剩的余额

        int erMaoNum = sumFen / 20;
        sumFen = sumFen % 20;

        int yiMaoNum = sumFen / 10;
        sumFen = sumFen % 10;

        int wuFenNum = sumFen / 5;
        sumFen = sumFen % 5;

        int erFenNum = sumFen / 2;
        sumFen = sumFen % 2;

        //现在sumFen中还剩的就是1分钱的数量

        if (yiYuanNum > 0){
            System.out.println("一元的的个数：" + yiYuanNum);
        }
        if (wuMaoNum > 0){
            System.out.println("五毛钱的个数：" + wuMaoNum);
        }
        if (erMaoNum > 0){
            System.out.println("两毛钱的个数：" + erMaoNum);
        }
        if (yiMaoNum > 0){
            System.out.println("一毛钱的个数：" + yiMaoNum);
        }
        if (wuFenNum > 0){
            System.out.println("五分钱的个数：" + wuFenNum);
        }
        if (erFenNum > 0){
            System.out.println("两分钱的个数：" + erFenNum);
        }
        if (sumFen > 0){
            System.out.println("一分钱的个数：" + sumFen);
        }
    }
}
