package day0517.p2;

import day0517.p1.TestPrivilage;
/*
子类继承了父类
子类和父类不在同一个包中
子类继承了父类之后，自动拥有了父类的实例对象和实例方法
 */
class Son extends TestPrivilage {
    public void method(){
        //通过子类创建对象，这个对象有四个实例变量，是因为继承
        //a,b这两个字段访问不到是因为访问权限
//      System.out.println(a);  //在父类中私有的
//      System.out.println(b);  //在父类中没有访问权限，魔人只能在父类的包中访问
        System.out.println(c);
        System.out.println(d);

    }
}
