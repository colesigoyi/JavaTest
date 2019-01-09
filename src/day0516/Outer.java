package day0516;
/*
    1、可以在一个类的内部定义另外一个类,这叫内部类
        内部类编译之后生成的字节码文件：外部类名$内部类名.class
    2、内部类可以使用static修饰
 */
class Outer {
    int xx= 10;
    static int yy = 20;

    static class Inner{
        int zz = 30;

        public void innerMethod(){
            System.out.println("我是静态内部类的实例方法");

            //在静态内部类中不可以直接使用外部类的非静态成员
//          System.out.println("xx==" + xx);
            //在静态内部类可以直接使用外部类的静态成员
            System.out.println("yy==" + yy);
            System.out.println("zz==" + zz);
        }
        public static void innerStaticMethod(){

            System.out.println("我是静态内部类的静态方法");

        }
    }
}

class Demo{
    public static void main(String[] args){
        //调用静态内部类的静态方法
        Outer.Inner.innerStaticMethod();
        Outer.Inner obj = new Outer.Inner();
        obj.innerMethod();
    }
}
