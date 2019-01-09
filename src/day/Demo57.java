/*
    所有的循环都可以使用while循环实现
    一般情况下，当循环条件表达式需要用户输入，或者需要通过循环体计算时，可以使用do...while循环
 */
import java.util.Scanner;
class Demo57 {
    public static void main(String[] args) {
        //从键盘输入用户名和密码，判断是否登录成功
/*
        Scanner sc = new Scanner(System.in);
        String name = "";
        String pwd = "";
        while( !("admin".equals(name) && "123".equals(pwd)) ){
            System.out.println("请输入用户名");
            name = sc.next();
            System.out.println("请输入密码");
            pwd = sc.next();
        }
        System.out.println("登陆成功");
*/
        //使用do...while循环
        Scanner sc = new Scanner(System.in);
        String name = "";
        String pwd = "";
        do {
            System.out.println("请输入用户名");
            name = sc.next();
            System.out.println("请输入密码");
            pwd = sc.next();
        } while( !("admin".equals(name) && "123".equals(pwd)) );
        System.out.println("登陆成功");
    }
}
