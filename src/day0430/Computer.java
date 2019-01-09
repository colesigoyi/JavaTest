package day0430;
/*
计算机类
属性：品牌，价格，尺寸，颜色，内存大小，硬盘大小，cpu的主频....
行为：开机，关机，运行程序
 */
public class Computer {
    //属性保存在变量中
    String brand;                           //品牌
    int price;                              //价格
    double screenSize;                      //屏幕大小
    int memorySize;                         //内存大小
    int diskSize;                           //硬盘大小
    double cpuMainFrequency;                //cpu主频

    public void start() {
        System.out.println("电脑开机");
    }
    public void shutDown() {
        System.out.println("电脑关机");
    }
    public void runGame() {
        System.out.println("运行电脑游戏程序");
    }
    //在成员方法中，可以直接使用成员变量
    //把电脑的属性显示在控制台上
    public void showInfo() {
        System.out.println("---------电脑信息-----------");
        System.out.println("品牌：" + brand );
        System.out.println("价格：" + price );
        System.out.println("显示器尺寸：" + screenSize );
        System.out.println("内存：" + memorySize );
        System.out.println("硬盘：" + diskSize );
        System.out.println("CPU频率：" + cpuMainFrequency );
    }
}
