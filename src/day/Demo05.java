/*
    变量的作用域
        就是变量在哪个范围内有效
        成员变量的作用域是整个类
        局部变量的作用域是从变量定义的位置开始，知道包含他的大括弧结束
 */
class Demo05 {

    int xx = 123;           //成员变量

    {
        int yy = 789;       //局部变量
    }

    public static void main(String[] args) {
        //因为main方法是静态方法，不能直接使用非静态成员xx
//      System.out.println( xx );         //错误：无法从静态上下文中引用非静态变量xx
        Demo05 obj = new Demo05();
        System.out.println( obj.xx );


        int oo = 456;       //局部变量

        {
            int mm = 18;    //局部变量
            System.out.println( oo);
        }

        if( true ){
            int dd = 20;    //局部变量
        //  int oo = 369;   //同一个作用域中不能定义重名的变量
        }

    }
}
