package Tree.LeetCodeQuestions;

public class LowestCommonAncestor {
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode resultNode;

        if (root == null) {
            //resultNode = null;
            return null;
        } else if (root.val == p.val || root.val == q.val) {
            //resultNode = root;
            return root;
        } else {
            TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
            TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

            if (leftNode != null && rightNode != null) {
                //resultNode = root;
                return root;
            } else if (leftNode == null && rightNode == null) {
                //resultNode = null;
                return null;
            } else {
                if (leftNode == null) {
                    //resultNode = rightNode;
                    return rightNode;
                } else {
                    //resultNode = leftNode;
                    return leftNode;
                }
            }
        }

        //return resultNode;
    }
}
