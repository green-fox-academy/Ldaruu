import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    for (int x = 0; x <= WIDTH; x += 20) {
      for (int y = 0; y <= HEIGHT; y += 20) {
        graphics.setColor(new Color(138, 0, 230));
        graphics.drawLine(x + 25, 0, HEIGHT, x + 10);
        graphics.setColor(new Color(0, 255, 85));
        graphics.drawLine(0, y + 25, y + 10, WIDTH);
      }
    }
  }
  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

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
