package linkedList;

/**
 * https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1#
 */
public class MergeTwoSortedLinkedLists {

    //Function to merge two sorted linked list.
    static Node sortedMerge(Node head1, Node head2) {
        // This is a "method-only" submission.
        // You only need to complete this method
        // This is a "method-only" submission.
        // You only need to complete this method

        // You only need to complete this method


        Node temp1 = head1;
        Node temp1Slow = null;
        Node temp2 = head2;

        while (temp2 != null && temp1 != null) {

            int val1 = temp1.data;
            int val2 = temp2.data;

            if (val2 <= val1) {
                Node curr = new Node(val2);
                if (temp1Slow != null) {
                    // if (temp1Slow.data<val2){
                    //     Node tempNode =temp1;
                    //     tempNode.next=temp1.next;
                    //     temp1.data=temp2.data;
                    // }
                    // else {
                    Node temp = temp1;
                    temp1Slow.next = curr;
                    curr.next = temp;
                    temp1Slow = temp1Slow.next;
                    temp1 = temp;
                    // }
                    temp2 = temp2.next;

                } else if (temp1Slow == null) {
                    curr.next = temp1;
                    head1 = curr;
                    temp2 = temp2.next;

                    if (temp1Slow == null)
                        temp1 = head1;
                }
            } else {
                temp1Slow = temp1;
                temp1 = temp1.next;

            }
        }
        if (temp2 != null) {
            while (temp2 != null) {
                temp1Slow.next = temp2;
                temp1Slow = temp2;
                temp2 = temp2.next;
            }
        }

        return head1;
    }


    /**
     *  Main Method
     * @param args
     */
    public static void main(String[] args) {
//
//        Node l1 = new Node(5);
//        Node l2 = new Node(10);
//        Node l3 = new Node(15);
//        Node l4 = new Node(40);
//
//
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//
//        Node s1 = new Node(2);
//        Node s2 = new Node(3);
//        Node s3 = new Node(20);
//        s1.next=s2;
//        s2.next=s3;


        Node l1 = new Node(5);
        Node l2 = new Node(24);
        Node l3 = new Node(45);
        Node l4 = new Node(58);
        Node l5 = new Node(62);
        Node l6 = new Node(64);
        Node l7 = new Node(6);
        Node l8 = new Node(40);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;

        Node s1 = new Node(0);
        Node s2 = new Node(34);
        s1.next = s2;


        Node res = sortedMerge(s1, l1);

        while (res != null) {
            System.out.print(res.data + " - ");
            res = res.next;
        }
    }


    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
