package day0425;

import java.util.Scanner;

/*
换零钱，把一元换成5毛、2毛和1毛的，有多少种换发，打印
 */
class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入钱数(单位：元)：");
        int x = sc.nextInt();

        int sum = 0;
        for(int wumao=0; wumao<=(x*10)/5;wumao++) {
            for (int ermao = 0; ermao <= (x*10)/2; ermao++){
                for(int yimao = 0; yimao<=x*10;yimao++){
                    if(wumao * 5 + ermao * 2 + yimao * 1 == x*10){
                        sum += 1;
                        System.out.println("5毛:"+wumao+",2毛:"+ermao+",1毛:"+yimao);
                    }
                }
            }
        }
        System.out.println("共有" + sum + "种方法。");
    }
}
