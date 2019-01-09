package day0516;

class Demo04 {
    public static void main(String[] args) {
        /*//通过子类访问父类的实例变量和实例方法
        Son xiaoMing = new Son();
        xiaoMing.method();
        System.out.println(xiaoMing.xx);*/



       /* //通过子类的对象名访问弗雷的静态成员
        xiaoMing.sMethod();
        System.out.println(xiaoMing.yy);*/

        //通过子类名访问父类的静态成员
        Son.sMethod();
        System.out.println(Son.yy);
        /*
        我给子类添加静态构造代码块之后，执行上面的两行语句，输出结果并没有执行子类的构造代码块
        没有执行子类的静态构造代码块，说明没有用到子类，进一步说明sMethod（）方法和yy成员不是子类的
         */
    }
}
