package day0517.p1;
/*
访问权限有四种
访问修饰符有三个
 */
public class TestPrivilage {
    private   int a = 10;   //私有的，只能在当前包中访问
              int b = 20;   //默认的，当前包中
    protected int c = 30;   //受保护的，当前包中和派生类（不一定在当前包中）
    public    int d = 40;   //任意位置

}
