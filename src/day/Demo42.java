/*
建议数学学习工具。随机产生两个小于10的随机整数a和b，提示用户输入a-b的差，并保证差大于0
并判断用户计算的额是否正确，Math.random()可以产生[0,1)之间的随机小数
 */
import java.util.Scanner;

class Demo42 {
    public static void main(String[] args) {
        //随机产生两个小于10的随机整数a和b
        int a =(int)(Math.random() * 10);
        int b =(int)(Math.random() * 10);

        //保证a>b,如果a<b,就把a和b互换
        if (a < b){
            int t = a;
            a = b;
            b = t;
        }
        //提示用户输入a+b的和，并读取
        System.out.println("请输入" + a + "-" + b + "的计算结果");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        //判断用户计算的是否正确
        if (result == a-b){
            System.out.println("计算正确");
        }else {
            System.out.println("计算不正确，正确结果为" + (a-b));
        }
    }
}
