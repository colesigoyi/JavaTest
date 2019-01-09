/*
从键盘上输入一个成绩，判断成绩对应的等级
 */
import java.util.Scanner;

class Demo30 {
    public static void main(String[] args) {
        //从键盘上输入一个成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        int score = sc.nextInt();

        //先对用户的输入的成绩进行合理性验证，把不合理的情况抛去
        if (score < 0 || score > 100) {
            System.out.println("输入的成绩有误！");
            return;     //返回，结束当前方法main方法的执行
        }
        //如果程序能够执行到这，说明输入的成绩在0~100之间
        //判断成绩对应的等级
        String grade = "";      //定义变量保存成绩对应的等级
        if (score >= 90 ) {
            grade = "A";
        } else if (score >= 80 ) {
            grade = "B";
        } else if (score >= 70 ) {
            grade = "C";
        } else if (score >= 60 ) {
            grade = "D";
        } else {
            grade = "E";
        }
        //输出的等级
        System.out.println( "该成绩的等级为：" + grade );
    }
}
