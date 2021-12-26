package Tree;

/*
Preorder
Inorder
Postorder
 */

public class TreeTraversal1 {
    Node root;

    class Node {
        char data;
        Node left, right;

        Node(char data) {
            this.data = data;
            left = right = null;
        }
    }

    TreeTraversal1() {
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

    private void printPreorder(Node rootNode) {
        if(rootNode == null) {
            return;
        }
        else {
            System.out.print(rootNode.data + " ");
            printPreorder(rootNode.left);
            printPreorder(rootNode.right);
        }
    }

    private void printInorder(Node rootNode) {
        if(rootNode == null) {
            return;
        }
        else {
            printInorder(rootNode.left);
            System.out.print(rootNode.data + " ");
            printInorder(rootNode.right);
        }
    }

    private void printPostorder(Node rootNode) {
        if(rootNode == null) {
            return;
        }
        else {
            printPostorder(rootNode.left);
            printPostorder(rootNode.right);
            System.out.print(rootNode.data + " ");
        }
    }

    public static void main(String[] args) {
        TreeTraversal1 treeTraversal = new TreeTraversal1();
        treeTraversal.createTree();

        System.out.println("Preorder: ");
        treeTraversal.printPreorder(treeTraversal.root);

        System.out.println("Inorder: ");
        treeTraversal.printInorder(treeTraversal.root);

        System.out.println("Postorder: ");
        treeTraversal.printPostorder(treeTraversal.root);
    }
}
