package com.greenfoxacademy;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalRect {
  public static void mainDraw(Graphics graphics) {
    int size = HEIGHT/3;
    int startingPositionX = WIDTH/3;
    int startingPositionY = 0;

    drawFractal(startingPositionX, startingPositionY, size, graphics);


  }

  public static void drawCircle(int x, int y, int size, Graphics graphics) {
    Random random = new Random();
//    graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
    graphics.drawRect(x, y, size, size);
  }

  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    drawCircle(x, y, size, graphics);
    if (size > 10) {
//      drawFractal(x + size / 3, y + size / 2, size / 2, graphics);
//      drawFractal(x + size * 3 /4, y + size / 4, size /2, graphics);
//      drawFractal(x + size / 4, y - size / 4, size / 2, graphics);
//      drawFractal(x + size / 4, y + size * 3 / 4, size / 2,graphics);
    }


  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}