/*
    用户登录，提示用户输入用户名和密码
    如果用户名和密码不是"admin"和"123"的话，就提示用户继续输入
    最多输入五次
 */

import java.util.Scanner;
class Demo62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String pwd = "";
        int count = 0;          //用来统计用户输入的次数

        while (!("admin".equals(name) && "123".equals(pwd))){

            //提示用户输入用户名和密码
            System.out.println("请输入用户名");
            name = sc.next();
            System.out.println("请输入密码");
            pwd = sc.next();

            //判断用户是否合法，如果合法，就提示登陆成功并退出循环
            if("admin".equals(name) && "123".equals(pwd)){
                System.out.println("登录成功");
            }
            //统计用户输入的次数
            count++;
            //判断非法的次数是否已达5次，如果到了5次就退出循环
            if( count >= 5){
                System.out.println("今日此时已用完，明天再来");
                break;
            }else {
                //如果没到5次就提示剩余的次数
                System.out.println("用户名或密码错误，还有" + (5 - count) + "次机会");
            }
        }
    }
}