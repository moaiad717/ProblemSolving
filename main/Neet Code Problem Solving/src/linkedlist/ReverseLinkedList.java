package linkedlist;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (head!=null){
            curr.next=prev;
            prev = curr;
            head=head.next;
        }
        return prev;
    }
}
