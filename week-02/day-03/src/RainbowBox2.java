import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox2 {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.
    int size = WIDTH;
    String boxColor;

    ArrayList<String> colors = new ArrayList<>(Arrays.asList("#4d79ff","#248f24","#ff00bf","#0055ff","#b30000","#ff33cc","#8000ff","#ffff4d"));
    do {
      int i =  (int) (Math.random() * colors.size());
      boxColor = colors.get(i);

      boxDrawer(graphics,size,boxColor);
      size -= 2;
    } while (size > 0);
  }

  public static void boxDrawer(Graphics graphics, int size, String boxColor) {

    Color current = (Color.decode(boxColor));
    graphics.setColor(current);
    int x = (WIDTH / 2) - (size / 2);
    int y = (HEIGHT / 2) - (size / 2);
    graphics.fillRect(x, y, size, size);



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
