public class Model {

  private Viewer viewer;

  private Loader loader;
  private Mover mover;
  private NodeInitializer nodeInitializer;

  private Node firstNode;
  private Node playerNode;

  public Model(Viewer viewer) {
    this.viewer = viewer;

    loader = new Loader();
    nodeInitializer = new NodeInitializer(loader.loadLevel());

    firstNode = nodeInitializer.getFirstNode();
    playerNode = nodeInitializer.getPlayerNode();
    mover = new Mover(playerNode);
  }

  public void move(String direction) {
    mover.move(direction);
    viewer.update();
  }

  public Node getFirstNode() {
    return firstNode;
  }


}
