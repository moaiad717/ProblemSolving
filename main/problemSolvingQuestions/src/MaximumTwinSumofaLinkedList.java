import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
 */

public class MaximumTwinSumofaLinkedList {

    public int pairSum(ListNode head) {
        Stack<ListNode> l = new Stack<>();
        ListNode curr = head;
        int count =0;
        while (curr!=null){
            l.push(curr);
            count++;
            curr=curr.next;
        }

        int max = 0;
        count/=2;
        curr=head;
        while (count>0 && curr!=null){
            int val = curr.val + l.pop().val;
            if (val>max){
                max=val;
            }
            curr=curr.next;
        }


        return max;
    }




    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
