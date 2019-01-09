package day0425;
/*
打印10000以内的所有完全数，如果一个正整数等于除了它本身意外的所有除
数之和，这个数就是完全数
如：6==1+2+3，28==1+2+4+7+14
 */
public class Demo01 {
    public static void main(String[] args) {
        //遍历10000以内的所有整数，如果这个数是完全数就打印
        for(int num=1; num<=10000; num++){
            //判断num是不是完全数, 求num所有除数之和
            int sum = 0;        //保存num所有除数之和
            //求num所有除数之和
            for(int x = 1; x < num; x++){
                if(num % x == 0){
                    sum += x;
                }
            }
            if( num == sum ){
                System.out.println(num);
            }
        }
    }
}
