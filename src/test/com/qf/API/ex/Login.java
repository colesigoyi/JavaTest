package test.com.qf.API.ex;

import java.util.Scanner;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-15 18:17
 * @ desc:
 **/
/*
面试题：Exception与RuntimeException
        Exception：受检异常，在编译期检查，在调用抛出这个异常的方法时，
                   必须显式的调用try/catch语句
        RuntimeException：非受检异常，在运行期检查，在调用抛出这个异常的方法时，
                   可以不用显式的调用try/catch语句
        在使用自定义异常时，根据实际的业务要求，来决定使用哪个作为继承的父类
 */

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入用户名：");
        String name = sc.nextLine();
        System.out.print("请输入密码：");
        String pass = sc.nextLine();

        UserService us = new UserService();
        try {
            User user = us.Login(name,pass);
            System.out.println("登录成功");
            System.out.println(user);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
