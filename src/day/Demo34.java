/*
    case的穿透
    从键盘上输入一个数字代表月份，输出某月对应的季节
 */
import java.util.Scanner;

class Demo34 {
    public static void main(String[] args) {
        //从键盘上输入一个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字代表月份");
        int month = sc.nextInt();

        //判断季节
        String season = "";     //保存月份对应的字节

        switch ( month ) {
            case 12:
            case 1:
            case 2:
                season = "冬季";
                break;
            case 3:
            case 4:
            case 5:
                season = "春季";
                break;
            case 6:
            case 7:
            case 8:
                season = "夏季";
                break;
            case 9:
            case 10:
            case 11:
                season = "秋季";
                break;
            default:
                season = "你输入的数字有误";
                break;
        }
        System.out.println( season );
    }
}
