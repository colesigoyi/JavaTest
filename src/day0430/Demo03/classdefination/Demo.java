package day0430.Demo03.classdefination;

import java.util.Calendar;

class Demo {
    public static void main(String[] args) {
        //生产一台小汽车
        car car1 = new car();

        car1.carBrand = "Benz";     //贴标签
        car1.color = "red";         //喷漆
        car1.motorcycleType = "SUV";//设置类型
        car1.oilConsumption = 15;   //标注油耗
        car1.price = 130;            //定价
        //现生产一台发动机
        Engine engine11 = new Engine();
        engine11.displacement = 6.0;
        engine11.powerSize = 480;
        //把发动机装配到汽车上
        car1.carEngine = engine11;
        car1.showInfo();
        car1.start();
        car1.stop();

        Engine bmwEngine = new Engine(16,500);
        car myCar = new car("BMW",150, "red",
                "SUV",15,bmwEngine);
        myCar.showInfo();



        car myCar22 = new car();
        myCar22.showInfo();
    }
}
