package day0430;
/*
在不同的包中可以定义重名的类
在同一个包中不能定义重名的类
矩形
属性：宽，高
行为：周长，面积
 */
class Rectangle {

    int width;
    int height;

    public int getArea() {
        return width*height;
    }
    public int getPerimeater() {
        return 2*(width+height);
    }

    public void showInfo() {
        System.out.println("-------矩形信息-------");
        System.out.println("宽:" + width + ",长:" + height);
        System.out.println("面积：" + getArea() + "，周长：" + getPerimeater());
    }
}
