/*
    用户登录，提示用户输入用户名和密码
    如果用户名和密码不是"admin"和"123"的话，就提示用户继续输入
    最多输入五次
 */

import java.util.Scanner;
class Demo61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 5; i > 0; i--){
            System.out.println("请输入用户名");
            String name = sc.next();
            System.out.println("请输入密码");
            String pwd = sc.next();
            if(!("admin".equals(name) && "123".equals(pwd))){
                System.out.println("用户名或密码错误，请重新输入，剩余" + (i-1) + "次");
                if(i == 1){
                    System.out.println("请十分钟后再试");
                }
            } else{
                System.out.println("登录成功");
                i = 0;
            }
        }
        System.out.println();
    }
}
