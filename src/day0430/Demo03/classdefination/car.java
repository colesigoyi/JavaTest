package day0430.Demo03.classdefination;
/*
在一个类中，我们可以使用自定义类型
汽车
属性：品牌，价格，颜色，车型，油耗，排气量，发动机功率
行为：启动，停止，显示信息
 */
public class car {
    String  carBrand;           //汽车品牌
    int     price;
    String  color;
    String  motorcycleType;     //车型
    double  oilConsumption;     //油耗


    //使用自定义的类型来定义成员变量
    Engine  carEngine= new Engine();          //发动机

    public car(){
    }
    public car(String _carBrand,int _price,String _color,
               String _motorcycleType,double _oilConsumption,
               Engine _engine){
        carBrand = _carBrand;
        price = _price;
        color = _color;
        motorcycleType = _motorcycleType;
        oilConsumption = _oilConsumption;
        carEngine = _engine;
    }
    public car(String _carBrand,int _price,String _color,
               String _motorcycleType,double _oilConsumption,
               double _displacement,int _powerSize) {
        carBrand = _carBrand;
        price = _price;
        color = _color;
        motorcycleType = _motorcycleType;
        oilConsumption = _oilConsumption;
        carEngine = new Engine(_displacement, _powerSize);
    }



    public void start() {
        System.out.println("小汽车启动，实际上要发动机点火");
        carEngine.start();
    }
    public void stop() {
        System.out.println("小汽车停止,实际上是发动机熄火");
        carEngine.stop();
    }
    public void showInfo() {
        System.out.println("------小汽车信息-----");
        System.out.println("carBrand:" + carBrand);
        System.out.println("price:" + price + "w");
        System.out.println("color:" + color);
        System.out.println("motorcycleType:" + motorcycleType);
        System.out.println("oilConsumption:" + oilConsumption);
        //排量和功率实际上是发动机的排量和功率
        System.out.println("displacement:" + carEngine.displacement);
        System.out.println("powerSize:" + carEngine.powerSize);
    }
}
