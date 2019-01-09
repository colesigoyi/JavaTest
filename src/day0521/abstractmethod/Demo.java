package day0521.abstractmethod;

class Demo {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.wight = 10;
        rect1.hight = 5;
        System.out.println("矩形的面积：" + rect1.getArea());
        System.out.println("矩形的周长："+ rect1.getPerimeter());

        Circle cir1 = new Circle();
        cir1.r = 10;
        System.out.println("圆形的面积：" + cir1.getArea());
        System.out.println("圆形的周长："+ cir1.getPerimeter());

        //Graphics是一个类，就可以定义引用类型的变量
        Graphics gra;
        //抽象类不能实例化对象
//      gra = new Graphics();
        //抽象类的引用可以指向子类的对象
        gra = rect1;
        System.out.println("图形的面积为：" + gra.getArea());
        gra = cir1;
        System.out.println("图形的周长为：" + gra.getPerimeter());

        GraphicUtil.printGraphicsInfo(rect1);
        GraphicUtil.printGraphicsInfo(cir1);
    }
}
