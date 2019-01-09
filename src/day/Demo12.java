/*
关系运算符
    > >= < <= == !=
    关系运算的结果是一个布尔值
 */
public class Demo12 {

    public static void main(String[] args) {
        //基本类型的比较
        System.out.println( 10 > 5 );       //true
        //  >= 大于或等于
        System.out.println( 10 >= 5 );      //true
        System.out.println( 10 < 5 );       //false
        System.out.println( 10 <= 5 );      //false
        //比较运算符等于 使用两个等号
        System.out.println( 10 == 5 );      //false
        System.out.println( 10 != 5 );      //true

        int a = 20;
        int b = 30;
        //变量进行比较是比较两个变量的值
        System.out.println( a > b );        //false

        //字符串的比较
        //字符串使用String类型定义，String是系统定义的一个类
        String str1 = "abc";
        String str2 = "abc";                    //直接赋值字符串字面量
        String str3 = "ab" + "c";               //使用加号可以进行字符串的连接
        String str4 = new String("abc");//使用String类的构造方法来创建字符串对象
        System.out.println( str1 );             //abc
        System.out.println( str2 );             //abc
        System.out.println( str3 );             //abc
        System.out.println( str4 );             //abc

        /*
            String是一个类，是一种引用数据类型
            str1，str2，str3，str4中存储的内容是另一块存储空间的引用(地址)
            使用双等号进行比较时，是比较的这些变量中的值，即是否都引用了另外同一块存储空间
         */
        System.out.println( str1 == str2 );     //true
        System.out.println( str1 == str3);      //true
        System.out.println( str1 == str4);      //false
        System.out.println( str2 == str3 );     //true
        System.out.println( str3 == str4);      //false

        //如果想要比较字符串中的每个字符是否一样，可以使用equals()方法
        System.out.println( str1.equals(str2) );     //true
        System.out.println( str1.equals(str3) );     //true
        System.out.println( str1.equals(str4) );     //true
        System.out.println( str2.equals(str3) );     //true
        System.out.println( str3.equals(str4) );     //true
        System.out.println( "abc".equals(str4) );     //true
        System.out.println( str3.equals("abc") );     //true

    }
}
