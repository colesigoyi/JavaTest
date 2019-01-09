package day1213;

/**
 * @author taoxuefeng
 * @create 2018-12-13 17:15
 * @desc 多线程学习
 **/

public class ThreadTest extends Thread {
    private int count=10;
    public void run() { //重写run方法
        while (true) {
            System.out.print(count + " ");
            if(--count == 0) { //使count变量自减，当自减到0时退出循环
                return;
            }
        }
    }
    public static void main(String[] args) {
        new ThreadTest().start();
    }
}


