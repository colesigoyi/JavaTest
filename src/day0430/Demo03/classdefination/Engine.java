package day0430.Demo03.classdefination;
/*
发动机类
 */
public class Engine {
    double  displacement;       //排量
    int     powerSize;          //功率
    //构造方法
    public Engine(){
    }
    public Engine(double _displacement,int _powerSize){
        displacement = _displacement;
        powerSize = _powerSize;
    }
    public void start() {
        System.out.println("发动机点火");
    }
    public void stop() {
        System.out.println("发动机熄火");
    }
}
