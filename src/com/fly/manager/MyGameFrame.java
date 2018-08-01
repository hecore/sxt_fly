package com.fly.manager;

import com.fly.util.GameUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* this is the JFrame Project
*
* */
//1.extends JFrame :then we can use the window
public class MyGameFrame extends JFrame {

//    02
    Image plane= GameUtil.getImage("Images/plane.png");
    Image bg=GameUtil.getImage("images/bg.jpg");
//01.init window
    public void launchFrame(){
        this.setTitle("hecore's game");
        this.setVisible(true);//default false
        this.setSize(500,500);
        this.setLocation(300,300);//center point

//      add event
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new PaintThread().start();
    }

//    paint

    @Override
    public void paint(Graphics g) { //auto call;g = a pencil
//        Color c=g.getColor();//native
//        Font f=g.getFont();
//        g.setColor(Color.BLUE);
//        g.drawLine(100,100,300,300);
//        g.fillRect(100,200,40,40);
//        g.drawString("我的改天",300,300);
//        g.setFont(new Font("宋体",Font.BOLD,40));
//        g.setColor(c);
//        g.setFont(f);
        g.drawImage(bg,0,0,null);
        g.drawImage(plane,250,250,null);
    }

    class PaintThread extends Thread{
        @Override
        public void run() {
            while (true){
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


//    03 mul_thread deal

    public static void main(String[] args) {
        MyGameFrame f=new MyGameFrame();
        f.launchFrame();
       // f.paint();
    }
}
