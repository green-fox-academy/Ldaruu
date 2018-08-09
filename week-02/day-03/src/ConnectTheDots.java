import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    // Create a function that takes 1 parameter:
    // An array of {x, y} points
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}
    int xBox [] = {10,290,290,10};
    int yBox [] = {10,10,290,290};
    int drawingpoint = 4;

    int xDraw [] = {50,70,80,90,100,120,85,50};
    int yDraw [] = {100,70,90,90,70,100,130,100};
    int drawpoints = xDraw.length;

    graphics.drawPolygon(xBox,yBox,drawingpoint);
    graphics.drawPolygon(xDraw,yDraw,drawpoints);

//    public static void lineDrawer( int x, int y, Graphics graphics) {
//
//      graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
//      graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);

  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

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
