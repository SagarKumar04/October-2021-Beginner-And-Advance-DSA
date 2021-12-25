package Tree;

public class TreeExample {
    Node root;

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    TreeExample() {
        root = null;
    }

    private void createNode() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }

    public static void main(String[] args) {
        TreeExample treeExample = new TreeExample();
        treeExample.createNode();
    }
}
