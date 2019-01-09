/*
从键盘上输入一个时间，输出他的下一秒
 */
import java.util.Scanner;

class Demo32 {
    public static void main(String[] args) {
        //从键盘上输入一个时间
        Scanner sc = new Scanner(System.in);
        System.out.println("请按hh mm ss 的格式输入一个时间");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        if (hour >=60 || minute >=60 || second >=60 || hour < 0 || minute < 0 || second < 0){
            System.out.println("输入的时间有误");
            return;
        }
        System.out.println("当前时间为：" + hour + ":" + minute + ":" + second);

        //计算下一秒
        second++;

        //修正时间
        if (second == 60) {
            //如果是60秒了，分钟加1,秒置0
            minute++;
            second = 0;
            //如果分钟加1后为60，分钟置0，小时加1
            if (minute == 60) {
                hour++;
                minute = 0;
                //如果小时加1后为24，小时置0
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        //输出
        System.out.println("下一秒为：" + hour + ":" + minute + ":" + second);
    }
}
