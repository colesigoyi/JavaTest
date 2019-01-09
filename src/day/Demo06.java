/*
整数类型
 */
class Demo06 {

    public static void main(String[] args) {
        //整数字面量默认为int类型

        //定义一个int类型
        int age = 123;

        //定义一个byte类型变量
        byte bb = 123;
        /*
        给byte类型变量赋值时，如果这个整数字面量在byte类型的取值范围之内，可以赋值
        如果给byte类型变量赋值的整数字面量超过了byte的取值范围，不可以赋值
         */
//        bb = 250;     //错误：不兼容的类型: 从int转换到byte可能会有损失

        //byte/short/char这三种数据类型在进行运算之前，会把自己提升为int再运算
        System.out.println( bb);
//        bb = bb + 1;    //错误：不兼容的类型: 从int转换到byte可能会有损失
        /*
        想把bb变量的值，加上1之后，把和124在复制给bb变量
        在bb变量加1之前，系统会自动把bb提升为int类型再加1
        bb + 1 这个表达式为int类型，不能直接赋值给byte类型
         */
//        bb = age;          //错误：不兼容的类型: 从int转换到byte可能会有损失
        /*
        编译器在进行语法检查时，不管age变量的值是多少，编译器也看不到变量的值是多少'
        编译器只知道age是int类型的变量，不能直接赋值给byte类型变量
         */

        bb = 10 + 20;

        System.out.println( bb );

        //short类型变量赋值也要在short的取值范围之内
        short ss = 456;
//        ss = ss + 1;        //错误：不兼容的类型: 从int转换到short可能会有损失

        //
        long xx = 123;
        /*
        123是int类型
        变量xx是long类型，把整数字面量赋值给long类型变量时隐含着一个自动类型转换
        就是把int类型的字面量转换为long类型
        建议再给long类型赋值时，在整数字面量后面加上字符L(l)表示这个整数就是long类型
         */
        xx = 456l;      //省去了自动类型转换这一步
//      xx = 4567891234;// 过大的整数: 4567891234, 4567891234是int类型
        xx = 4567891234l;

    }
}
