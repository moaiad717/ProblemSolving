/**
 * https://leetcode.com/problems/path-sum/
 */

public class PathSum {
    int tmp=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root!=null&&root.left==null&&root.right==null&& targetSum-root.val==0)
            return true;
        else if(root==null)
            return false;


        return hasPathSum(root.left ,targetSum -root.val) || hasPathSum(root.right,targetSum-root.val);
    }


//    static void printPreOrder(TreeNode node){
//        if (node==null && sum ==)
//            return;
//        System.out.print(node.val+ " ");
//        printPreOrder(node.left);
//        printPreOrder(node.right);
//    }
}



//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
