/*
 *  变量的定义
 *      1、变量定义格式
 *          数据类型 变量名；
 *          数据类型 变量名 = 初始值；
 *      2、给变量赋值
 *          变量名 = 新的值；
 */
class Demo03 {

    public static void main(String[] args) {
        //变量的声明
        int age;
        /*
         *  int是一种java数据类型，表示整数
         *  age是一个变量名
         *  程序执行上面一行，就会在内存中分配一块存储空间，通过变量名age来访问这块存储空间
         */

        //给变量赋值
        age = 18;
        /*
         * 把18这个数存储到age变量名所标识的存储空间中
         */

        //打印变量的值
        System.out.println( age );
        /*
         * 把age变量名所标识的存储空间中的内容打印到屏幕上
         */

        //给变量进行重新复制
        age = 19;
        /*
        把19存储到age变量名所表示的存储空间中，age变量原来的18就被覆盖了
         */
        System.out.println( age);

        //变量可以参与运算，作为其他表达式的一部分
        int myAge = age + 2;
        /*
        把age变量的值取出来，和2相加，把结果21存储到myAge变量中
         */
        //在java中变量必须先赋值再使用
        //int year;
//        System.out.println( year); // 错误：可能尚未初始化变量year

        //建议定义变量的同时就给定一个初始值
        int month = 6;

        //在同一个作用域中不能定义同名的变量
        int year = 2018;
        System.out.println( year);
    }
}

