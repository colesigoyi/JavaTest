package day0517.OverWrite;
/*
方法的重写
1、为什么需要进行方法重写
    当子类从父类继承的方法满足不了子类需求的时候，可以进行重写
    重写之后，可以实现动态多态
2、重写规则
    1.子类方法的签名（方法名和方法参数）必须和父类方法签名一致
    2.如果方法的返回值类型不是引用类型，子类方法的返回值类型和父类方法返回值类型一致
      如果方法的返回值类型是引用类型，子类方法的返回值类型可以是父类方法返回值类型的子类
    3.子类方法的访问权限可以比父类方法的访问权限更宽泛
        如果父类方法是public，子类方法只能是public修饰
        如果父类方法是protected，子类方法可以是protected、public修饰
        如果父类方法是默认的，没有访问权限修饰，如果子类和父类在同一个包当中，子类方法可以是默认、protected、public修饰
        如果父类方法是默认的，没有访问权限修饰，如果子类和父类不在同一个包当中，不能重写
        如果父类方法是私有的，不能重写
    4、异常，如果父类有异常抛出，子类重写的方法只能抛出父类异常或者父类异常的子异常
3、可以使用注解@override来验证重写是否正确
Student类继承了PersonTest类，就从PersonTest类中继承了name,gender,age,height和showInfo（）成员
 */
class Student extends PersonTest {
    //添加了学生的特征信息
    String stuID;
    int score;
    /*
    在子类中定义一个方法，显示子类信息
    一般情况下，相同的功能适用相同的方法名，在父类中显示信息使用showInfo（），在子类中显示信息也定义为ShowInfo（）
     */
    @Override           //注解，表示方法的重写
    public void showInfo(){
        super.showInfo();
        System.out.println("ID:" + stuID);
        System.out.println("分数:" + score);
    }
    /*
    子类和父类仙童的功能要使用相同的方法名
    子类和父类重名的方法之后，子类就有两个showInfo（）
    使用子类对象调用的showInfo（）是在子类中定义的ShowInfo（）
     */

}
