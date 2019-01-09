package day0430;

class DemoRectangle {
    public static void main(String[] args) {
        //使用当前包中的rectangle类
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 5;
        rectangle.showInfo();

        //使用java.awt中的rectangle类,可以使用完整类名
        java.awt.Rectangle rectangle2 = new java.awt.Rectangle();
        rectangle2.width = 5;
        rectangle2.height = 2;
    }
}
