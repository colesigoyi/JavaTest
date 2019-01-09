/*
switch表达式可以使枚举类型
 */
class Demo39 {
    public static void main(String[] args) {

//      TrafficLight light = Red;   //Error:找不到符号
        TrafficLight light = TrafficLight.Red;
        System.out.println( light );

        switch ( light ){
            case Red:
                System.out.println("红灯,停");
                break;
            case Green:
                System.out.println("绿灯,行");
                break;
            case Yellow:
                System.out.println("黄灯,等");
                break;
        }
    }
}
/*
    枚举是一种数据类型，就类似位于我们常用的类
    使用enum定义枚举类型,enum后面跟的是自定义的类型名称
    在枚举的大括弧中，可以定义这一种数据类型的取值
 */
enum TrafficLight{
    Red, Green, Yellow      //通过TrafficLight定义的变量只能去这三个值
}