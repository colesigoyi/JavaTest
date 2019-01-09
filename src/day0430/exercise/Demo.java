package day0430.exercise;

class Demo {
    public static void main(String[] args) {
        //创建分数对象
        Fraction f1 = new Fraction();
        //给分数对象的分子和分母赋值
        f1.numerator = 3;
        f1.denominator = 4;
        f1.show();

        //Fraction是一个类，类时java的一种引用数据类型，Fraction就可以定义多个对象
        Fraction f2 = new Fraction();
        //每个对象都有自己的属性和行为
        f2.numerator = 10;
        f2.denominator = 5;
        f2.show();

        Fraction f3 = new Fraction();
        f3.numerator = 14;
        f3.denominator = 7;
        f3.show();

        Fraction f4 = new Fraction();
        f4.show();
    }
}
