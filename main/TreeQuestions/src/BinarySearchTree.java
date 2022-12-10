public class BinarySearchTree {
    Node root;
    public BinarySearchTree(Node root) {
        this.root = root;
    }


    public  Node insertNode (Node head, Node node){
        //if no Root, then  the new node will be our new root
        if (head ==null)
            return node;

        if (node.value > head.value){
            head.left = insertNode(head.left, node);
        }else
            head.right= insertNode(head.right, node);

        return head;
    }

    public Node searchNode(Node head, int value){

        if (head==null)
            return null;

        if (value > head.value){
            searchNode(head.right, value);
        }
        if (value < head.value){
            searchNode(head.left, value);
        }

        return head;
    }
}
class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

}