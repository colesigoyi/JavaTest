/*
编写程序，提示用户输入学生的个数，每个学生的名字以及分数
最后显示获得最高分的学生和第二高分的学生信息
 */
import java.util.Scanner;

class Demo69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的个数");
        int num = sc.nextInt();

        String name1 = "";       //保存最高分学生姓名
        int score1 = 0;          //保存最高分学生成绩
        String name2 = "";       //保存第二高分学生姓名
        int score2 = 0;          //保存第二高分学生成绩

        //读取每个学生的姓名和分数
        String name = "";       //保存学生姓名
        int score = 0;          //保存学生成绩
        for (int i = 1; i <=num; i++) {
            System.out.println("请输入学生的姓名");
            name = sc.next();
            System.out.println("请输入学生的成绩");
            score = sc.nextInt();
            //如果刚刚输入同学的成绩比score1还高，刚刚输入的学生信息就是最高分信息
            if( score > score1 ){
                //原来第一高分变为第二高分
                score2 = score1;
                score1 = score;
                name2 = name1;
                name1 = name;
            }else if(score > score2){
                score2 = score;
                name2 = name;
            }
        }
        //在输出结果时，要根据学生的个数决定是否输出第二高学生的信息
        if (num >= 2) {
            System.out.println("最高分姓名：" + name1 + "，最高分数：" + score1);
            System.out.println("第二高分姓名：" + name2 + "，第二高分数：" + score2);
        } else if (num >=1){
            System.out.println("最高分姓名：" + name1 + "，最高分数：" + score1);
        }else{
            System.out.println("没有学生");
        }
    }
}
