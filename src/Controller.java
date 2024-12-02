import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class Controller implements KeyListener, MouseListener, MouseWheelListener, MouseMotionListener{

  private Model model;

  public Controller(Viewer viewer) {
    model = new Model(viewer);
  }

  public void keyPressed(KeyEvent event) {
    int keyCode = event.getKeyCode();
    String direction = "";

    switch (keyCode) {
      case 37:
          direction = "Left";
      break;
      case 38:
          direction = "Up";
      break;
      case 39:
          direction = "Right";
      break;
      case 40:
          direction = "Down";
      break;
      default:
      return;
    }

    model.move(direction);

  }

  public void keyReleased(KeyEvent event) {}
  public void keyTyped(KeyEvent event) {}

  public void mouseWheelMoved(MouseWheelEvent event) {}
  public void mouseDragged(MouseEvent event) {}
  public void mouseMoved(MouseEvent event) {}

  public void mouseExited(MouseEvent event) {}
  public void mouseEntered(MouseEvent event) {}
  public void mouseReleased(MouseEvent event) {}
  public void mousePressed(MouseEvent event) {}
  public void mouseClicked(MouseEvent event) {}

  public Model getModel() {
    return model;
  }

}
