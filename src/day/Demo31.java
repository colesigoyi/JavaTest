/**
 * 从键盘上输入一个人的年龄，判断老年，中年，青年，少年
 *
 * TaoXueFeng
 * create 2018-01-23 下午9:12
 **/

import java.util.Scanner;
class Demo31 {
    public static void main(String[] args) {
        //从键盘上输入一个年龄
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年龄：");
        int age = sc.nextInt();

        //先对用户的输入的年龄进行合理性验证，把不合理的情况抛去
        if (age < 0 || age > 120) {
            System.out.println("输入的年龄有误！");
            return;     //返回，结束当前方法main方法的执行
        }
        //如果程序能够执行到这，说明输入的年龄在0~120之间
        //判断成绩对应的等级
        String grade = "";      //定义变量保存成绩对应的等级
        if (age >= 65) {
            grade = "老年";
        } else if (age >= 35) {
            grade = "中年";
        } else if (age >= 18) {
            grade = "青年";
        } else if (age >= 6) {
            grade = "少年";
        } else if (age >= 3) {
            grade = "幼儿";
        } else {
            grade = "婴儿";
        }
            //输出的等级
        System.out.println("该年龄处于" + grade + "阶段");
    }
}

