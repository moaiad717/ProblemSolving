package linkedList;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/
 */
public class ReverseLinkedListInBetween {
    private ListNode successor = null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1){
            return reverse(head, right);
        }
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }

    private ListNode reverse(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }

        ListNode last = reverse(head.next, n-1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
