package com.fly.cloud;

import com.fly.util.GameUtil;

import java.awt.*;

public class Star {
       Image img;
       double x, y;
       int width;
       int height;
  
       public Star() {
       }
  
       public void draw(Graphics g) {
               g.drawImage(img, (int) x, (int) y, null);
  
       }
  
       public Star(Image img) {
               this.img = img;
               this.width = img.getWidth(null);
               this.height = img.getHeight(null);
       }
  
       public Star(String imgpath, double x, double y) {
               //this(GameUtil.getImage(imgpath), x, y);
               this.img = GameUtil.getImage(imgpath);
               this.x = x;
               this.y = y;
       }
}
