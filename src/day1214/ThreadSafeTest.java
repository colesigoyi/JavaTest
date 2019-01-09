package day1214;

/**
 * @author taoxuefeng
 * @create 2018-12-14 16:33
 * @desc 学习线程安全
 **/

public class ThreadSafeTest implements Runnable{
    int num = 10;
    @Override
    public void run() {
        while (true) {
            //使用同步方法
            doit();

            //使用同步块
            /*synchronized ("") {
                if (num > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("tickets" + num--);
                }else {
                    break;
                }
            }*/
        }
    }
    public synchronized void doit() {
        if(num > 0) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("tickets" + num--);
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();
        Thread t_1 = new Thread(t);
        Thread t_2 = new Thread(t);
        Thread t_3 = new Thread(t);
        Thread t_4 = new Thread(t);
        t_1.start();
        t_2.start();
        t_3.start();
        t_4.start();
    }
}
