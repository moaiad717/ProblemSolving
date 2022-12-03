package tree;

public class MinValue {

    public static int minValue (TreeNode root){
        // if no root, return MIN Int
        if (root == null){
            return Integer.MIN_VALUE;
        }

        //if no left, then the node has min value
        if (root.left == null)
            return root.val;

        return minValue(root.left);

    }


    static  class TreeNode {
        int val;
     TreeNode left;
     TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
