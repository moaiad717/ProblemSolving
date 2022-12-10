package tree;

public class MirrorBinaryTree {

    public static void mirror (Node root){
        if (root==null )
            return;

        mirror(root.left);
        mirror(root.right);

        Node temp = root.left;
        root.left= root.right;
        root.right=temp;

    }

    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

}
