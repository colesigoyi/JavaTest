/*
    类型转换
 */
class Demo10 {

    public static void main(String[] args) {
        //自动类型转换

        byte bb = 123;
        short ss = bb;
        int ii = ss;
            ii = bb;
        long gg = ii;
             gg = ss;
             gg = bb;
        float ff = gg;
              ff = ii;
              ff = ss;
              ff = bb;
        double dd = ff;
               dd = gg;

        //自动类型转换也有可能丢失精度
        ii = 2147456321;
        ff = ii;            //int可以自动转换为float类型
        System.out.println( ff );       //2.14745638E9

        //强制类型转换
        //小数转换为整数，舍弃小数部分
        dd = 3.789;
        ii = (int)dd;                   //把double类型强制转换为int类型
        System.out.println( ii );

        //大的整数类型转换为小的整数类型，只把对应的低位字节转换
        ii = 270;
        bb = (byte)ii;
        System.out.println( bb );
        /*
            ii变量在计算机中的存储形式：
                0000 0000 0000 0000 0000 0001 0000 1110
            把ii强制转换为byte类型时，只是把最后一个字节的数存储到bb变量中
            bb变量中存储的内容是： 0000 1110
         */

        //大的整数转换为小的整数，可能出现数据错误
        ii = 130;
        bb = (byte)ii;
        System.out.println( bb );           //-126
        /*
            ii变量在计算机中的存储形式：
                0000 0000 0000 0000 0000 0000 1000 0010
            把ii强制转换为byte类型时，只是把最后一个字节的数存储到bb变量中
            bb变量中存储的内容是： 1000 0010
            bb比那两中的01序列，最高位是1，表示负数， 在计算机中整数采用补码的形式存储
            1000 0010(补) --> 1000 0001(反) --> 1111 1110(原) == -126
         */

        //整数可以转字符类型
        ii = 110;
        char cc = (char)ii;
        System.out.println( cc );   //n

        //可以对表达式进行强制类型转换
        bb = 123;
        bb = (byte)(bb + 1);
        System.out.println( bb );   //124
    }
}
