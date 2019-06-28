package test.com.qf.ThreadDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-28 23:37
 * @ desc:
 **/

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyRunnable2 mr2 = new MyRunnable2();
        Thread t = new Thread(mr2);
        t.start();

        for (int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName() + "--" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i==20){
                try {
                    t.join();//让t线程执行完毕
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName() + "--" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}