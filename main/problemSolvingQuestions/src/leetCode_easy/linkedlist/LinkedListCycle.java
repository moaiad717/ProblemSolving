package leetCode_easy.linkedlist;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/773/
 */
public class LinkedListCycle {


    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(-4);
//        listNode.next.next.next.next = listNode;

        System.out.println(hasCycle(listNode));
    }


    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode slow, fast;
        slow = head;
        fast = head.next;

        while(fast != null && fast.next != null){
            if(slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;

    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}

