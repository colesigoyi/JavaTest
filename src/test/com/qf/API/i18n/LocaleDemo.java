package test.com.qf.API.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-17 15:54
 * @ desc: 程序国际化
 *          Properties:属性文件（配置文件），内容以键值对的形式存在（key-value）
 *          ResourceBundle工具类：来绑定属性文件，并指定Local对象，来自动选择使用哪个配置文件，默认将使用与操作系统相同的语言环境
 *          getString（）方法来从属性文件中使用key来获取value
 *          注意：ResourceBundle工具类是只读的
 **/

public class LocaleDemo {
    public static void main(String[] args) {

        //创建一个本地语言环境对象，该对象会根据参数设置来自动设置与之相关的语言环境
        //参数：语言，地区
        Locale locale_CN = new Locale("zh","CN");
        Locale locale_US = new Locale("en","US");
        //获取当前系统默认的语言环境
        Locale locale_default = Locale.getDefault();

        Scanner sc = new Scanner(System.in);
        //用于绑定属性文件的工具类（参数：属性文件的基本名，就是前缀，比如info）
        ResourceBundle rb = ResourceBundle.getBundle("test.com.qf.API.i18n.info",locale_default);
        System.out.println(rb.getString("system.name"));
        System.out.println(rb.getString("input.username"));
        String username = sc.nextLine();
        System.out.println(rb.getString("input.password"));
        String password = sc.nextLine();

        if("admin".equals(username) && "123".equals(password)){
            System.out.println(rb.getString("login.success"));
            String welcome = rb.getString("welcome");
            //动态文本格式化
            welcome = MessageFormat.format(welcome, username);
            System.out.println(welcome);
        }else {
            System.out.println(rb.getString("login.error"));
        }

    }
}
/*
system.name=----员工管理系统----
input.username=请输入用户名:
input.password=请输入密码:
login.success=登录成功！
login.error=登录失败

system.name=---- EMP Manager System ----
input.username=Input UserName:
input.password=Input Password:
login.success=Login Success!
login.error=Login Error!
welcome=welcome!{0}
 */
