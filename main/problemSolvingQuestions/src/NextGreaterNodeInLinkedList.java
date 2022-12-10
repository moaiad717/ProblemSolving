import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/next-greater-node-in-linked-list/submissions/
 */

public class NextGreaterNodeInLinkedList {

    public static void main(String[] args) {
        ListNode l = new ListNode(2);
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(5);

        l.next=l1;
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;

        for (int re :nextLargerNodes(l)){
            System.out.println(re);
        }
    }
    static List<Integer> list = new ArrayList<>();
     public  static int[] nextLargerNodes(ListNode head) {
         int size = 0;
         ListNode l = head;
         while (l !=null){
             size++;
            l=l.next;
        }
         int [] res = new int[size];

         return helper(head,res,0);
     }
     private static int [] helper(ListNode head , int []  res, int i){

         if (head == null)
             return null;

         ListNode node = head.next;
         int curVal= head.val;
         int max = 0;
         while (node!=null){
             if (node.val > curVal){
                 curVal= node.val;
                 break;
             }
             node=node.next;
         }
         max= curVal > head.val? curVal : 0;
         res[i] = max;
         helper(head.next,res,++i);
         return res;
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
