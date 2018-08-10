import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangels {
  public static void mainDraw(Graphics graphics) {
    for (int x = 0; x <WIDTH; x+=20 ) {
        graphics.drawLine(x / 2, WIDTH - x, WIDTH - x / 2, WIDTH - x);

      }



//      for (int k = 0; k < WIDTH; k += 11) {
//        graphics.drawLine(WIDTH/2 -i/2, k, WIDTH-i, WIDTH );
      }
//    }

//    triangleDrawer(graphics, x, y);
//      }

//    public static void triangleDrawer (Graphics graphics){
//      int x[] = {WIDTH/2, WIDTH - 10, WIDTH +10};
//      int y[] = {};
//      int endpoint = 3;
//      graphics.setColor(Color.BLACK);
//      graphics.drawPolygon(x, y, endpoint);
//
//

//
//



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

