/*
    for（ 初始化表达式 ；条件表达式；循环体后表达式）{
        循环体
    }
 */
class Demo58 {
    public static void main(String[] args) {
        //打印十次"动力节点，口口相传"
        for(int i =1; i<=10;i++){
            System.out.println("动力节点，口口相传");
        }
        /*
            一般情况下，在初始汉化表达式中定义一个在for循环当中使用的局部变量
            在循环体后表达式中，用来修改循环控制变量
         */

        //遍历1~100之间所有的数，打印所有的奇数
        for(int num = 1; num <= 100 ; num++ ){
            if( num % 2 == 1 ){
                System.out.println( num );
            }
        }

        System.out.println("-------------------");
        for(int num = 1; num <= 100 ; num += 2 ){
                System.out.println( num );
        }
        //累加1+2+3...+100的和
        int sum = 0;
        for(int num = 1; num <=100 ; num++){
            sum +=num;
        }
        System.out.println(sum);
    }
}
