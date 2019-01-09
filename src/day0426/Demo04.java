package day0426;
/*
定义一个没有返回值，没有参数的方法
 */
class Demo04 {
    public static void main(String[] args) {
        /*
        程序从main方法开始执行，可以在main方法中调用printRose()方法
        没有参数，没有返回值的方法，调用方法的语句作为单独的一条语句
        通过方法名来调用方法
        调用方法时，程序就会转到方法内部去执行，在方法体执行完毕后再返回到调用的位置
         */
        printRose();    //调用无参，无返回值的方法
    }
    /*
    定义方法，在屏幕上打印一朵玫瑰
    1、方法的定义位置，在类中，在其他方法的外面，方法之间是并列的，不能再一个方法内部再定义一个方法
    2、在屏幕上打印内容不需要返回值，方法的返回值类型用void表示
    3、打印一朵玫瑰，也不需要传递函数，没有参数
    4、方法名：printRose是程序员自己定义的

    特别注意：
    定义了方法之后，仅仅是在类中添加了一组指令，这一组指令不会自动执行，需要进行方法的调用
     */
    public static void printRose(){
        System.out.println("{@}");
        System.out.println("\\|/");
        System.out.println(" | ");
    }
}
