package day1214;

import javax.swing.*;
import java.awt.*;
/**
 * @author taoxuefeng
 * @create 2018-12-14 15:57
 * @desc 学习线程优先级
 **/

public class PriorityTest extends JFrame {

private Thread threadA;
    private Thread threadB;
    private Thread threadC;
    private Thread threadD;

    final JProgressBar progressBar1 = new JProgressBar();
    final JProgressBar progressBar2 = new JProgressBar();
    final JProgressBar progressBar3 = new JProgressBar();
    final JProgressBar progressBar4 = new JProgressBar();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();


    public PriorityTest() {
        super();
        panel1.add(progressBar1);
        panel1.add(progressBar2);
        panel2.add(progressBar3);
        panel2.add(progressBar4);

        getContentPane().add(panel1,BorderLayout.NORTH);
        getContentPane().add(panel2,BorderLayout.SOUTH);

        progressBar1.setStringPainted(true);
        progressBar2.setStringPainted(true);
        progressBar3.setStringPainted(true);
        progressBar4.setStringPainted(true);

        threadA = new Thread(new MyThread(progressBar1));
        threadB = new Thread(new MyThread(progressBar2));
        threadC = new Thread(new MyThread(progressBar3));
        threadD = new Thread(new MyThread(progressBar4));
        setPriority("threadA",5, threadA);
        setPriority("threadB",5, threadB);
        setPriority("threadC",4, threadC);
        setPriority("threadD",3, threadD);

    }
    public static void setPriority(String threadName, int priority, Thread t) {
        t.setPriority(priority);
        t.setName(threadName);
        t.start();
    }

    public static void main(String[] args) {
        init(new PriorityTest(),600,300);
    }

    private static void init(JFrame frame, int width, int height) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }

    private final class MyThread implements Runnable {
        private final JProgressBar bar;
        int count = 0;
        public MyThread(JProgressBar bar) {
            this.bar = bar;
        }
        @Override
        public void run() {
            while (true) {
                bar.setValue(count+=10);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    System.out.println("当前线程被中断");
                }
            }
        }
    }
}
