package day1212;

/**
 * @author taoxuefeng
 * @create 2018-12-12 18:16
 * @desc 内部类向上转型为接口
 **/

interface OutInterface {
    public void f();
}

public class InterfaceInner {
    public static void main(String[] args) {
        OuterClass2 out = new OuterClass2();
        OutInterface outInter = out.doit();
        outInter.f();
    }
}
class OuterClass2 {
    private class InnerClass implements OutInterface {
        InnerClass(String s) {
            System.out.println(s);
        }
        public void f() {
            System.out.println("访问内部类中的f()方法");
        }
    }
    public OutInterface doit() {
        return new InnerClass("访问内部类构造方法");
    }
}