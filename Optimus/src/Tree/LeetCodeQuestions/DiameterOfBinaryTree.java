package Tree.LeetCodeQuestions;

/*
Link: https://leetcode.com/problems/diameter-of-binary-tree/
 */

public class DiameterOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int longestPath = 0;

    private int calculateHeight(TreeNode currentNode) {
        int height = 0;

        if (currentNode != null) {
            int leftHeight = calculateHeight(currentNode.left);
            int rightHeight = calculateHeight(currentNode.right);

            longestPath = Math.max(longestPath, leftHeight + rightHeight);

            height = Math.max(leftHeight, rightHeight) + 1;
        }

        return height;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);

        return longestPath;
    }
}
