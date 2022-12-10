package tree;

public class PrintNodesInRange {

    public static void printRange(Node root, int min , int high){

        if (root==null){
            return;
        }
        if (min<=root.data){
            printRange(root.left,min,high);
        }
        if (high>=root.data && min <= root.data){
            System.out.println(root.data);
        }
        if (high>root.data){
            printRange(root.right,min,high);
        }
    }
}

 class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}