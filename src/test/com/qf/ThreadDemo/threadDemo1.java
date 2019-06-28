package test.com.qf.ThreadDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-28 15:05
 * @ desc: 线程与进程
 *         线程的休眠：在当前线程的执行中，暂停指定的毫秒数，释放CPU的时间片
 **/

public class threadDemo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();//启动线程，准备就绪的意思

        //推荐使用方式
        //实现接口更加灵活，继承更方便
        MyRunnable mr = new MyRunnable();
        Thread t2 = new Thread(mr);
        t2.start();
    }
}

/**
 * 实现线程的第一种方式，继承Thread类
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 实现线程的第二种方式：实现Runnable接口
 */
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}