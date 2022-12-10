package tree;
/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */

public class ConvertSortedArraytoBinarySearchTree {
    public static void main(String[] args) {
        sortedArrayToBST(new int[]{0,1,2,3,4,5});
    }


    public static TreeNode sortedArrayToBST(int[] nums) {
        return makeTree(nums, 0,nums.length-1);
    }
    public static TreeNode makeTree(int []nums,int lo, int hi){

        // just keep making the middle element the rootnode of each subtree
        if(hi<lo)
            return null;

        int mid= (hi - lo)/2 + lo  ;

        TreeNode n= new TreeNode(nums[mid]);

        n.left= makeTree(nums,lo,mid-1);
        n.right= makeTree(nums,mid+1,hi);

        return n;
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



