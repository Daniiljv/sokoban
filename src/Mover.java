public class Mover {

    private Node playerNode;

    public Mover(Node playerNode) {
        this.playerNode = playerNode;
    }

    public void move(String direction) {
        switch (direction) {
            case "Up":
                moveUp();
                break;
            case "Down":
                moveDown();
                break;
            case "Left":
                moveLeft();
                break;
            case "Right":
                moveRight();
                break;
        }
    }

    private void moveUp() {
        if (playerNode.getUp() != null && playerNode.getUp().getValue() == 'B') {
            Node upNode = playerNode.getUp();
            if (upNode.getUp() != null && checkBoxFinsih(upNode.getUp())) {
                upNode.setValue('S');
                upNode.getUp().setValue('B');
            }
        }

        if (playerNode.getUp() != null && checkBoxFinsih(playerNode.getUp())) {
            playerNode = playerNode.getUp();
            playerNode.setValue('P');
            if (playerNode.getDown() != null) {
                playerNode.getDown().setValue('S');
            }
        }
    }

    private void moveDown() {
        if (playerNode.getDown() != null && playerNode.getDown().getValue() == 'B') {
            Node downNode = playerNode.getDown();
            if (downNode.getDown() != null && checkBoxFinsih(downNode.getDown())) {
                downNode.setValue('S');
                downNode.getDown().setValue('B');
            }
        }

        if (playerNode.getDown() != null && checkBoxFinsih(playerNode.getDown())) {
            playerNode = playerNode.getDown();
            playerNode.setValue('P');
            if (playerNode.getUp() != null) {
                playerNode.getUp().setValue('S');
            }
        }
    }

    private void moveLeft() {
        if (playerNode.getLeft() != null && playerNode.getLeft().getValue() == 'B') {
            Node leftNode = playerNode.getLeft();
            if (leftNode.getLeft() != null && checkBoxFinsih(leftNode.getLeft())) {
                leftNode.setValue('S');
                leftNode.getLeft().setValue('B');
            }
        }

        if (playerNode.getLeft() != null && checkBoxFinsih(playerNode.getLeft())) {
            playerNode = playerNode.getLeft();
            playerNode.setValue('P');
            if (playerNode.getRight() != null) {
                playerNode.getRight().setValue('S');
            }
        }
    }

    private void moveRight() {
        if (playerNode.getRight() != null && playerNode.getRight().getValue() == 'B') {
            Node rightNode = playerNode.getRight();
            if (rightNode.getRight() != null && checkBoxFinsih(rightNode.getRight())) {
                rightNode.setValue('S');
                rightNode.getRight().setValue('B');
            }
        }

        if (playerNode.getRight() != null && checkBoxFinsih(playerNode.getRight())) {
            playerNode = playerNode.getRight();
            playerNode.setValue('P');
            if (playerNode.getLeft() != null) {
                playerNode.getLeft().setValue('S');
            }
        }
    }

    private boolean checkBoxFinsih(Node node) {
        if (node != null && (node.getValue() == 'S' || node.getValue() == 'F')) {
            return true;
        }
        return false;
    }


    private void moveMouse() {}
}
