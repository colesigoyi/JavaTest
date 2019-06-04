package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-05 00:38
 * @ desc: main方法分析
 **/

public class Test0604_3 {
    public static void main(String[] args) {
        System.out.println(args);//[Ljava.lang.String;@2503dbd3
        System.out.println(args.length);//0
        for(String s: args){
            System.out.println(s);
        }
    }
}
