package day0516;
/*
在继承中，子类可以自动拥有父类的实例变量和实例方法，这就是继承的作用，实现代码的复用
但是我们不能为了代码复用就乱用继承
只有当子类 is a 父类时才可以继承
父类是通用类，子类是特殊类，子类是父类的一种
 */
class Demo03 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "zhangsan";
        stu1.sleep();
        stu1.eat();

        Dog daHuang = new Dog();
        daHuang.name = "大黄";
    }
}
