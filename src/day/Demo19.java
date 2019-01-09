/*
    读取一个人的姓名，工作小时数，每小时的工资，税率，输出该员工的收入
    读取：
        姓名：zhangsan
        工作小时数：200
        每小时工资：200
        税率：0.1
    输出：
        姓名：zhangsan，收入：36000
 */

import java.util.Scanner;        //step1：导入Scanner

class Demo19 {
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);    //step2：创建Scanner对象
        System.out.println("请输入姓名：");
        String name = sc.next();                //step3：读取

        System.out.println("请输入工作小时数：");
        int hours = sc.nextInt();

        System.out.println("请输入每小时的工资：");
        int hourlySalary = sc.nextInt();

        System.out.println("请输入税率：");
        Double tax = sc.nextDouble();

        //计算工资
        double salary = hours*hourlySalary*(1-tax);

        //输出
        System.out.println("姓名：" + name + ",工资：" + salary);
    }
}
