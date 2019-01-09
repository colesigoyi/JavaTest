/*
    for循环的三个表达式不是必须的
 */
class Demo59 {
    public static void main(String[] args) {
        //打印1~10之内的所有数
        for(int num = 1; num <= 10; num++){
            System.out.println(num);
        }
        System.out.println("-----------------------");
        //能不能访问到num变量？不能，因为num是for循环的局部变量

        //for循环可以没有初始化表达式，在for循环之前定义一个局部变量
        int num = 1;
        for( ; num <= 10; num++){
            System.out.println(num);
        }
        System.out.println("-----------------------");

        //for循环可以没有循环条件表达式，就相当于循环条件一直为true
        num = 1;
        for( ; ; num++){
            System.out.println(num);
            if( num >= 10) {
                break;
            }
        }
        System.out.println("-----------------------");

        //for循环也可以没有表达式3，可以在循环体中修改循环控制变量
        num = 1;
        for( ; ; ){         //相当于while( true )
            System.out.println(num);
            if( num >= 10) {
                break;
            }
            num++;
        }
        System.out.println("-----------------------");
    }
}
