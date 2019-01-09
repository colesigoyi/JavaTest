/*
    按num op num的格式输入一个表达式，输出这个表达式的结果
    输入： 1 + 2 输出： 3
    输入： 3 * 5 输出： 15
    输入： 5 - 4 输出： 1
    输入： 4 / 2 输出： 2
 */
import java.util.Scanner;

class Demo37 {
    public static void main(String[] args) {
        //接受一个表达式
        Scanner sc = new Scanner(System.in);
        System.out.println("按num op num的格式输入一个表达式");
        int num1 = sc.nextInt();
        String op = sc.next();
        int num2 = sc.nextInt();

        //根据操作符计算这个表达式
        int result = 0;     //保存计算结果

        switch ( op ) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("只会做加减乘除。");
                break;
        }
        System.out.println( num1 + op + num2 + "=" + result );
    }
}
