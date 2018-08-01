package com.fly.test;

import com.fly.util.GameUtil;

import java.awt.*;

public class GameFrame05 extends MyGame {
    Image img = GameUtil.getImage("iamges/sun.jpg");
    private double x = 100, y = 100;
    private double degree = 3.14 / 3;

    @Override
    public void paint(Graphics g) {
        g.drawImage(img, (int) x, (int) y, null);
        x += 100 + 100 * Math.cos(degree);
        y += 200 + 50 * Math.sin(degree);
        degree +=0.1;
    }
    public static void main(String[] args) {
        GameFrame gf= new GameFrame();
        gf.launchFrame();
    }
}