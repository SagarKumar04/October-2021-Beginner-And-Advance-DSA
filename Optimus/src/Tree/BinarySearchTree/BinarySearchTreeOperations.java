package Tree.BinarySearchTree;

public class BinarySearchTreeOperations {
    class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    Node root;

    void delete(int key) {
        deleteHelper(root, key);
    }

    Node deleteHelper(Node root, int key) {
        if(root == null) {
            return root;
        }
        else {
            if (key < root.key) {
                root.left = deleteHelper(root.left, key);
            }
            else if (key > root.key) {
                root.right = deleteHelper(root.right, key);
            }
            else {
                if (root.left == null) {
                    return root.right;
                }
                else if (root.right == null) {
                    return root.left;
                }
                else {
                    root.key = getInorderSuccessor(root.right);
                    root.right = deleteHelper(root.right, root.key);
                }
            }
        }

        return root;
    }

    int getInorderSuccessor(Node root) {
        int minValue = root.key;

        while(root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }

        return minValue;
    }

    boolean search(Node root, int key) {
        boolean isFound;
        if(root == null) {
            isFound = false;
        }
        else if(root.key == key) {
            isFound = true;
        }
        else {
            if(key < root.key) {
                isFound = search(root.left, key);
            }
            else {
                isFound = search(root.right, key);
            }
        }

        return isFound;
    }

    void printInorder(Node rootNode) {
        if(rootNode == null) {
            return;
        }
        else {
            printInorder(rootNode.left);
            System.out.print(rootNode.key + " ");
            printInorder(rootNode.right);
        }
    }

    void insert(int key) {
        root = insertHelper(root, key);
    }

    Node insertHelper(Node root, int key) {
        Node node = new Node (key);
        if(root == null) {
            root = node;
        }
        else {
            if(key < root.key) {
                root.left = insertHelper(root.left, key);;
            }
            else {
                root.right = insertHelper(root.right, key);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        BinarySearchTreeOperations binarySearchTreeOperations = new BinarySearchTreeOperations();
        binarySearchTreeOperations.insert(100);
        binarySearchTreeOperations.insert(80);
        binarySearchTreeOperations.insert(120);
        binarySearchTreeOperations.insert(90);
        binarySearchTreeOperations.insert(110);
        binarySearchTreeOperations.insert(130);
        binarySearchTreeOperations.insert(70);

        binarySearchTreeOperations.printInorder(binarySearchTreeOperations.root);
        System.out.println();

        boolean isFound = binarySearchTreeOperations.search(binarySearchTreeOperations.root, 110);
        System.out.println("110 found: " + isFound);
        isFound = binarySearchTreeOperations.search(binarySearchTreeOperations.root, 200);
        System.out.println("200 found: " + isFound);

        binarySearchTreeOperations.delete(70);
        binarySearchTreeOperations.printInorder(binarySearchTreeOperations.root);
        System.out.println();
        binarySearchTreeOperations.delete(80);
        binarySearchTreeOperations.printInorder(binarySearchTreeOperations.root);
        System.out.println();
        binarySearchTreeOperations.delete(120);
        binarySearchTreeOperations.printInorder(binarySearchTreeOperations.root);
        System.out.println();
    }
}
