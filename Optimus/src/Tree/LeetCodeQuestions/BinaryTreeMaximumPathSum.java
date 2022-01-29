package Tree.LeetCodeQuestions;

/*
URL: https://leetcode.com/problems/binary-tree-maximum-path-sum/
 */

public class BinaryTreeMaximumPathSum {
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

    int maxValue;

    private int getMaxValue(TreeNode node) {
        int nodeMax = 0;

        if(node != null) {
            int leftMax = Math.max(0, getMaxValue(node.left));
            int rightMax = Math.max(0, getMaxValue(node.right));

            nodeMax = Math.max(leftMax, rightMax) + node.val;

            maxValue = Math.max(maxValue, (leftMax + node.val + rightMax));
        }

        return nodeMax;
    }

    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;

        getMaxValue(root);

        return maxValue;
    }
}
