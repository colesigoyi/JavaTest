package test;

import java.util.Scanner;

/**
 * @ program: java_test
 * @ author: taoxuefeng
 * @ create: 2019-05-31 19:43
 * @ desc: 作业：
 **/
/*
       通过键盘输入声明初始化一个圆柱体的高和底面半径，pai值是3.14，
 *             求圆柱体的体积，并显示输出圆柱体的体积
 */
public class Test0531 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入高：");
        int H = sc.nextInt();
        System.out.print("请输入底面半径：");
        int r = sc.nextInt();
        double pai = 3.14;
        double V = pai * H * r * r;
        System.out.println("圆柱体体积为：" + V);
    }
}

class Test0531_1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入五位数数值：");
        int num = sc.nextInt();
        for(int i=0; i<5; i++) {
            int a = num%10;
            num = num/10;
            sum = sum + a;
        }
        System.out.println("各位数的和为：" + sum);
    }
}

class Test0531_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入天数：");
        int day = sc.nextInt();
        int week = day/7 + 1;
        int lastDay = 365 - day;
        System.out.println("第" + day +  "天是第" + week +
                "周，还剩余" + lastDay + "天。");
    }
}

class Test0531_3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(!a & b);
        System.out.println(!a && b);
        System.out.println(a && b);
    }
}

class Test0531_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String s = (score > 60) ? "及格" : "不及格"; //三目运算
        System.out.println(s);
    }
}

class Test0531_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字母：");
        int c = sc.nextInt();
        if(c>=65 && c<=90) {
            System.out.println("大写");
        }else {
            System.out.println("小写");
        }
    }
}

class Test0531_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = sc.nextInt();
        if((year%4==0 && year%100 !=0) || year%400 ==0) {
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
    }
}

class Test0601_7 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        int num = sc.nextInt();
        for(int i=1; i<= num; i++) {
            sum = sum + i;
        }
        System.out.println("所有整数之和:" + sum);
    }
}

class Test0601_8 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        int num = sc.nextInt();
        while (i<=num) {
            sum = sum + i;
            i++;
        }
        System.out.println("所有整数之和:" + sum);
    }
}

class Test0601_9 {
    public static void main(String[] args) {

        int sum = 1;
        int i = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        int num = sc.nextInt();
        while (i<=num) {
            sum = sum * i;
            i++;
        }
        System.out.println(num + "的阶乘结果为:" + sum);
    }
}

class Test0601_10 {
    public static void main(String[] args) {
        int i = 1;
        for (int j = 1; j < 100; j++) {
            if (i % 2 == 0) {
                System.out.println("偶数:" + i);
            } else if (i % 2 == 1) {
                System.out.println("奇数:" + i);
            }
            if (i % 3 == 0) {
                System.out.println(i + "是3的倍数");
            }
            i++;
        }
    }
}

/*
阶乘结果为：4037913
 */
class Test0601_11 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            int a = 1;
            int b = 1;
            while (a<=i){
                b = b*a;
                a++;
            }
            sum = sum + b;
            i++;
        }while (i<=10);
        System.out.println("阶乘结果为：" + sum);
    }
}

class Test0601_12 {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            if(i==5) {
                continue;
            }
            System.out.println(i);
        }
        int j=0;
        for(;j<10;j++){
            System.out.println(j);
        }
        for(int i=0; i<10;){
            i++;
            System.out.println(i);
        }
        int z=0;
        for(; z<10;){
            z++;
            System.out.println(z);
        }
    }
}

class Test0601_13 {
    public static void main(String[] args) {
        for(int i=0; i<=200; i++) {
            if(i%7==0 && i%4 !=0) {
                System.out.println(i);
            }
        }
    }
}

/*
1 1 2 3 5 8 13 21 34 55 89 144
 */
class Test0601_14 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for(int i=1; i<=10; i++) {
            c = a;
            a = b;
            b = c+b;
            System.out.print(b + " ");
        }
    }
}

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */
class Test0601_15 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i;j++){
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }
}

/*
1x1=1
1x2=2 2x2=4
1x3=3 2x3=6 3x3=9
1x4=4 2x4=8 3x4=12 4x4=16
1x5=5 2x5=10 3x5=15 4x5=20 5x5=25
1x6=6 2x6=12 3x6=18 4x6=24 5x6=30 6x6=36
1x7=7 2x7=14 3x7=21 4x7=28 5x7=35 6x7=42 7x7=49
1x8=8 2x8=16 3x8=24 4x8=32 5x8=40 6x8=48 7x8=56 8x8=64
1x9=9 2x9=18 3x9=27 4x9=36 5x9=45 6x9=54 7x9=63 8x9=72 9x9=81
 */
class Test0601_16 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j + "x" + i + "=" + i*j + " ");
            }
            System.out.println();
        }
    }
}

/*
     *
    **
   ***
  ****
 *****
 */
class Test0601_17 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=5; j>0;j--){
                if(j>i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

/*
     *
    ***
   *****
  *******
 *********
 */
class Test0601_18 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=i; j<5; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}