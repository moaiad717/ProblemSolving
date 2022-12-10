import java.util.Stack;

/**
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 */
public class ConstructBinarySearchTreeFromPreorder {

    public TreeNode buildBSTFromPreorder(int[] preOrder){

        Stack<TreeNode> nodesStack = new Stack<>();
        TreeNode root= new TreeNode(preOrder[0]);
        nodesStack.push(root);
        for (int i=1; i<preOrder.length; i++){
            if (preOrder[i] < nodesStack.peek().val){
                TreeNode node = new TreeNode(preOrder[i]);
                nodesStack.peek().left = node;
                nodesStack.push(node);
            }
            else{
                TreeNode pop=null;
                while (!nodesStack.isEmpty() && preOrder[i]> nodesStack.peek().val){
                    pop= nodesStack.pop();
                }
                TreeNode node = new TreeNode(preOrder[i]);
                pop.right = node;
                nodesStack.push(node);
        }}

        return root;
    }

    class TreeNode {
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
