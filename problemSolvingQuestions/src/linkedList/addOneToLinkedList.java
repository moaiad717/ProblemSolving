package linkedList;

/**
 * https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1#
 */
public class addOneToLinkedList {
    Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }

    public static Node addOne(Node head)
    {
        //code here.
        addOneToLinkedList s=new addOneToLinkedList();
        Node head1=s.reverse(head);
        Node prev=null;
        Node curr=head1;
        int carry=1;
        while(head1!=null)
        {
            int sum=head1.data+carry;
            carry=sum/10;
            sum=sum%10;
            head1.data=sum;
            prev=head1;
            head1=head1.next;
        }
        if(carry>0)
        {
            prev.next=new Node(carry);
        }
        Node res=s.reverse(curr);
        return res;
    }

    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
}
