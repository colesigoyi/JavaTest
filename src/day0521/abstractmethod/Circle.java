package day0521.abstractmethod;

class Circle extends Graphics {
    int r;
    final static double PI = 3.1415926;

    @Override
    public double getArea() {
        return PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }
}
