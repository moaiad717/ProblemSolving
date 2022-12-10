package linkedList;

/**
 * https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
 */
public class Sort0and1and2 {
    //Function to sort a linked list of 0s, 1s and 2s.

    static int zeros=0;
    static int ones = 0;
    static int twos= 0;
    static Node segregate(Node head)
    {
        // add your code here


        Node temp = head;

        while (temp!=null){

            switch (temp.data){
                case 0 : ++zeros; break;
                case 1 : ++ones; break;
                case 2 : ++twos; break;

            }

            temp = temp.next;
        }


        temp = head;
        while(temp!=null){
            if(zeros>0){
                temp.data=0;
                --zeros;

            }else if (ones>0){

                temp.data=1;
                --ones;
            }
            else
                temp.data=2;


            temp=temp.next;

        }

        return head;
    }
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
}
