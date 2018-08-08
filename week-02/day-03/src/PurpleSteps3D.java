import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
    int xstart = 0;
    int ystart = 0;
    int squaresize = 15;

    for (int i = 0; i < 8; i++) {
      purpleSqare(graphics, xstart, ystart, squaresize);

      xstart += squaresize;
      ystart += squaresize;
      squaresize += 10;

    }
  }
  public  static void purpleSqare(Graphics graphics, int xstart, int ystart, int squaresize)  {
    graphics.setColor(Color.magenta);
    graphics.fillRect(xstart,ystart,squaresize,squaresize);
    graphics.setColor(Color.black);
    graphics.drawRect(xstart,ystart,squaresize,squaresize);




  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

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
