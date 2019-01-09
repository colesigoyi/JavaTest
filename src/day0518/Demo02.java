package day0518;

import day0514.Car;

class Demo02 {
    public static void main(String[] args) {

        //1、对象向上转型，让父类的引用指向子类的对象
        Pet pet ;
        Dog daHuang = new Dog("大黄","白色",5,"八哥");
        pet = daHuang;      //向上转型



        Pet pet2 = new Cat("mimi","黄色",3);       //向上转型

        //1、对象向下转型，是向上转型的逆操作
        Dog dog22 = (Dog) pet;      //向下转型

        Cat cat22 = (Cat) pet;
        /*
        上一行编译正确，没有语法错误，但是运行时产生
        Exception in thread "main" java.lang.ClassCastException: day0518.Dog cannot be cast to day0518.Cat
        类型转换异常
        现在pet引用堆中的一个Dog对象，不能强制转换为Cat对象
        解决办法：
                在对象向下转换时，先判断堆中的对象是否为目标类型的对象
         */

        //instanceof运算符
        if( pet instanceof Dog ){
            //如果pet引用指向堆中的对象是一个Dog类型的对象就返回true，否则就返回false
            dog22 = (Dog) pet;
        }
        if(pet instanceof Cat){
            //如果pet引用指向堆中的对象时Cat类型对象就返回true
            cat22 = (Cat) pet;
        }

        //
        Pet pet33 = new Pet("hehehe","red",1);
        dog22 = (Dog) pet33;
    }
}
