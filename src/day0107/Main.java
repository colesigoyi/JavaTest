package day0107;

/**
 * @author taoxuefeng
 * @create 2019-01-07 19:06
 * @desc Synchronized关键字
 **/

class Sync {
    //public synchronized void test() { //只能防止多个线程同时执行同一个对象的同步代码段
    public void test() {
        synchronized (Sync.class) {
            System.out.println("test开始..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test结束..");
        }
    }
}

class MyThread extends Thread {

    public void run() {
        Sync sync = new Sync();
        sync.test();
    }
    /*private Sync sync;

    public MyThread(Sync sync) {
        this.sync = sync;
    }

    public void run() {
        sync.test();
    }*/
}

public class Main {

    public static void main(String[] args) {
        //Sync sync = new Sync();
        for (int i = 0; i < 3; i++) {
            Thread thread = new MyThread();
            //Thread thread = new MyThread(sync);
            thread.start();
        }
    }
}

