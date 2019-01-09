/*
    逻辑运算符
    &   |   ……  ！   &&  ||
 */
class Demo13 {

    public static void main(String[] args) {
        //逻辑运算符的操作数为布尔值
        System.out.println( true & true );      //true
        System.out.println( false | false );    //false
        System.out.println( true ^ false );     //true
        System.out.println( false ^ true );     //true
        System.out.println( !true );            //false
        System.out.println( !false );           //true

        //短路与&&，操作结果与逻辑与&一样
        int num = 10;
        System.out.println( (num<0) & (++num>0) );  //false
        //                   false  &  true 11>0
        System.out.println( num );                  //11

        //短路与&&，如果左侧表达式为false，不计算右侧表达式的值了
        System.out.println( (num<0) && (++num>0) );  //false
        //                   false  &&   不计算
        System.out.println( num );                  //10

        //短路或||，如果左侧为true，不计算右侧表达式的值了
        num = 10;
        System.out.println( (num>0) || (++num>0) );  //true
        //                   true   ||  不计算
        System.out.println( num );                  //10

        //建议使用短路与，短路或

        //逻辑运算符经常用于连接多个布尔表达式
        //判断某一年是否为闰年，闰年的条件：能被4整除，不能被100整除，或者直接能被400整除
        int year = 2018;
        /*
            能被4整除但是不能被100整除 || 直接被400整除
            （能被4整除 && 不能被100整除） || 直接被400整除
            （year%4==0 && year%100!=0) || year%400==0
         */
        boolean isPrime = (year%4==0 && year%100!=0) || year%400==0;
        System.out.println( isPrime );
    }
}
