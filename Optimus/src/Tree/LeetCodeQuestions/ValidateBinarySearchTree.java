package Tree.LeetCodeQuestions;

/*
URL: https://leetcode.com/problems/validate-binary-search-tree/
 */

public class ValidateBinarySearchTree {
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
    
    private boolean check(TreeNode node, Integer min, Integer max) {
        boolean leftStatus = true;
        boolean rightStatus = true;

        if(node != null) {
            if(min != null && node.val <= min) {
                leftStatus = false;
            }

            if(max != null && node.val >= max) {
                rightStatus = false;
            }

            if(leftStatus && rightStatus) {
                leftStatus = check(node.left, min, node.val);
                rightStatus = check(node.right, node.val, max);
            }
        }

        return (leftStatus && rightStatus);
    }

    public boolean isValidBST(TreeNode root) {
        boolean result = check(root, null, null);

        return result;
    }
}
