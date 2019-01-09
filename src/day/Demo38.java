/*
输入字母，输出对应的星期几，第一个字符不能判断，提示用户输入第二个字符
输入：M 输出：型一起
输入：W 输出：星期三
输入：F 输出：星期五
输入：T
        请输入第二个字符
        输入：U 输出：星期二
        输入：H 输出：星期四
输入：S
        请输入第二个字符
        输入：U 输出：星期日
        输入：A 输出：星期六
 */
import java.util.Scanner;

class Demo38 {
    public static void main(String[] args) {
        //接受第一个字符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个代表星期几的字符：M/W/F/T/S");
        String dayStr = sc.next();

        //根据第一个字符判断星期几
        String weekDay = "";        //保存星期几
        switch (dayStr) {
            case "M":
            case "m":
                weekDay = "星期一";
                break;
            case "W":
            case "w":
                weekDay = "星期三";
                break;
            case "F":
            case "f":
                weekDay = "星期五";
                break;
            case "T":
            case "t":
                System.out.println("请输入第二个字符：");
                String day2 = sc.next();
                //根据第2个字符进行判断
                if ("U".equals(day2) || "u".equals(day2)) {

                    weekDay = "星期二";
                } else if ("H".equals(day2) || "h".equals(day2)) {
                    weekDay = "星期四";
                }
                else {
                    System.out.println("你输入的第二个字符不合理，应该为U/H");
                }
                break;
            case "S":
            case "s":
                System.out.println("请输入第二个字符：");
                String day3 = sc.next();
                //根据第2个字符进行判断
                if ("U".equals(day3) || "u".equals(day3)) {

                    weekDay = "星期日";
                } else if ("A".equals(day3) || "a".equals(day3)) {
                    weekDay = "星期六";
                }
                else {
                    System.out.println("你输入的第二个字符不合理，应该为U/A");
                }
                break;
            default:
                System.out.println("你输入的第一个字符不合理，应该为：M/W/F/T/S");
                break;
        }
        System.out.println(weekDay);
    }
}
