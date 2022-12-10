package linkedList;

/**
 * https://practice.geeksforgeeks.org/problems/remove-every-kth-node/1
 */
public class RemoveEveryKthNode {
    /*You are required to complete this method*/
    Node delete(Node head, int k) {
        int counter = 1;
        Node tempSlow = null;
        Node temp = head;
        if (k == 1)
            return null;

        if (k < 1)
            return head;
        while (temp != null) {

            if (counter < k) {
                tempSlow = temp;
                temp = temp.next;
                counter++;
            } else {
                tempSlow.next = temp.next;
                temp = temp.next;
                counter = 1;
            }
        }

        return head;
    }

    static class Node {
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
