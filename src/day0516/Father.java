package day0516;
/*
父类
 */
class Father {
    int xx = 10;

    public void method(){
        System.out.println("in father,method");
        System.out.println("xx==" + xx);

    }
    //静态变量与静态方法
    static int yy = 20;
    public static void sMethod(){
        System.out.println("in father, static method");
    }
    //静态构造代码块
    static {
        System.out.println("我是父类的静态构造代码块，在使用Father类时，要对" +
                "Father类进行初始化，就会执行我");
    }

    public void testThis(){
        System.out.println("------------in father------------");
        System.out.println(this);
        System.out.println(this.xx);
    }
}
