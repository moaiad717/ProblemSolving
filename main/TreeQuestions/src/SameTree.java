import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SameTree {


    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        if (p==null && q==null)
            return true;
        if (p==null || q==null)
            return false;

        queue1.add(p);
        queue2.add(q);
        while (!queue1.isEmpty() && !queue2.isEmpty()){
            TreeNode q1= queue1.poll();
            TreeNode q2= queue2.poll();

            if (q1.val!=q2.val)
                return false;

            if (q1.left!=null && q2.left!=null){
                queue1.add(q1.left);
                queue2.add(q2.left);
            }else if (q1.left==null && q2.left==null){}
            else return false;

            if (q1.right!=null && q2.right!=null){
                queue1.add(q1.right);
                queue2.add(q2.right);
            }else if (q1.right==null && q2.right==null){}
            else return false;
        }
        if (queue1.isEmpty() && queue2.isEmpty())
        return true;

        return false;
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


