package day0426;
/*
定义一个方法，没有参数，有返回值
 */
class Demo07 {
    public static void main(String[] args) {
        /*
        通过方法名来调用方法
        如果有返回值，需要对这个返回值进行处理
            1、可以把返回值打印到屏幕上
            2、可以把返回值保存到一个变量中
            3、把返回值作为其他表达式的一部分
         */
        System.out.println( getRanInt());
        int num = getRanInt();
        System.out.println( num );

        if( getRanInt()%2==0 ) {
            System.out.println("随机生成了一个偶数：" + getRanInt());
        }else {
            System.out.println("随机生成了一个奇数：" + getRanInt());
        }
    }
    /*
    定义方法，返回0~100之间的随机整数
    返回值类型为int类型，制定了返回值类型之后，方法体当中必须通过return语句返回一个整数
    @return 返回[0,100)之间的随机整数
     */
    public static int getRanInt() {
        return (int)(Math.random() * 100);
    }
}
