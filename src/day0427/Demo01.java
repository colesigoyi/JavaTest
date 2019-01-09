package day0427;

import java.util.Scanner;

/*
定义一个方法，根据成绩返回对应的等级
 */
class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入分数：");
        int score = sc.nextInt();
        System.out.println("当前成绩的等级为：" + getGrade( score ));
    }

    public static String getGrade(int score) {
        //可以对参数接受的数据进行验证
        if (score < 0 || score > 100) {
            //抛出异常
            System.out.println("成绩不合理！");
            return "";
        }
        switch ( score/10 ){
            case 9:
            case 10:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "不及格";
        }
    }

}
