public class NodeInitializer {

  private StringBuffer fileData;

  private Node firstNode;
  private Node playerNode;

  public NodeInitializer(StringBuffer fileData) {
    this.fileData = fileData;
    createNodes();
  }

  public void createNodes() {

    Node upRowStartNode = null;
    Node currentRowStartNode = null;

    firstNode = null;
    playerNode = null;

    int y = 0;

    String upRow = getNextRow(fileData);
    String middleRow = getNextRow(fileData);

    if (upRow != null && !upRow.isEmpty()) {

      Node previousNode = null;

      for (int i = 0; i < upRow.length(); i++) {

        Node currentNode = new Node(upRow.charAt(i));

        if (i == 0) {
          firstNode = currentNode;
          upRowStartNode = currentNode;
        }

        if (currentNode.getValue() == 'P') {
          playerNode = currentNode;
        }

        if (previousNode != null) {
          currentNode.setLeft(previousNode);
          previousNode.setRight(currentNode);
        }

        previousNode = currentNode;

      }

      y = y + 1;

    }

    while(middleRow != null && !middleRow.isEmpty()) {

      Node previousNode = null;
      Node upNode = upRowStartNode;

      for (int i = 0; i < middleRow.length(); i++) {
        
        Node currentNode = new Node(middleRow.charAt(i));

        if (i == 0) {
          currentRowStartNode = currentNode;
        }

        if (currentNode.getValue() == 'P') {
          playerNode = currentNode;
        }

        if (previousNode != null) {
          currentNode.setLeft(previousNode);
          previousNode.setRight(currentNode);
        }

        if (upNode != null) {
          currentNode.setUp(upNode);
          upNode.setDown(currentNode);

          upNode = upNode.getRight();
        }

        previousNode = currentNode;

      }

      upRowStartNode = currentRowStartNode;
      middleRow = getNextRow(fileData);

      y = y + 1;

    }

  }

  private String getNextRow(StringBuffer fileData) {
    if (fileData == null || fileData.isEmpty()) {
      return null;
    }

    int newlineIndex = fileData.indexOf("\n");

    if (newlineIndex == -1) {
      String row = fileData.toString();
      fileData.setLength(0);
      return row;
    }

    String row = fileData.substring(0, newlineIndex);
    fileData.delete(0, newlineIndex + 1);
    return row;
  }

  public Node getPlayerNode() {
    return playerNode;
  }

  public Node getFirstNode() {
    return firstNode;
  }

}
