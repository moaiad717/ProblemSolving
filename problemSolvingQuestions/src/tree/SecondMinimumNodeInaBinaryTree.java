package tree;

import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 */

public class SecondMinimumNodeInaBinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> nums = new TreeSet<>();
        dfs(root, nums);
        if (nums.size()<2)
            return -1;
        int count =1;

        for (int num : nums) {
            if (count == 2)
                return num;
            count++;
        }
        return -1;
    }

    private  void dfs (TreeNode treeNode, Set<Integer> nums){
        if (treeNode == null)
            return ;

        nums.add(treeNode.val);
        dfs(treeNode.left, nums);
        dfs(treeNode.right, nums);
    }


    static  class TreeNode {
        int val;
       TreeNode left;
       TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
