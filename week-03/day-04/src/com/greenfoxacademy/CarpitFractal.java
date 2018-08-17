package com.greenfoxacademy;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CarpitFractal {
  public static void mainDraw(Graphics graphics) {
    int size = WIDTH / 3;
    int startingPositionX = WIDTH / 3;
    int startingPositionY = WIDTH / 3;

    drawFractal(startingPositionX, startingPositionY, size, graphics);

  }

  public static void drawRect(int x, int y, int size, Graphics graphics) {
    graphics.fillRect(x, y, size, size);  // Center FillRect , start position
  }

  public static void drawFractal(int x, int y, int size, Graphics graphics) {
    drawRect(x, y, size, graphics);
    if (size > 5) {

//      Top of the Fractal
      drawFractal(x - (size * 2) / 3, y - (size / 3) * 2, size / 3, graphics);  // Top Left
      drawFractal(x + (size / 3), y - (size / 3) * 2, size / 3, graphics);      // Top Mid
      drawFractal(x + (size / 3) * 4, y - (size / 3) * 2, size / 3, graphics);  // Top Right

//      Left side of the Fractal
      drawFractal(x - (size * 2) / 3, y + (size / 3), size / 3, graphics);      // Left Mid
      drawFractal(x - (size * 2) / 3, y + (size / 3) * 4, size / 3, graphics);  // Left bottom

//      Bottom of the Fractal
      drawFractal(x + (size / 3), y + (size / 3) * 4, size / 3, graphics);    // Bottom Mid
      drawFractal(x + (size / 3) * 4, y + (size / 3) * 4, size / 3, graphics); // Bottom Right
//
//     Right mid Rect
      drawFractal(x + (size / 3) * 4, y + (size / 3), size / 3, graphics);  //Right Mid

    }
  }
  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

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
//      this.setBackground(new Color(255, 255, 0));
      mainDraw(graphics);
    }
  }
}