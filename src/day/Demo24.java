/*
    从键盘输入用户名和密码，判断是否合法
    假设合法的用户名为：admin， 合法的密码：123
 */
import java.util.Scanner;

class Demo24 {
    public static void main(String[] args){
        //从键盘上输入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String pwd = sc.next();

        //判断是否合法用户
        //字符串在进行比较的时候使用equals
        if ("admin".equals(name) && "123".equals(pwd)){
            System.out.println("登陆成功");
        } else{
            System.out.println("登录失败，用户名或密码不正确！");
        }
    }
}
