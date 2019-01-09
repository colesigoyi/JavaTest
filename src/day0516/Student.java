package day0516;
/*
1、使用extends关键字实现继承
2、Student extends Person，Student类为子类/派生类，Person类为父类/基类/超类
3、子类继承父类之后，就自动拥有了弗雷中定义的实例变量和实例方法
4、在子类中，可以对父类进行扩展，增加子类特有的属性和方法
 */
class Student extends Person{
    //添加学生特有的属性
    String stuID;
    int score;
    //添加子类学生特有的方法
    public void study(){

    }

}