package leetCode_easy.linkedlist;

public class RemoveLoop {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(6);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n1;

        removeLoop(n1);
    }

    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head == null || head.next == null) return;

        Node slow  = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            if(fast.next == slow)  {
                fast.next.next=null;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

    }
     static class Node
    {
        public Node(int data) {
            this.data = data;
        }

        int data;
        Node next;
    }
}
