/*
提示用户登录，直到输入正确的用户名"admin"和密码"123"为止
 */
import java.util.Scanner;
class Demo52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String pwd = "";

        while( true ){
            System.out.println("请输入用户名：");
            name = sc.next();
            System.out.println("请输入密码：");
            pwd = sc.next();

            //判断，如果用户名和密码正确，就中断循环
            if( "admin".equals(name) && "123".equals(pwd) ){
                break;
            }else {
                System.out.println("密码或用户名错误，请重新输入");
            }
        }
        System.out.println("输入正确，登陆成功");
    }
}

