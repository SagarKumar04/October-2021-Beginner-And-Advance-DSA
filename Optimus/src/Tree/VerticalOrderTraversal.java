package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/*
Link: https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 */

public class VerticalOrderTraversal {
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

    private static void dfs(TreeNode root, int x, int y, TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> nodeMap) {
        if (root == null) {
            return;
        }

        if (!nodeMap.containsKey(x)) {
            nodeMap.put(x, new TreeMap<>());
        }
        if (!nodeMap.get(x).containsKey(y)) {
            nodeMap.get(x).put(y, new ArrayList<>());
        }

        nodeMap.get(x).get(y).add(root.val);

        dfs(root.left, x - 1, y + 1, nodeMap);
        dfs(root.right, x + 1, y + 1, nodeMap);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>> nodeMap = new TreeMap<Integer, TreeMap<Integer, ArrayList<Integer>>>();

        dfs(root, 0, 0, nodeMap);

        List<List<Integer>> outputList = new ArrayList<List<Integer>>();

        for (TreeMap<Integer, ArrayList<Integer>> eachNodeMap : nodeMap.values()) {
            outputList.add(new ArrayList<Integer>());
            for (ArrayList<Integer> nodes : eachNodeMap.values()) {
                Collections.sort(nodes);
                for (Integer nodeValue : nodes) {
                    outputList.get(outputList.size() - 1).add(nodeValue);
                }
            }
        }

        return outputList;
    }
}
