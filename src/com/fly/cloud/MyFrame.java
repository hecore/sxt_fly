package com.fly.cloud;

import com.fly.common.Constant;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
  
       /**
        * 加载 窗口的方法的封装
        * 
        */
       public void launchFrame() {
               setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGTH);
               setLocation(100, 100);
               setVisible(true);
  
               new PaintThread().start();// 启动重画线程
               /**
                * 关闭窗口
                * 
                */
               addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                                 System.exit(0);
                        }
               });
  
       }
  
       /**
        * 定一个重画窗口的线程的类，还是一个内部类，方便访问外部类的属于。
        * 
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
  
}