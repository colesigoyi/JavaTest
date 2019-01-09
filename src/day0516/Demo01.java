package day0516;

import java.awt.*;

class Demo01 {

    public static void main(String[] args) {
        //直接通过类名调用静态方法
        TestStaticMethod.sMethod();
        //虽然可以用过对象名调用静态方法，跟具体的对象没有关系，不建议通过对象名访问静态方法
        TestStaticMethod sobj = null;
        sobj.sMethod();

        TestStaticMethod obj = new TestStaticMethod();
        obj.method();
    }
}
