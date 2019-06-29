package test.com.qf.ThreadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-29 16:50
 * @ desc: 线程池
 **/

public class ThreadDemo5 {
    public static void main(String[] args) {
        //创建线程池（4种）
        //1、创建一个单线程线程池
        ExecutorService es1 = Executors.newSingleThreadExecutor();
        es1.execute(new MyRunable6());
        es1.execute(new MyRunable6());
        es1.shutdown();

        //2、创建一个固定大小的线程池
        ExecutorService es2 = Executors.newFixedThreadPool(1);
        es2.execute(new MyRunable6());
        es2.execute(new MyRunable6());
        es2.shutdown();

        //3、创建一个可缓存的线程池，线程池大小超出部分回收，不足的部分自动添加
        ExecutorService es3 = Executors.newCachedThreadPool();
        es3.execute(new MyRunable6());
        es3.execute(new MyRunable6());
        es3.shutdown();

        //4、创建一个无限制的线程池，执行定时的周期性的任务
        ScheduledExecutorService es4 = Executors.newScheduledThreadPool(3);//初始容量
        //es4.execute(new MyRunable6());
        //es4.execute(new MyRunable6());
        es4.schedule(new MyRunable6(), 3000, TimeUnit.MILLISECONDS);
        es4.shutdown();
    }
}
class MyRunable6 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + "--" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}