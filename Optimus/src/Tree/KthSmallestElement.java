package Tree;

/*
Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 */

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
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

    static List<Integer> inorderTraversalList;
    private static void inorderTraversal(TreeNode root) {
        if(root != null) {
            inorderTraversal(root.left);
            inorderTraversalList.add(root.val);
            inorderTraversal(root.right);
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        inorderTraversalList = new ArrayList<Integer>();
        inorderTraversal(root);
        int kthSmallestElement = inorderTraversalList.get(k - 1);

        return kthSmallestElement;
    }
}
