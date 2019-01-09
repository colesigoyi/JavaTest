package day0521.abstractmethod;
/*
如果一个类继承了抽象类，没有重写抽象类的抽象方法，这个类也需要定义为抽象类
 */
class Triangle extends Graphics {
    int hight;
    int wight;

    @Override
    public double getArea() {
        return hight*wight/2;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
