/*
    变量的分类
        根据变量的定义的位置可以把变量分为成员变量和局部变量
        在类体重定义的变量称为成员变量
        在代码块重定义的变量称为局部变量
 */
class Demo04 {

    int xx = 123;           //成员变量

    {
        int yy = 789;       //局部变量
    }

    public static void main(String[] args) {

        int oo = 456;       //局部变量

        {
            int mm = 18;    //局部变量
        }

        if( true ){
            int dd = 20;    //局部变量
        }

    }
}
