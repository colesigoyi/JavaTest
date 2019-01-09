package day0521.abstractmethod;
/*
矩形类继承平面图形类
如果子类继承了抽象类，子类需要重写抽象类中的抽象方法
 */
class Rectangle extends Graphics{
    int hight;
    int wight;

    //重写抽象类的抽象方法
    @Override
    public double getArea() {
        return hight*wight;
    }

    @Override
    public double getPerimeter() {
        return 2*(hight+wight);
    }
}
