package day0514;

import day0430.Demo03.classdefination.Engine;

class Factory {
    /*
    对象作为方法参数，当调用这个方法时，把实参对象的值传递给形参对象，现在形参对象与实参对象
    指向了堆中的同一个对象
    如果在方法体中，修改了形参对象的属性值，实际上也是修改了实参对象的属性值
     */
    public static void main(String[] args) {
        System.out.println();
    }
    public void changeColor(Car car, String newcolor){
        car.color = newcolor;
    }
    /*
    对象作为方法参数，当调用这个方法时，把实参对象的值传递给形参对象，现在形参对象与实参对象
    指向了堆中的同一个对象
    在方法体中，对象参进行重新赋值，现在形参对象指向了一个新的对象，不再指向形参堆中的对象
    再对形参对象做任何修改，跟实参对象没有关系
     */
    public void changeCar(Car car){
        Engine engine = new Engine(4.5,260);
        car = new Car("BMW", 130, "red", "SUV", 12 ,engine);
    }
}
