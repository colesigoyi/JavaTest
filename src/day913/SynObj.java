package day913;

/**
 * @author taoxuefeng
 * @create 2018-10-08 00:52
 * @desc 测试多线程和锁
 **/

public class SynObj {
    public synchronized void methodA() {
        System.out.println("methodA......");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB() {
        synchronized (this) {
            System.out.println("methodB......");
        }
    }

    public void methodC() {
        String str = "ssss";
        synchronized (str) {
            System.out.println("methodC......");
        }
    }
}
class TestSyn {
    public static void main(String[] args) {
        final SynObj obj = new SynObj();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.methodA();
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.methodB();
            }
        });
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.methodC();
            }
        });
        t3.start();
    }
}
