public class ConstructBinaryTree {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(new Node(6));
        binaryTree.root.left = new Node(9);
        binaryTree.root.right = new Node(16);

        binaryTree.root.left.right = new Node(55);
        binaryTree.root.left.left = new Node(11);

        binaryTree.root.right.right = new Node(166);
        binaryTree.root.right.left = new Node(21);
    }



    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    static class BinaryTree{
        Node root;
        public BinaryTree(Node root) {
            this.root = root;
        }

    }

}
