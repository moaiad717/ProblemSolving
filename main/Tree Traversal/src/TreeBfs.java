import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeBfs {

    /**
     *                6
     *        9                16
     *     11    55         21     166
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(new Node(6));
        binaryTree.root.left = new Node(9);
        binaryTree.root.right = new Node(16);

        binaryTree.root.left.right = new Node(55);
        binaryTree.root.left.left = new Node(11);

        binaryTree.root.right.right = new Node(166);
        binaryTree.root.right.left = new Node(21);

        BFS.traverse(binaryTree);

    }

    static class BFS {
        public static void traverse(BinaryTree tree) {
            printBFS(tree.root);
        }

        static void printBFS(Node node) {
            if (node == null)
                return;

            Queue<Node> nodes = new LinkedList<>();
            List<Node> myValues = new ArrayList<>();
            nodes.add(node);
            while (!nodes.isEmpty()) {
                Node current = nodes.poll();
                if (current != null) {
                    if (current.left != null)
                        nodes.offer(current.left);
                    if (current.right != null)
                        nodes.offer(current.right);

                    myValues.add(current);
                }
            }

            for (Node i : myValues) {
                System.out.print(i.val + " ");
            }
        }

    }

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    static class BinaryTree {
        Node root;

        public BinaryTree(Node root) {
            this.root = root;
        }

    }
}
