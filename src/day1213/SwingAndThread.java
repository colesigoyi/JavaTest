package day1213;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Collection;
import java.util.Random;

/**
 * @author taoxuefeng
 * @create 2018-12-13 19:01
 * @desc
 **/

public class SwingAndThread extends JFrame {
    private JLabel jl = new JLabel();
    private static Thread t;
    private int count = 0;
    private Container container = getContentPane();

    public SwingAndThread() {
        setBounds(300, 200, 750, 300);
        container.setLayout(null);
        URL url = SwingAndThread.class.getResource("./1.jpg");
        Icon icon = new ImageIcon(url);
        jl.setIcon(icon);
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setBounds(10,10,200,50);
        jl.setOpaque(true);
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <= 200) {
                    jl.setBounds(count,10,500,200);
                    try{
                        Thread.sleep(100);
                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                    count += 1;
                    if(count == 200) {
                        count = 10;
                    }
                }
            }
        });
        t.start();
        container.add(jl);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SwingAndThread();
    }
}

