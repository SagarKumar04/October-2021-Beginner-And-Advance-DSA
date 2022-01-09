package Tree.Construction;

public class InorderAndPostorder {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    void printInorder(Node rootNode) {
        if(rootNode == null) {
            return;
        }
        printInorder(rootNode.left);
        System.out.print(rootNode.data + " ");
        printInorder(rootNode.right);
    }

    int search(int inorder[], int start, int end, int key) {
        int position = 0;
        for(int i = start; i <= end; i++) {
            if(inorder[i] == key) {
                position = i;
                break;
            }
        }

        return position;
    }

    Node buildTree(int inorder[], int postorder[],
                   int inorderStartIndex, int inorderEndIndex,
                   int postorderStartIndex, int postorderEndIndex) {
        if(inorderStartIndex > inorderEndIndex) {
            return null;
        }

        Node rootNode = new Node(postorder[postorderEndIndex]);

        if(inorderStartIndex == inorderEndIndex) {
            return rootNode;
        }

        int inorderIndex = search(inorder, inorderStartIndex,
                inorderEndIndex, rootNode.data);

        rootNode.left = buildTree(inorder, postorder,
                inorderStartIndex, inorderIndex - 1,
                postorderStartIndex, postorderStartIndex - inorderStartIndex + inorderIndex - 1);
        /*
        Explanation of postorderEndIndex calculation for left subtree:
        size(leftSubtree) = leftSize = inorderIndex - inorderStartIndex

        => postorderEndIndex = postorderStartIndex + leftSize - 1
        => postorderEndIndex = postorderStartIndex + (inorderIndex - inorderStartIndex) - 1
        => postorderEndIndex = postorderStartIndex - inorderStartIndex + inorderIndex - 1
         */

        rootNode.right = buildTree(inorder, postorder,
                inorderIndex + 1, inorderEndIndex,
                postorderEndIndex - inorderEndIndex + inorderIndex, postorderEndIndex - 1);
        /*
        Explanation of postorderStartIndex calculation for right subtree:
        size(rightSubtree) = rightSize = inorderEndIndex - inorderIndex

        => postorderStartIndex = postorderEndIndex - rightSize
        => postorderStartIndex = postorderEndIndex - (inorderEndIndex - inorderIndex)
        => postorderStartIndex = postorderEndIndex - inorderEndIndex + inorderIndex
         */

        return rootNode;
    }
    public static void main(String[] args) {
        InorderAndPostorder inorderAndPostorder =
                new InorderAndPostorder();

        int inorder[] = {4, 8, 2, 5, 1, 6, 3, 7};
        int postorder[] = {8, 4, 5, 2, 6, 7, 3, 1};
        int length = inorder.length;

        Node rootNode = inorderAndPostorder.buildTree(
                inorder, postorder,
                0, length - 1,
                0, length - 1
        );

        System.out.println("Inorder: ");
        inorderAndPostorder.printInorder(rootNode);
    }
}
