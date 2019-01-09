package day1203;

/**
 * @author taoxuefeng
 * @create 2018-12-03 18:37
 * @desc 说明对象是如何调用类成员
 **/

public class TransferProperty {
    int i = 47;
    static int j = 50;
    public void call() {
        System.out.println("调用call()方法");
        for(i=0; i<3; i++) {
            System.out.println(i + " ");
            if(i==2) {
                System.out.println("\n");
            }
        }
    }
    public TransferProperty() {
    }
    public static void main(String[] args) {
        TransferProperty t1 = new TransferProperty();
        TransferProperty t2 = new TransferProperty();
        t2.i = 60;
        System.out.println("第一个实例对象调用变量i的结果： " + t1.i++);
        t1.call();
        System.out.println("第二个实例对象调用变量i的结果： " + t2.i);
        t2.call();
        //因为i不是静态的，两个对象产生的是独立的

        TransferProperty t3 = new TransferProperty();
        TransferProperty t4 = new TransferProperty();
        t4.j = 60;
        System.out.println("第一个实例对象调用变量i的结果： " + t3.j++);
        t3.call();
        System.out.println("第二个实例对象调用变量i的结果： " + t4.j);
        t4.call();
        //变量j不会被其中任何一个对象所改变，因为j是static静态的，静态变量的值可以被本类活其他类的对象共享
        //在内存中两个对象同时指向同一块内存区域
    }
}
