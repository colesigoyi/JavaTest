package test.com.qf.API.StringDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-17 14:36
 * @ desc: StringBuffer操作
 **/

public class StringBufferDemo {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a + b + 1;//产生5个对象
        System.out.println(c);

        String d = "a" + 1 + 2 + 3 + "b";//a13b

        //StringBuffer目的用来解决字符串相加时带来的性能问题（常量与变量相加）
        //StringBuffer内部实现采用字符数组，默认数组的长度为16，超过数组大小时动态扩充的算法是原来长度*2+2
        //所以当我们预知要添加的数据长度时，建议使用带初始化容量的构造方法，来避免动态扩充的次数，从而提高效率
        //线程安全的，但会影响性能
        StringBuffer sb = new StringBuffer(32);//带容量的构造方法
        sb.append(a).append(b).append(1);//产生一个对象
        System.out.println(sb.toString());

        StringBuffer sb2 = new StringBuffer("abc");//默认长度+16
        sb2.delete(0,1);
        sb2.reverse();//字符串反转
        System.out.println(sb2.toString());

    }
}
