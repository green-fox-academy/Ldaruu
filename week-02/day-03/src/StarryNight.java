import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)

    int size = WIDTH;
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0,0 ,size  ,size);

    for (int i = 0; i< WIDTH * 2; i++) {

      int x = (int) (Math.random() * WIDTH);
      int y = (int) (Math.random() * HEIGHT);
      int color = (int)(Math.random() * 255);

      drawStars(graphics,x,y, color);
    }

  }
  public static void drawStars(Graphics graphics, int x, int y, int color) {

    graphics.setColor(new Color(color,color,color));
    graphics.fillRect(x,y, 3, 3);
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
