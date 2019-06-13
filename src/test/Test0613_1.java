package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-13 01:03
 * @ desc: 数据结构-链表:链表数据结构中，我们需要使用递归算法
 *          递归算法是一种直接或者间接的调用自身算法的过程
 *          在计算机编写程序中，递归算法对解决一大类问题是十分有效的
 *          它往往使算法的描述简洁而且易于理解
 **/

public class Test0613_1 {
    public static void main(String[] args) {
        int result = jieCheng(10);
        System.out.println(result);
        int result2 = jieCheng2(10);
        System.out.println(result2);
    }

    public static int jieCheng(int num){
        int result = num;
        int i = num-1;
        do{
            result = result * i;
            i--;
        }while (i>1);
        return result;
    }
    //递归算法：方法调用自己
    //1、递归必须要有出口
    //2、递归内存消耗大，容易发生内存溢出
    public static int jieCheng2(int num){
        if(num == 1){
            return 1;
        }
        return num * jieCheng2(num-1);
    }
}
