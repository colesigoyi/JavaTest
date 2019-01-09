package day0521.abstractmethod;
/*
平面图形类
操作：面积、周长
遇到的问题：所有的平面图形可以进行求面积和周长，但是不痛的子类有不同的实现
在平面图形类中有两个操作，但是没有具体实现，在这种情况下，可以把这两个操作用抽象方法来表示

含有抽象方法的类必须定义为抽象类
 */
abstract class Graphics {
    //抽象方法，只有方法的声明，没有方法体
    public abstract double getArea();
    public abstract double getPerimeter();
}
