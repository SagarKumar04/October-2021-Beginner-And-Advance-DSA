package Tree;

/*
Level-Order
 */

public class TreeTraversal2 {
    Node root;

    class Node {
        char data;
        Node left, right;

        Node(char data) {
            this.data = data;
            left = right = null;
        }
    }
    
    TreeTraversal2() {
        root = null;
    }

    private void createTree() {
        root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.left.right = new Node('E');
        root.left.left.left = new Node('F');
    }

    private int calculateHeight(Node root) {
        int height = 0;

        if(root != null) {
            int leftHeight = calculateHeight(root.left);
            int rightHeight = calculateHeight(root.right);

            /*
            if(leftHeight < rightHeight) {
                height = rightHeight + 1;
            }
            else {
                height = leftHeight + 1;
            }
             */

            height = Math.max(leftHeight, rightHeight) + 1;
        }

        return height;
    }

    private void printCurrentLevel(Node root, int level) {
        if(root != null) {
            if(level == 0) {
                System.out.print(root.data + " ");
            }
            else {
                printCurrentLevel(root.left, level - 1);
                printCurrentLevel(root.right, level - 1);
            }
        }
    }

    private void printLevelOrder() {
        int heightOfTree = calculateHeight(root) - 1;

        for(int i = 0; i <= heightOfTree; i++) {
            printCurrentLevel(root, i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TreeTraversal2 treeTraversal2 = new TreeTraversal2();
        treeTraversal2.createTree();

        System.out.println("Level Order: ");
        treeTraversal2.printLevelOrder();
    }
}
