package Tree.LeetCodeQuestions;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/*
URL: https://leetcode.com/problems/maximum-width-of-binary-tree/
 */

public class MaximumWidthOfABinaryTree {
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

    public int widthOfBinaryTree(TreeNode root) {
        int width = 0;

        Map<TreeNode, Integer> nodeMap = new HashMap<>();
        nodeMap.put(root, 0);
        ArrayDeque<Map<TreeNode, Integer>> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(nodeMap);

        while(!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            int currentWidth
                    = (Integer)nodeQueue.getLast().values().toArray()[0] - (Integer)nodeQueue.getFirst().values().toArray()[0] + 1;

            width = Math.max(width, currentWidth);

            for(int i = 0; i < size; i++) {
                Map<TreeNode, Integer> firstElement = nodeQueue.poll();
                TreeNode key = (TreeNode)firstElement.keySet().toArray()[0];
                Integer value = (Integer)firstElement.values().toArray()[0];

                if(key.left != null) {
                    Map<TreeNode, Integer> leftChild = new HashMap<>();
                    leftChild.put(key.left, 2 * value + 1);
                    nodeQueue.add(leftChild);
                }

                if(key.right != null) {
                    Map<TreeNode, Integer> rightChild = new HashMap<>();
                    rightChild.put(key.right, 2 * value + 2);
                    nodeQueue.add(rightChild);
                }
            }
        }

        return width;
    }
}
