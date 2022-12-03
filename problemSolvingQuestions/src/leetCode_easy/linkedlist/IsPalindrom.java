package leetCode_easy.linkedlist;

/**
  https://leetcode.com/problems/palindrome-linked-list/
*/
public class IsPalindrom {
    ListNode top= null;
    public boolean isPalindrome(ListNode head) {
        ListNode curr= head;
        top = head;
        return isPalindromeRec(curr);
    }

    private boolean isPalindromeRec(ListNode curr){
        if (curr!=null){
            boolean state= isPalindromeRec(curr.next);

            if (!state || curr.val!= top.val)
                return false;

            top = top.next;
        }

        return true;
    }


    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
