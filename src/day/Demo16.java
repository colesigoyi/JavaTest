/*
    字符串连接运算符
        +
 */
class Demo16 {
    public static void main(String[] args){
        //使用 + 进行字符串的连接
        System.out.println("Hello" + "World!");

        //字符串可以与基本类型进行连接
        //先把基本类型数据转换成字符串再连接
        System.out.println("Hello" + 123);      //"Hello" + "123"
        System.out.println("Hello" + 1.23);     //"Hello" + "1.23"
        System.out.println("Hello" + 'W');      //"Hello" + "W"
        System.out.println("Hello" + true);     //"Hello" + "true"

        System.out.println("Hello" + 12 + 3);      //Hello123
        //                  "Hello" + "12" +3
        //                  "hello12" + 3
        System.out.println( 12 + 3 + "Hello");      //15Hello
        //                  15 + "Hello"

        //把基本类型转换为字符串
//      String str = 123;       //错误: 不兼容的类型: int无法转换为java.lang.String
        String str2 = "" + 123;
        str2 = "" + true;
        System.out.println( str2 );

        //变量参与字符串连接，实际上连接的变量的值
        String name = "laoDu";
        int age = 33;
        double salary = 1000000;
        boolean isMarried = true;
        System.out.println("name:" + name + ",age:" + age + ",salary:" + salary + ",isMarried:" + isMarried);
        //                "name:" + "laoDu" + ",age:" + 32 + ",salary:" + 1000000 + ",isMarried:" + true
        //输出结果：name:laoDu,age:33,salary:1000000.0,isMarried:true
    }
}
