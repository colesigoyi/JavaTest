/*
    条件运算符
        条件 ？ 表达式1 ： 表达式2
        如果条件成立，整个表达式的值就是表达式1的值
        如果条件不成立，整个表达式的值就是表达式2的值
 */
public class Demo15 {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        int result = num1>num2 ? num1: num2;
        /*
            如果num1>num2成立，就把num1的值赋值给变量result
            如果num1>num2不成立，就把num2的值赋值给变量result
            就是把num1和num2中较大的保存到变量result中
         */
        System.out.println( result );

        String str = num1 > num2 ? "num1较大" : "num2较大";
        System.out.println( str );

        //求三个数的较大者
        int a = 10;
        int b = 20;
        int c = 30;
//      int max = (a>b? a:b) > c ? (a>b? a:b) : c;    //不建议这么做
        int maxAB = a>b? a:b;                   //先求a和b的较大者
        int max = maxAB > c ? maxAB : c;        //再求三个数的最大者

        System.out.println( max );
    }
}
