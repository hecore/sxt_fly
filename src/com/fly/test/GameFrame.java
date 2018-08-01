package com.fly.test;

import com.fly.util.GameUtil;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 游戏窗口类
 * @author Administrator
 *
 */
public class GameFrame extends Frame {// gui编程：awt,swing等；

    Image img = GameUtil.getImage("images/sun.png");

    /**
     * 加载 窗口
     */
    public void launchFrame() {
        setSize(300, 300);
        setLocation(100, 100);
        setVisible(true);

        new PaintThread().start();// 启动重画线程

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    private double x = 100, y = 100;

    @Override
    public void paint(Graphics g) {
        System.out.println("paint!!!!");
        g.drawLine(100, 100, 200, 200);
        g.drawRect(100, 100, 200, 200);
        g.drawOval(100, 100, 200, 200);

        Font f = new Font("宋体", Font.BOLD, 100);
        g.setFont(f);
        g.drawString("我是尚学堂高淇！", 200, 200);

        g.fillRect(100, 100, 20, 20);
        Color c = g.getColor();
        g.setColor(Color.red);
        g.fillOval(300, 300, 20, 20);
        g.setColor(c);
        g.drawImage(img, (int) x, (int) y, null);

        x += 3;
        y += 3;

    }

    /**
     * 定一个重画窗口的线程的类，还是一个内部类，方便访问外部类的属于。
     * @author Administrator
     *
     */
    class PaintThread extends Thread {
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(40);// 1s=1000ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        GameFrame gf = new GameFrame();
        gf.launchFrame();
    }
}