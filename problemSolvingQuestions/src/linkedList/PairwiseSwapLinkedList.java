package linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class PairwiseSwapLinkedList {

    public static void main(String[] args) {

        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(2);
        Node l4 = new Node(4);
        Node l5 = new Node(5);
        Node l6 = new Node(6);
        Node l7 = new Node(7);
        Node l8 = new Node(8);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;

        PairwiseSwapLinkedList p = new PairwiseSwapLinkedList();
            Node n = p.pairwiseSwap(l1);

            while (n!=null){
                System.out.print(n.data + " - " );
                n=n.next;
            }
    }

    //Swap Values Approach :
//    public Node pairwiseSwap(Node head)
//    {
//        // code here
//
//        if (head == null )
//            return null;
//
//        Node first = head;
//
//        while (first !=null && first.next !=null){
//            Node second= first.next;
//
//            int firstVal = first.data;
//            int secVal = second.data;
//
//
//            first.data= secVal;
//            second.data=firstVal;
//
//            first=second.next;
//
//        }
//
//        return head;
//    }


    /**
     *
     ************************************************8
     */

//Swap Nodes Not 100% working
    public Node pairwiseSwap(Node head)
    {

        // code here

        if (head == null )
            return null;

        Node first = head;
        Node slow=null;

        while (first !=null && first.next !=null){
            Node second= first.next;

            if (slow ==null){
                Node temp = first;
                Node secNext= second.next;
                first=second;
                second.next=temp;
                temp.next=secNext;
                head=first;

                slow=first.next;
                first=secNext;
            }
            else {
//               Node slowNext=  slow.next;
                Node secNext= second.next;
                slow.next=second;
                second.next=first;
                first.next=secNext;

                first=secNext;
                if (first !=null)
                    slow=first.next;

            }
        }

        return head;
    }
    
    static class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
}
