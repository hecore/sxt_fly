package com.fly.cloud;

import java.awt.*;

public class Planet extends Star {
  
       // 除了图片，坐标，行星沿着某个椭圆运行：长轴，短轴，速度，绕着某个Star飞。
       double longAxis;// 长轴
       double shortAxis;// 短轴
       double speed;// 飞行速度
       Star center;//
       double degree;
  
       public void draw(Graphics g) {
               g.drawImage(img, (int) x, (int) y, null);
               // 沿着椭圆轨迹飞
               x = center.x + longAxis* Math.cos(degree);
               y = center.y + longAxis * Math.sin(degree);
               degree += speed;
  
       }
  
       public Planet(Star center, String imgpath, double longAxis,
        double shortAxis, double speed) {
               super();
               this.x = center.x + longAxis;
               this.y = center.y;
               this.longAxis = longAxis;
               this.shortAxis = shortAxis;
               this.speed = speed;
               this.center = center;
       }
  
       public Planet(Image img, double x, double y) {
               //super(img, x, y);
  
       }
  
       public Planet(String imgpath, double x, double y) {
               super(imgpath, x, y);
       }
  
}