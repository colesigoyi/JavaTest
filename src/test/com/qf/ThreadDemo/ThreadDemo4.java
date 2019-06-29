package test.com.qf.ThreadDemo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-29 09:56
 * @ desc: 线程同步:
 *          1.多线程共享数据时会发生线程不安全的情况
 *          2.多线程共享数据必须使用同步
 **/

public class ThreadDemo4 {
    public static void main(String[] args) {
        MyRunable5 mr5 = new MyRunable5();

        Thread t1 = new Thread(mr5);
        t1.setName("窗口1");
        Thread t2 = new Thread(mr5);
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}
class MyRunable5 implements Runnable{
    private int ticket = 10;//售票
    //private Object obj = new Object();//同步锁,也可以用this
    @Override
    public void run() {
        for (int i=0; i<300; i++){
            if(ticket > 0){
                //synchronized (this) {//同步代码块
                    //ticket--;
                    //if(ticket<0){
                    //    break;
                    //}
                    //try {
                    //    Thread.sleep(1000);
                    //} catch (InterruptedException e) {
                    //    e.printStackTrace();
                    //}
                    //System.out.println(Thread.currentThread().getName() +"--您购买的票剩余:" + ticket + "张票");

                }
            method();
            }
        }
    //同步方法:同步的对象是当前对象
    private synchronized void method(){
        ticket--;
        if(ticket>=0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +"--您购买的票剩余:" + ticket + "张票");
        }
    }
    //互斥锁
    ReentrantLock lock = new ReentrantLock();
    //lock实现同步,更加灵活
    private void method2(){
        lock.lock();//锁
        ticket--;
        if(ticket>=0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +"--您购买的票剩余:" + ticket + "张票");
        }
        lock.unlock();//释放锁
    }
}