
/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class SwapNodesinPairs {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);

        l.next=l1;
        l1.next=l2;
        l2.next=l3;

        swapPairs(l);

        while (l!=null){
            System.out.println(l.val);
            l=l.next;
        }
    }
    public static ListNode swapPairs(ListNode head) {
        if (head != null && head.next==null){
            return head;
        }
        if (head == null || head.next==null){
            return null;
        }

        ListNode current;
        ListNode next;
//        if (head == null || next ==null){
//            return null;
//        }
        current = head.next;
        next = head;
        next.next = swapPairs(head.next.next);
        current.next=next;
        return current;

    }
    private static class ListNode {
        int val;
        public ListNode setNext(ListNode next) {
            this.next = next;
            return next;
        }

        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
