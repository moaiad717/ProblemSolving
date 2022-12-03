package leetCode_easy.tree;


/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if (left > right) {
            return left + 1;
        }
        return right + 1;
    }


    class TreeNode {
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
}
