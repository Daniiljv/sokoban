import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;


public class Canvas extends JPanel {

  private Node firstElement;
  private int height;
  private int width;

  private BasicStroke basicStrokeSize1;
  private BasicStroke basicStrokeSize2;
  private BasicStroke basicStrokeSize4;
  private BasicStroke basicStrokeSize5;


  public Canvas(Node firstElement) {
    this.firstElement = firstElement;
    height = 40;
    width = 40;

    basicStrokeSize1 = new BasicStroke(1);
    basicStrokeSize2 = new BasicStroke(2);
    basicStrokeSize4 = new BasicStroke(4);
    basicStrokeSize5 = new BasicStroke(5);
  }

  public void paint(Graphics g) {
    super.paint(g);
    drawPlayField(g);
  }

  public void drawPlayField(Graphics g) {

    Graphics2D graphics2D = (Graphics2D) g;
    graphics2D.setBackground(Color.decode("#849EA1"));

    int x = 0;
    int y = 0;

    Node tempNode = firstElement;
    Graphics2D g2d = (Graphics2D) g;

    while (tempNode != null) {

      Node currentNode = tempNode;

      while (currentNode != null) {
        switch (currentNode.getValue()) {
          case 'S':
            graphics2D.setColor(Color.decode("#849EA1"));
            g.fillRect(x, y, width, height);
            break;
          case 'P':
            graphics2D.setColor(Color.decode("#849EA1"));
            g2d.fillRect(x, y, width, height);

            //Ears
            g2d.setColor(Color.decode("#D2BA92"));
            g2d.fillOval(x + 4, y + 15, 5, 5);
            g2d.setColor(Color.decode("#D2BA92"));
            g2d.fillOval(x + 30, y + 15, 5, 5);

            //Face
            g2d.setColor(Color.decode("#FCDEAF"));
            g2d.fillOval(x + 6, y + 5, 27, 20);

            //Eyes
            g2d.setColor(Color.decode("#6B4E3A"));
            g2d.fillOval(x + 11, y + 13, 4, 6);
            g2d.setColor(Color.decode("#6B4E3A"));
            g2d.fillOval(x + 25, y + 13, 4, 6);

            //Mustage
            g2d.setColor(Color.decode("#6B4E3A"));
            g2d.fillOval(x + 15, y + 18, 11, 3);

            //Nose
            g2d.setColor(Color.decode("#948266"));
            g2d.fillOval(x + 18, y + 17, 4, 3);

            //Hat
            g2d.setColor(Color.decode("#28B162"));
            g2d.fillRect(x + 6, y + 3, 27, 6);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(x + 17, y + 4, 5, 5);
            g2d.setColor(Color.decode("#2ECC71"));
            g2d.fillRect(x + 5, y + 9, 29, 3);

            //Foots
            g2d.setColor(Color.decode("#323333"));
            g2d.fillOval(x + 6, y + 35, 10, 5);
            g2d.fillOval(x + 24, y + 35, 10, 5);

            //Body
            g2d.setColor(Color.decode("#2ECC71"));
            g2d.fillRect(x + 5, y + 23, 30, 14);
            g2d.setStroke(basicStrokeSize2);
            g2d.setColor(Color.BLACK);
            g2d.drawLine(x + 5, y + 30, x + 35, y + 30);
            g2d.setColor(Color.YELLOW);
            g2d.drawRect(x + 17, y + 29, 6, 2);
            g2d.setColor(Color.decode("#849EA1"));
            g2d.fillRect(x + 17, y + 35, 6, 4);

            //Hands
            g2d.setColor(Color.decode("#FFE0B1"));
            g2d.fillOval(x + 5, y + 25, 7, 10);
            g2d.fillOval(x + 28, y + 25, 7, 10);

            g2d.setStroke(basicStrokeSize1);

            break;

          case 'B':
            g2d.setColor(Color.decode("#AA733C"));
            g2d.fillRect(x, y, width, height);

            g2d.setColor(Color.decode("#7A542C"));
            g2d.setStroke(basicStrokeSize2);
            for (int i = x + 10; i < x + width; i = i + 10) {
              g2d.drawLine(i, y + 2, i, y + 38);
            }

            g2d.setColor(Color.decode("#CD8C4A"));
            g2d.setStroke(basicStrokeSize4);
            g2d.drawRect(x + 2, y + 2, 35, 35);
            g2d.setStroke(basicStrokeSize1);
            break;
          case 'W':
            g2d.setColor(Color.decode("#4C5B5C"));
            g2d.fillRect(x, y, width, height);

            g2d.setStroke(basicStrokeSize5);
            g2d.setColor(Color.decode("#6D8284"));
            g2d.drawLine(x + 5, y + 5, x + 35, y + 35);
            g2d.drawLine(x + 35, y + 5, x + 5, y + 35);

            g2d.setColor(Color.decode("#5F7274"));
            g2d.drawRect(x + 3, y + 3, 34, 34);

            g2d.setStroke(basicStrokeSize1);

            break;
          case 'F':
            g2d.setColor(Color.decode("#849EA1"));
            g2d.fillRect(x, y, width, height);

            g2d.setColor(Color.decode("#35DA7C"));
            g2d.setStroke(basicStrokeSize4);
            g2d.drawLine(x + 5, y + 5, x + 35, y + 35);
            g2d.drawLine(x + 35, y + 5, x + 5, y + 35);

            g2d.setStroke(basicStrokeSize1);
            break;

          case 'G':
            g2d.setColor(Color.decode("#219853"));
            g2d.fillRect(x, y, width, height);

            g2d.setColor(Color.decode("#28B462"));
            g2d.setStroke(basicStrokeSize2);
            for (int i = x + 10; i < x + width; i = i + 10) {
              g2d.drawLine(i, y + 2, i, y + 38);
            }

            g2d.setColor(Color.decode("#2ECC71"));
            g2d.setStroke(basicStrokeSize4);
            g2d.drawRect(x + 2, y + 2, 35, 35);
            g2d.setStroke(basicStrokeSize1);

            break;

          case 'Z':
            g2d.setColor(Color.decode("#849EA1"));
            g2d.fillRect(x, y, width, height);

            g2d.setColor(Color.decode("#35DA7C"));
            g2d.setStroke(basicStrokeSize4);
            g2d.drawLine(x + 5, y + 5, x + 35, y + 35);
            g2d.drawLine(x + 35, y + 5, x + 5, y + 35);

            g2d.setStroke(basicStrokeSize1);

            //Ears
            g2d.setColor(Color.decode("#D2BA92"));
            g2d.fillOval(x + 4, y + 15, 5, 5);
            g2d.setColor(Color.decode("#D2BA92"));
            g2d.fillOval(x + 30, y + 15, 5, 5);

            //Face
            g2d.setColor(Color.decode("#FCDEAF"));
            g2d.fillOval(x + 6, y + 5, 27, 20);

            //Eyes
            g2d.setColor(Color.decode("#6B4E3A"));
            g2d.fillOval(x + 11, y + 13, 4, 6);
            g2d.setColor(Color.decode("#6B4E3A"));
            g2d.fillOval(x + 25, y + 13, 4, 6);

            //Mustage
            g2d.setColor(Color.decode("#6B4E3A"));
            g2d.fillOval(x + 15, y + 18, 11, 3);

            //Nose
            g2d.setColor(Color.decode("#948266"));
            g2d.fillOval(x + 18, y + 17, 4, 3);

            //Hat
            g2d.setColor(Color.decode("#28B162"));
            g2d.fillRect(x + 6, y + 3, 27, 6);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(x + 17, y + 4, 5, 5);
            g2d.setColor(Color.decode("#2ECC71"));
            g2d.fillRect(x + 5, y + 9, 29, 3);

            //Foots
            g2d.setColor(Color.decode("#323333"));
            g2d.fillOval(x + 6, y + 35, 10, 5);
            g2d.fillOval(x + 24, y + 35, 10, 5);

            //Body
            g2d.setColor(Color.decode("#2ECC71"));
            g2d.fillRect(x + 5, y + 23, 30, 14);
            g2d.setStroke(basicStrokeSize2);
            g2d.setColor(Color.BLACK);
            g2d.drawLine(x + 5, y + 30, x + 35, y + 30);
            g2d.setColor(Color.YELLOW);
            g2d.drawRect(x + 17, y + 29, 6, 2);
            g2d.setColor(Color.decode("#849EA1"));
            g2d.fillRect(x + 17, y + 35, 6, 4);

            //Hands
            g2d.setColor(Color.decode("#FFE0B1"));
            g2d.fillOval(x + 5, y + 25, 7, 10);
            g2d.fillOval(x + 28, y + 25, 7, 10);

            g2d.setStroke(basicStrokeSize1);

            break;
        }
        x = x + width;
        currentNode = currentNode.getRight();
      }

      tempNode = tempNode.getDown();
      y = y + height;
      x = 0;
    }
  }
}
