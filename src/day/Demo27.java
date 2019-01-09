/*
    从键盘输入两个点的坐标，计算这两个点的距离，Math.pow(a,b)返回a的b次方
 */
import java.util.Scanner;

class Demo27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("计算两点距离");
        System.out.println("请输入第一个点的坐标：");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("请输入第二个点的坐标：");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int l = ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 );
        double L = Math.pow(l,0.5);
        System.out.println("(" + x1 +"," + y1 + ")" + "与" + "(" + x2 +"," + y2 + ")" +"这两点距离为：" + L);
    }
}
