/*
算数运算符
    + — * / %(求余) ++ --
    算数表达式就是算术运算符连接起来的式子

    运算结果可能超出数据类型表示范围
    整数相除结果为整数
    除数为0的情况
    余数的符号和被除数一致
    自增和自减
    前缀和后缀的区别
    自增和自减隐含着强制类型转换
    表达式的数据类型
 */
class Demo11 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        System.out.println( result );
        //运算结果可能超出数据类型表示范围
        num1 = 2147483647;
        num2 = 1;
        result = num1 + num2;
        System.out.println( result );   //-2147483648
        /*
            num1的二进制为：
                0111 1111 1111 1111 1111 1111 1111 1111
            num2的二进制为：
                0000 0000 0000 0000 0000 0000 0000 0001
            +
            -------------------------------------------
                1000 0000 0000 0000 0000 0000 0000 0000
         */
        num1 = -2147483648;
        num2 = 1;
        result = num1 - num2;
        System.out.println( result );       //2147483647

        //面试题：是否存在一个整数x，使得x+1<x成立？

        //除法,整数相除，结果为整数，舍弃小数部分
        System.out.println( 10 / 3 );       //3
        System.out.println( 10 / -3 );      //-3
        System.out.println( -10 / 3 );      //-3
        System.out.println( -10 / -3 );     //3

        //除数，除数为0的情况
//        System.out.println( 10 / 0 );
        /*
            整数相除，0作为除数时，编译没有语法错误
            运行时会产生算数异常，java.lang.ArithmeticException: / by zero at Demo11.main
            注意：
                整数相除时，保证除数不能为0
         */

        System.out.println( 10 / 0.0 );     //Infinity
        System.out.println( 10 / -0.0 );     //-Infinity
        System.out.println( -10 / 0.0 );     //-Infinity
        System.out.println( 0 / 0.0 );     //NaN
        System.out.println( -0 / 0.0 );     //NaN Not a Number
        //小数相除时，除数为0运行通过，但是结果不是一个数

        //求余，余数的符号与被除数的符号一致
        System.out.println( 10 % 3 );       //1
        System.out.println( 10 % -3 );      //1
        System.out.println( -10 % 3 );      //-1
        System.out.println( -10 % -3 );     //-1

        //自增与自减
        /*
            自增与自减是针对变量进行的操作
            自增就相当于变量的值加1，自建就相当于变量的值减1
         */
        int xx = 10;
        xx++;       //相当于xx = xx + 1
        System.out.println( xx );   //11
        xx = 10;
        xx--;       //相当于xx = xx -1
        System.out.println( xx );   //9

        //自增与自减有前缀和后缀两种形式
        /*
            ++xx 这是前缀形式：先自增后运算
            xx-- 这是后缀形式：先参与运算再自减
         */
        xx = 10;
        int yy = ++xx;
        /*
            先把xx变量的值取出来，加1
                xx = xx + 1
            再把变量xx的值11赋值给变量yy
         */
        System.out.println( yy );   //11

        xx = 10;
        yy = xx++;
        /*
            后缀形式
            先把变量xx的值保存到一个临时变量当中
                int tem = xx;   //temp==10
            变量xx进行自增
                xx = xx + 1;    //xx==11
            实际上是临时变量参与运算
                yy = temp;      //yy==10
         */
        System.out.println( yy );   //10
        System.out.println( xx );   //11

        //面试题：
        xx = 10;
        xx = xx++;
        /*
            int temp = xx;      //temp==10
            等号右侧的变量xx进行自增
                xx = xx + 1     //xx == 11
            把临时变量temp的值赋值给左侧的xx的变量
                xx = temp       //xx == 10
         */
        System.out.println( xx );   //10

        //
        byte bb = 10;
//      bb = bb + 1;        //错误: 不兼容的类型: 从int转换到byte可能会有损失
        bb++;               //相当于bb = (byte)(bb + 1);
        System.out.println( bb );       //11

        char cc = 'A';
        cc++;               //相当于cc = (char)(cc + 1);
        System.out.println( cc );       //B

        //算数表达式的数据类型
        /*
            在进行算术运算时，整数，小数，字符都可以参与运算，整个算数表达式的数据类型是
            如果有double类型数据参与运算，整个表达式就是double类型
            否则，如果有float类型数据参与运算，整个表达式就是float类型
            否则，如果有long类型数据参与运算，整个表达式就是long类型
            否则，如果有int类型数据参与运算，整个表达式就是int类型
         */

    }
}
