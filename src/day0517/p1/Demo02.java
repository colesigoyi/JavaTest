package day0517.p1;

import day0517.p1.TestPrivilage;

class Demo02 {
    public static void main(String[] args) {
        //当前包
//      System.out.println(yy);   //使用方法不正确

        TestPrivilage obj = new TestPrivilage();
//      System.out.println(obj.a);  //is not visible不可见，原因是就是没有访问权限
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
