package day0521.abstractmethod;
/*
工具类，打印任何图形的面积和周长
 */
class GraphicUtil {
    public static void printGraphicsInfo(Graphics gra) {
        System.out.println("图形的面积为：" + gra.getArea());
        System.out.println("图形的周长为：" + gra.getPerimeter());
    }
}
