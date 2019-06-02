package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-02 13:20
 * @ desc: 模拟双色球综合案例
 *          1、用户选择是机选还是手选号码
 *          2、接受用户选号（6红1蓝）
 *          3、生成系统号码（6红1蓝）
 *          4、比较系统号码和用户号码，记录个数
 *          5、验证是否中奖
 *          6、系统号码排序
 *          7、公布结果
 **/

public class Test0602_7_doubleball {
    public static void main(String[] args) {

        //定义相关的变量
        int[] userRedBall = new int[6];//用户选择的红球
        int[] sysRedBall = new int[6];//系统选择的红球
        int userBlueBall = 0;//用户选择的蓝球
        int sysBlueBall = 0;//系统选择的蓝球
        int redCount = 0;//记录用户选择正确的红球数
        int blueCount = 0;//记录用户选择正确的蓝球数
        int[] redBall = new int[33];//用于存储1~33的红球号码

        Random r = new Random();

        //需要随机生成6个1~33之间不重复的数（算法）
        for (int i=0; i<redBall.length; i++){
            redBall[i] = i+1;
        }
        //游戏开始
        System.out.println("-------双色球选号系统------");
        System.out.println("请选择选号方式：1、机选   2、手选");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;//用于判断选择方式的正确性
        while (flag) {
            int isAuto = sc.nextInt();
            switch (isAuto) {
                case 1:
                    //机选
                    comSelectionNum(redBall,userRedBall);//机选红球
                    userBlueBall = r.nextInt(16) + 1;
                    flag = false;
                    break;
                case 2:
                    //手选
                    System.out.println("请选择6个红球号码（1~33）：");
                    for(int i=0; i<userRedBall.length; i++) {
                        userRedBall[i] = sc.nextInt();
                    }
                    System.out.println("请选择1个蓝球号码（1~16）：");
                    userBlueBall = sc.nextInt();
                    flag = false;
                    break;
                default:
                    System.out.println("请选择选号方式：1、机选   2、手选");
                    break;
            }
        }
        //系统随机生成号码
        //红球
        comSelectionNum(redBall, sysRedBall);
        //蓝球
        sysBlueBall = r.nextInt(16)+1;

        //统计结果
        //统计红球
        for(int i=0; i<userRedBall.length; i++){
            for(int j=0; j<sysRedBall.length-redCount; j++){
                if(userRedBall[i] == sysRedBall[j]){
                    int temp = sysRedBall[j];
                    sysRedBall[j] = sysRedBall[sysRedBall.length-1-redCount];
                    sysRedBall[sysRedBall.length-1-redCount] = temp;
                    redCount++;
                    break;
                }
            }
        }
        //统计蓝球
        if(userBlueBall == sysBlueBall){
            blueCount = 1;
        }
        //验证是否中奖
        if(blueCount==0 && redCount <= 3){
            System.out.println("很遗憾，未中奖。");
        }else if (blueCount == 1 && redCount <3){
            System.out.println("六等奖：5元");
        }else if ((blueCount == 1 && redCount == 3) || (blueCount==0 &&
                redCount == 4)){
            System.out.println("五等奖：20元");
        }else if ((blueCount == 1 && redCount == 4) || (blueCount==0 &&
                redCount == 5)){
            System.out.println("四等奖：200元");
        }else if (blueCount == 1 && redCount == 5){
            System.out.println("三等奖：2000元");
        }else if(blueCount == 0 && redCount == 6){
            System.out.println("二等奖：150万");
        }else if (blueCount == 1 && redCount == 6){
            System.out.println("一等奖：500万");
        }else {
            System.out.println("系统有误！");
        }

        //
        System.out.println("本期红球中奖号码：");
        sort(sysRedBall);
        System.out.println(Arrays.toString(sysRedBall));
        System.out.println("本期蓝球中奖号码：" + sysBlueBall);

        //公布用户号码
        System.out.println("您选择的红球号码：");
        sort(userRedBall);
        System.out.println(Arrays.toString(userRedBall));
        System.out.println("本期蓝球中奖号码：" + userBlueBall);

        System.out.println("感谢您的参与！");

    }

    public static void sort(int[] ball){
        int ep = 0;
        for(int i=0; i<ball.length; i++){
            for(int j=1; j<ball.length-i; j++){
                if(ball[j]<ball[j-1]){
                    ep = ball[j-1];
                    ball[j-1] = ball[j];
                    ball[j] = ep;
                }
            }
        }
    }

    //用于在指定数列中，随机生成多个不重复的数算法
    public static void comSelectionNum(int[] redBall, int[] userRedBall) {
        Random r = new Random();
        int index = -1;
        for(int i=0; i<userRedBall.length; i++){
            index = r.nextInt(redBall.length-i);
            userRedBall[i] = redBall[index];

            int temp = redBall[index];
            redBall[index] = redBall[redBall.length-1-i];
            redBall[redBall.length-1-i] = temp;
        }
    }
}

