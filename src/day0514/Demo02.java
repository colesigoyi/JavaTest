package day0514;

import day0430.Demo03.classdefination.Engine;

class Demo02 {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car mycar = new Car("Benz", 130, "black", "SUV", 13,engine);
        /*
        通过匿名对象调用实例方法
         */
        new Factory().changeColor(mycar, "white");
        mycar.showInfo();
        //方法的实参是一个匿名对象
        new Factory().changeCar(new Car("BMW",130,"black",
                "SUV",14,engine));


    }
}
