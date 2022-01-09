package Tree.Construction;

public class PostorderAndPreorder {
    static int preorderStartIndex;

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

    int search(int postorder[], int start, int end, int key) {
        int position = 0;
        for(int i = start; i <= end; i++) {
            if(postorder[i] == key) {
                position = i;
                break;
            }
        }

        return position;
    }

    Node buildTree(int postorder[], int preorder[],
                   int postorderStartIndex, int postorderEndIndex,
                   int length) {
        if(preorderStartIndex >= length
        || postorderStartIndex > postorderEndIndex) {
            return null;
        }

        Node rootNode = new Node(preorder[preorderStartIndex++]);
        /*
        The incorrect output during the class was because of
        using the wrong array. I was using postorder[] array,
        instead of preorder[]
         */

        if(postorderStartIndex == postorderEndIndex) {
            return rootNode;
        }

        int leftOfRootNode = preorder[preorderStartIndex];
        int postorderIndex =
                search(postorder, postorderStartIndex, postorderEndIndex, leftOfRootNode);

        rootNode.left = buildTree(postorder, preorder,
                postorderStartIndex, postorderIndex,
                length);
        rootNode.right = buildTree(postorder, preorder,
                postorderIndex + 1, postorderEndIndex - 1,
                length);

        return rootNode;
    }

    public static void main(String[] args) {
        PostorderAndPreorder postorderAndPreorder
                = new PostorderAndPreorder();

        int preorder[] = {1, 2, 4, 8, 9, 5, 3, 6, 7};
        int postorder[] = {8, 9, 4, 5, 2, 6, 7, 3, 1};
        int length = postorder.length;

        preorderStartIndex = 0;
        Node rootNode = postorderAndPreorder
                .buildTree(postorder, preorder,
                        0, length - 1,
                        length);

        System.out.println("Inorder: ");
        postorderAndPreorder.printInorder(rootNode);
    }
}
