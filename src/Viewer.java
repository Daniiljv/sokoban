import javax.swing.JFrame;

public class Viewer {

  private Canvas gameCanvas;

  private Controller controller;
  private Model model;

  public Viewer() {
    controller = new Controller(this);
    model = controller.getModel();
    gameCanvas = new Canvas(model.getFirstNode());
    gameCanvas.setBounds(50, 100, 800, 700);

    JFrame frame = new JFrame("Sokoban");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(900, 830);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);

    frame.add(gameCanvas);
    frame.setVisible(true);
    frame.addKeyListener(controller);
  }

  public void update() {
    gameCanvas.repaint();
  }
}
