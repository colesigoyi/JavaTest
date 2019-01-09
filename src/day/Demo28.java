/*
    验证三角形的有效性，提示用户输入三个边长，判断是否构成三角形
 */
import java.util.Scanner;

class Demo28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三条边长：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a+b>c && a+c>b && b+c>a ){
            System.out.println(a + "," + b + "," + c + "这三条边可以构成三角形");
        }
        else {
            System.out.println("这三条边构不成三角形");
        }
    }
}
