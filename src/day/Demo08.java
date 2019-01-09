/*
    字符类型
 */
class Demo08 {

    public static void main(String[] args) {
        //定义一个字符类型变量
        char cc = 'A';
        System.out.println( cc );

        //字符类型采用Unicode编码（utf-16），每个字符占两个字节，可以存汉字
        cc = '汉';
        System.out.println( cc );

        //字符类型实际存储的是这个字符对应的码值
        /*
            cc = 'A'
            在cc变量中实际存储的是字符A的码值 65

            常见字符的码值：
            'A' 65
            'a' 97
            '0' 48
            回车  13
            换行  10
         */
        //因为字符存储的是码值，直接把一个整数赋值给字符类型变量,这个整数应该在0~65535之间
        cc = 97;
        System.out.println( cc );   // a

        cc = 31245;
        System.out.println( cc );      //稍

        //给字符类型赋值整数，这个整数应该在0~65535之间
//        cc = -20;
//       System.out.println( cc );       //错误: 不兼容的类型: 从int转换到char可能会有损失
        //字符类型实际存储的是一个整数，字符串类型可以进行算术运算
        cc = 'A';
        System.out.println( cc+1);
        /*
        上面一行是把cc + 1 这个表达式的值打印到屏幕上
        先把cc变量的值65取出来，再加上1的和66，打印到屏幕上
         */

        //char、byte、short在进行算术运算之前，先把自己提升为int类型
//      cc = cc + 1;    //错误: 不兼容的类型: 从int转换到char可能会有损失

        /*
            转义字符
               \t     Tab   调到下一个制表位，不是产生8个空格
               \n     换行
               \\     \
               \'     '
               \"     "
         */
        System.out.println("abcdefg");
        System.out.println("\"abcdefg\"");
        System.out.println("abc\'defg");
        System.out.println("abc\tdefg");
        System.out.println("abc\ndefg");
        //在java的字符串字面量中，遇到反斜杠就认为是转义字符的开始
//      System.out.println("abc\defg"); //Error:(61, 33) java: 非法转义符

    }
}
