package Tree.LeetCodeQuestions;

/*
URL: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */

public class FlattenBinaryTreeToLinkedList {
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

    private TreeNode previous = null;

    public void flatten(TreeNode root) {
        if(root != null) {
            flatten(root.right);
            flatten(root.left);

            root.right = previous;
            root.left = null;
            previous = root;
        }
    }
}
