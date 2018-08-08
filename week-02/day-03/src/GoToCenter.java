import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.

    for (int i = 0; i < 3; i++) {

      int xCordinate = (int) (Math.random() * WIDTH);  // first u multiple the random num which is between 0 and 0.9
      int yCordinate = (int) (Math.random() * HEIGHT); // and after  turn it to Int

      lineDrawer(graphics, xCordinate, yCordinate);
    }
  }

  public static void lineDrawer(Graphics graphics, int xCordinate, int yCordinate) {

    graphics.setColor(new Color((int)Math.random() * 255, (int)Math.random() * 255, (int)Math.random() *255));
    graphics.drawLine(xCordinate, yCordinate, WIDTH / 2, HEIGHT / 2);
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
