package linkedList;

/**
 *
 * https://leetcode.com/problems/reorder-list/
 *
 * https://www.youtube.com/watch?v=S5bfdUTrKLM
 *
 */
public class ReorderList {

    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;

        //Move Slow to the middle of the linked list
        while (fast!=null && fast.next !=null){
            slow = slow.next;
            fast=fast.next.next;
        }

        //Split the list
        ListNode secondList= slow.next;
        slow.next=null;

        //Reverse the second List
        ListNode prev = null;
        while (secondList!=null) {
            ListNode temp= secondList.next;
            secondList.next=prev;
            prev = secondList;
            secondList = temp;

        }

        //Merge The Two Lists.
        ListNode firstHead= head;
        ListNode secondHead = prev;

        while (secondHead !=null){
            ListNode secondNextTemp= secondHead.next;
            ListNode firstNextTemp= firstHead.next;

            firstHead.next = secondHead;
            secondHead.next = firstNextTemp;

            firstHead = firstNextTemp;
            secondHead = secondNextTemp;
        }

    }
}
