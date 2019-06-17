package test.com.qf.Internationalization;

import java.util.Locale;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-17 15:54
 * @ desc: 程序国际化
 **/

public class LocaleDemo {
    public static void main(String[] args) {

        //创建一个本地语言环境对象，该对象会根据参数设置来自动设置与之相关的语言环境
        //参数：语言，地区
        Locale locale_CN = new Locale("zh","CN");
        Locale locale_US = new Locale("en","US");
        //获取当前系统默认的语言环境
        Locale locale_default = Locale.getDefault();
    }
}
