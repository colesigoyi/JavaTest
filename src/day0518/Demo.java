package day0518;

class Demo {
    public static void main(String[] args) {
        TestFinal obj = new TestFinal();
        obj.xx = 12;
//      obj.yy = 23;    //被final修饰的成员变量不能被修改

        //子类的对象继承父类，可以继承调用父类中的final方法，不能重写final方法
        Son xiaoMing = new Son();
        xiaoMing.method();
        xiaoMing.fMethod();
        //final修饰局部变量,一旦初始化，就不能被修改
        int mm;
        mm = 11;
        mm = 12;
        final int nn;
        nn = 66;
//      nn = 77;不能被修改

        test(12,45);

        //final修饰引用类型变量，这个引用类型的变量不能指向其他对象，但是可以修改这个对象的属性值
        final TestFinal obj22 = new TestFinal();
        obj22.xx = 789;
//      obj22 = new TestFinal();        //obj22变量的值不能改
    }
    //final修饰方法的形参，在方法体中不能被修改
    public static void test(int xx, final int yy){
        xx = 666;
//      yy = 888;
    }
}
