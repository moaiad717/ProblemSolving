package tree;

public class CousinsInBinaryTree {

    int xDepth;
    int yDepth;
    TreeNode xParent;
    TreeNode yParent;
    int foundCount=2;
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root==null){
            return false;
        }

        if (foundCount==0 && xDepth==yDepth&&xParent!= yParent)
            return true;

        return false;
    }

    private void isFoundUtil(TreeNode node, int x, int y, TreeNode parent, int depth){
        if (node == null)
            return;
        if (foundCount ==0)
            return;

        if (node.val == x ){
            xDepth =depth;
            xParent = parent;
            foundCount--;
        }

        if (node.val == y ){
            yDepth =depth;
            yParent = parent;
            foundCount--;
        }

        isFoundUtil(node.left,x,y,node,depth+1);
        isFoundUtil(node.right,x,y,node,depth+1);
    }
    static public class TreeNode {
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
