package test.com.qf.API.SystemRuntimeDemo;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-18 13:45
 * @ desc: System与Runtime类
 **/

public class SystemRuntimeDemo {
    public static void main(String[] args) {
        System.out.println("向控制台打印信息");//向控制台打印信息

        System.err.println("出错了");//出错了(红色)

        int[] num1 = {1,2,3,4,5,6};
        int[] num2 = new int[num1.length];
        //参数：源数组对象，源数组起始位置，目标数组，目标数组起始位置，复制长度
        System.arraycopy(num1,0,num2,0,num1.length);
        System.out.println(Arrays.toString(num2));

        System.out.println(System.currentTimeMillis());

        Date nowDate = new Date(System.currentTimeMillis());
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String time = df.format(nowDate);
        System.out.println(time);

        //直接退出JVM
        //System.exit(0);

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
        /*
        1.8.0_151
        /Library/Java/JavaVirtualMachines/jdk1.8.0_151.jdk/Contents/Home/jre
        Mac OS X
        10.14.5
        taoxuefeng
        /Users/taoxuefeng
        /Users/taoxuefeng/Documents/02_学习文件/01_Java/java/java_study
         */

        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量：" + rt.availableProcessors() + "个");
        System.out.println("JVM总内存数：" + rt.totalMemory()/1024/1024 + "M");
        System.out.println("JVM空闲内存数：" + rt.freeMemory()/1024/1024 + "M");
        System.out.println("JVM可用最大内存数：" + rt.maxMemory()/1024/1024 + "M");

        //在单独的进程中执行指定的字符串命令
        /*
        try {
            rt.exec("taoxuefeng");//打开记事本
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        //加载C、C++编写的第三方类库
        //System.loadLibrary(libname);

    }
}
