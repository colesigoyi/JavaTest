/*
    小数类型
 */
class Demo07 {

    public static void main(String[] args) {
        //小数字面量默认为double类型

        //定义一个double类型变量
        double dd = 3.14;

        //定义一个float类型变量，需要在小数字面量后面加上一个字符F(f)
//      float ff = 4.56;        //错误：不兼容的类型: 从double转换到float可能会有损失
        float ff = 4.56F;

        //float类型精度有7位
        ff = 12345.12345F;
        System.out.println( ff );       //12345.123
        ff = 456789.456789F;
        System.out.println( ff );       //456789.47
        ff = 456789.896789F;
        System.out.println( ff );       //456789.9

        //小数在计算机中采用近似值保存，不准确
        ff = 456789.986789F;
        System.out.println( ff );       //456789.0
        //一般情况下，小数不直接判断是否与另外一个小数相等
        //如果两个小数相减，他们的差小鱼某个值时就认为这两个小数相等
    }
}

