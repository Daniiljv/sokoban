public class Node {

  private char value;

  private Node right;
  private Node left;
  private Node up;
  private Node down;

  public Node(char value) {
    this.value = value;
  }

  public void setRight(Node vertex) {
    right = vertex;
  }

  public void setLeft(Node vertex) {
    left = vertex;
  }

  public void setUp(Node vertex) {
    up = vertex;
  }

  public void setDown(Node vertex) {
    down = vertex;
  }

  public Node getRight() {
    return right;
  }

  public Node getLeft() {
    return left;
  }

  public Node getUp() {
    return up;
  }

  public Node getDown() {
    return down;
  }

  public char getValue() {
    return value;
  }

  public void setValue(char value) {
    this.value = value;
  }

}
