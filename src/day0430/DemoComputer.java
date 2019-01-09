package day0430;
/*
一个类可以定义多个对象
每个对象都可以有自己的属性和行为
 */
public class DemoComputer {
    public static void main(String[] args) {
        //创建对象
        Computer computer1 = new Computer();
        //访问对象的成员
        computer1.start();
        computer1.runGame();
        computer1.shutDown();
        computer1.brand = "lenovo";
        computer1.cpuMainFrequency = 3.4;
        computer1.diskSize = 512;
        computer1.memorySize = 16;
        computer1.price = 6000;
        computer1.screenSize = 15.6;
        //把电脑的属性显示到控制台上
        System.out.println(computer1.brand);
        System.out.println(computer1.cpuMainFrequency);
        System.out.println(computer1.diskSize);
        System.out.println(computer1.memorySize);
        System.out.println(computer1.price);
        System.out.println(computer1.screenSize);

        //一个雷可以创建多个对象
        Computer computer2 = new Computer();
        //每个对象都有自己的属性和行为
        computer2.brand = "dell";
        computer2.cpuMainFrequency = 3.2;
        computer2.diskSize = 1024;
        computer2.memorySize = 8;
        computer2.price = 5200;
        computer2.screenSize = 17;

        computer2.showInfo();
    }
}
