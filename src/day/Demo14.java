/*
    赋值运算符
        变量 = 表达式
        把表达式的值赋值给左侧的变量
        注意：
            表达式的数据类型要与左侧变量的类型兼容
 */
public class Demo14 {

    public static void main(String[] args) {
        //赋值
        int xx = 123;
        xx = 123 + 5;
        int yy = xx / 2;

//        yy = 12.34;       //类型不兼容

        /*
            复合赋值，自反赋值
            +=  -=  *=  /=
         */
        xx = 10;
        xx += 5;        //相当于xx = xx + 5;
        System.out.println( xx );

        //复合赋值隐含着强制类型转换
        byte bb = 10;
        bb += 5;        //相当于 bb = (byte)(bb + 5);
        System.out.println( bb );
    }
}
