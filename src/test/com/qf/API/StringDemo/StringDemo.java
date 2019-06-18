package test.com.qf.API.StringDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 21:00
 * @ desc: String字符串操作
 *          String表示一个字符串，内部使用字符数组实现，该类不可变，不能被继承（最终类）
 **/

public class StringDemo {
    public static void main(String[] args) {
        //String两种赋值方式
        //1、直接赋值(推荐使用第一种方式)
        String s1 = "String";//在常量池创建
        //2、使用new关键字创建对象，new表示申请内存空间

        //面试题：以下代码创建了几个对象？2个对象
        String s2 = new String("String");//在堆中创建

        String s3 = "String";//在常量池中查找

        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true

        //代码示例：4中情况分析:直接赋值字符串链接时，考虑编译期和运行期
        //如果在编译期值可以被确定，那么就使用已有的对象，否则就创建新的对象
        String a = "a";
        String a1 = a + 1;//在编译期a没有值，所以a1没有确定
        String a2 = "a1";
        System.out.println(a1==a2);//false

        final String b = "b";//代表一个常量
        String b1 = b + 1;//在编译期b1的值可以确定
        String b2 = "b1";
        System.out.println(b1==b2);//true

        String c = getC();//c的值通过方法，方法只有在运行期才能得到结果，所以c不能确定
        String c1 = c + 1;
        String c2 = "c1";
        System.out.println(c1==c2);//false

        final String d = getD();//虽然final修饰，但是方法还是在运行期有结果
        String d1 = d + 1;
        String d2 = "d1";
        System.out.println(d1==d2);//false

    }

    private static String getC(){
        return "c";
    }private static String getD(){
        return "d";
    }
}
