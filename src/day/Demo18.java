import java.util.Scanner;       //step1：导入Scanner类

/*
    基本的输入与输出
 */

class Demo18 {
    public static void main(String[] srgs){
        //基本的输出，System.out就是系统的标准输出设备，默认为显示器
        //println先打印信息，再换行
        System.out.println("Hello World！");
        //print只打印，不换行
        System.out.print("11111111");
        System.out.print("22222222");
        System.out.print("33333333");

        //基本的输入,扫描键盘上的数据，System.in代表的系统的标准输入设备，即键盘
        Scanner sc = new Scanner(System.in);        //step2：创建Scanner对象

        //一般情况下，在要求用户输入之前，给一个有好的提示
        System.out.println("请输入一个整数：");

        //从键盘上读取一个整数，把这个证书保存在i中
        int i = sc.nextInt();                       //step3：读取数据
        System.out.println("你输入的整数为：" + i);

        System.out.println("请输入一个小数：");
        double dd = sc.nextDouble();
        System.out.println("你输入的小数为：" + dd);

        System.out.println("请输入一个布尔值：");
        boolean flag = sc.nextBoolean();
        System.out.println("你输入的布尔值为：" + flag);

        System.out.println("请输入一个字符串：");
        String str = sc.next();
        System.out.println("你输入的字符串为：" + str);

        //不能直接读取一个字符
        System.out.println("请输入一个字符：");
        //先以字符串的形式读取
        String str22= sc.next();
        //再从字符串把字符取出来
        char cc = str22.charAt(0);       //把字符串str22中的第0个字符取出来
        System.out.println("你输入的字符为：" + cc);

        //正则表达式

    }
}
