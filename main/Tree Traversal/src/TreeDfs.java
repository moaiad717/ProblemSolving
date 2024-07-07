import java.util.PriorityQueue;

public class TreeDfs {

    /**
     *                6
     *        9                16     
     *     11    55         21     166
     *              48
     *          
     * @param args
     */
    
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(new Node(6));
        binaryTree.root.left = new Node(9);
        binaryTree.root.right = new Node(16);

        binaryTree.root.left.right = new Node(55);
        binaryTree.root.left.right.right = new Node(48);
        binaryTree.root.left.left = new Node(11);
        
        binaryTree.root.right.right = new Node(166);
        binaryTree.root.right.left = new Node(21);

        // Traverse DFS PreOrder
        System.out.println("Pre Order");
        DFS.traversePreOrder(binaryTree);
        System.out.println();

        // Traverse DFS In-Order
        System.out.println("In Order");

        DFS.traverseInOrder(binaryTree);
        System.out.println();

        // Traverse DFS Post-Order
        System.out.println("Post Order");
        DFS.traversePostOrder(binaryTree);
    }

    static class DFS{

        /*
           DFS Pre Order Implementation
           Root -> Left -> Right
         */
        public static void traversePreOrder (BinaryTree tree){
            printPreOrder(tree.root);
        }

        static void printPreOrder(Node node){
            if (node==null)
                return;
            System.out.print(node.val+ " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }


        /*
            DFS in-Order Implementation.
            Left -> Root -> Right
        */
        public static void traverseInOrder (BinaryTree tree){
            printInOrder(tree.root);
        }
        static void printInOrder(Node node){
            if (node==null){
                return;
            }
            printInOrder(node.left);
            System.out.print(node.val+" ");
            printInOrder(node.right);
        }


        /*
            DFS Post Order Implementation.
            Left -> Right -> Root

         */
        public static void traversePostOrder (BinaryTree tree){
            printPostOrder(tree.root);
        }
        static void printPostOrder(Node node){

            if (node==null){
                return;
            }
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.val+" ");

        }
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
