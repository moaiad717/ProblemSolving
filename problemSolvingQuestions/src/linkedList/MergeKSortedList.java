package linkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        Node head = null, last = null;

        // priority_queue 'pq' implemeted
        // as min heap with the
        // help of 'compare' function
        PriorityQueue<Node> pq =
                new PriorityQueue<>(new Comparator<Node>()
                {
                    public int compare(Node a, Node b)
                    {
                        return a.data - b.data;
                    }
                });


        for (Node node : arr){
            pq.add(node);
        }


        while (!pq.isEmpty()){

            Node temp = pq.peek();

            pq.remove();

            if (temp.next!=null){
                pq.add(temp.next);
            }

            if (head == null){
                head = temp;
                last = head;
            }

            else {
                last.next = temp;
                last= temp;

            }

        }

        return head;
    }

    static class Node
    {
        int data;
        Node next;

        Node(int key)
        {
            data = key;
            next = null;
        }
    }
}
