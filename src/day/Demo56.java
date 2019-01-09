/*
    while循环与do...while循环区别

    while循环是先判断条件在执行循环体
    do...while循环是先执行循环体，在判断条件

    当第一次循环时，如果循环条件就成立，是没有区别的
    当第一次循环时，条件不成立，while循环体一次也不执行，do...while循环至少执行一次循环体
 */
class Demo56 {
    public static void main(String[] args) {
        //当第一次循环时，如果循环条件就成立，是没有区别的
        int num = 1;
        while(num<=10){
            System.out.println( num++);
        }

        num = 1;
        do{
            System.out.println( num++ );
        }while(num<=10);
        System.out.println("-----------------------------");

        //当第一次循环时，条件不成立，while循环体一次也不执行，do...while循环至少执行一次循环体
        num = 100;
        while(num<=10){
            System.out.println( num++);
        }
        System.out.println("-----------------------------");
        num = 100;
        do{
            System.out.println( num++ );
        }while(num<=10);

    }
}
