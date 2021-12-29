package Tree.Construction;

public class InorderAndPreorder {
    Node root;
    int preorderIndex = 0;

    class Node {
        char data;
        Node left, right;

        Node(char data) {
            this.data = data;
            left = right = null;
        }
    }

    int search(char inorder[], int start, int end, int key) {
        int position = 0;
        for(int i = start; i <= end; i++) {
            if(inorder[i] == key) {
                position = i;
                break;
            }
        }

        return position;
    }

    void printInorder(Node rootNode) {
        if(rootNode == null) {
            return;
        }
        printInorder(rootNode.left);
        System.out.print(rootNode.data + " ");
        printInorder(rootNode.right);
    }

    Node buildTree(char inorder[], char preorder[],
                   int inorderStartIndex, int inorderEndIndex) {
        if(inorderStartIndex > inorderEndIndex) {
            return null;
        }

        Node rootNode = new Node(preorder[preorderIndex++]);

        if(inorderStartIndex == inorderEndIndex) {
            return rootNode;
        }

        int inorderIndex = search(inorder, inorderStartIndex,
                inorderEndIndex, rootNode.data);

        rootNode.left = buildTree(inorder, preorder,
                inorderStartIndex, inorderIndex - 1);
        rootNode.right = buildTree(inorder, preorder,
                inorderIndex + 1, inorderEndIndex);

        return rootNode;
    }

    public static void main(String[] args) {
        char inorder[] = {'D', 'B', 'E', 'A', 'F', 'C'};
        char preorder[] = {'A', 'B', 'D', 'E', 'C', 'F'};
        int length = inorder.length;

        InorderAndPreorder inorderAndPreorder = new InorderAndPreorder();

        Node root = inorderAndPreorder.buildTree(
                inorder, preorder,
                0, length - 1
        );

        System.out.println("Inorder Traversal: ");
        inorderAndPreorder.printInorder(root);
    }
}
