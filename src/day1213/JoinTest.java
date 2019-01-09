package day1213;

import javax.swing.*;
import java.awt.*;

/**
 * @author taoxuefeng
 * @create 2018-12-13 20:30
 * @desc 该实例包括两个进度条，进度条的进程由线程管理，学习使用join方法进行插入线程
 **/

public class JoinTest extends JFrame {

    private Thread threadA;
    private Thread threadB;
    final JProgressBar progressBar1 = new JProgressBar();
    final JProgressBar progressBar2 = new JProgressBar();
    int count = 0;

    public static void main(String[] args) {
        init(new JoinTest(),100,100);
    }

    public JoinTest(){
        super();
        getContentPane().add(progressBar1,BorderLayout.NORTH);
        getContentPane().add(progressBar2,BorderLayout.SOUTH);
        progressBar1.setStringPainted(true);
        progressBar2.setStringPainted(true);
        threadA = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while (true) {
                    progressBar1.setValue(++count);
                    try {
                        Thread.sleep(100);
                        threadB.join();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start();
        threadB = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while (true) {
                    progressBar2.setValue(++count);
                    try {
                        Thread.sleep(100);
                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                    if(count == 100) {
                        break;
                    }
                }
            }
        });
        threadB.start();
    }
    private static void init(JFrame frame, int width, int height) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
