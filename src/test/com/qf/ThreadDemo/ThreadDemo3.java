package test.com.qf.ThreadDemo;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-29 09:42
 * @ desc: 守护线程与yield
 **/

public class ThreadDemo3 {
    public static void main(String[] args) {
        MyRunbale4 mr4 = new MyRunbale4();
        Thread t = new Thread(mr4);
        t.setName("线程");
        //优先级高可以提高该线程抢到CPU时间片的概率
        t.setPriority(Thread.MAX_PRIORITY);
        //线程分为守护线程和用户线程，当进程中没有用户线程，JVM虚拟机将退出
        t.setDaemon(true);//把线程设置成守护线程
        t.start();

        for(int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName() + "--" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i==5){
                Thread.yield();//让出本次CPU执行时间
            }
        }
    }
}

/**
 * 守护线程
 */
class MyRunbale4 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName() + "--" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
