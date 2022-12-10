package linkedlist;

import java.util.Stack;

public class LinkedListImpl {
   public Node head;
    public Node tail;
    public int size;

    public LinkedListImpl() {
    }

    public Node get(int idx){
        if (idx<0 || idx> this.size)
            return null;

        int count =0;
        Node pointer = head;
        while (count < idx){
            pointer=pointer.next;
            count++;
        }
        return pointer;
    }

    public void addToHead (Node node){
        if (head==null) {
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head.prev = node;
            head = node;

        }
        size++;
    }

    public void addToTail (Node node){
        if (head==null) {
            head = node;
            tail = node;
        }
        else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addToIndex (Node node, int idx){
        if (idx< 0 || idx> size){
            throw new IndexOutOfBoundsException();
        }
        if (idx ==0){
            addToHead(node);
        }
        else if (idx == size){
            addToTail(node);
        }
        else{
            Node pointer = head;
            int counter =0;
            while (counter<idx){
                pointer = pointer.next;
                counter++;
            }
            node.next =pointer;
            node.prev = pointer.prev;
            pointer.prev.next= node;
            pointer.prev = node;
            size++;
        }
    }

    public void deleteAtIndex(int idx){
        if (idx<0 || idx> size-1){
            throw new IndexOutOfBoundsException();
        }
        if (idx==0)
            deleteHead();
        else if (idx==size-1)
            deleteTail();
        else{
            int count =0;
            Node pointer= head;
            while (count< idx){
                pointer= pointer.next;
                count++;
            }
            pointer.prev.next=pointer.next;
            pointer.next.prev=pointer.prev;
            size--;
            pointer=null;
        }
    }

    public void deleteHead(){
        if (size==1){
            head =null;
            tail= null;
            size--;
        }
        else if (head !=null){
            head = head.next;
            head.prev=null;
            size--;
        }
    }
    public void deleteTail(){
        if (size==1){
            head =null;
            tail= null;
            size--;
        }
        else if (tail !=null){
            tail = tail.prev;
            tail.next=null;
            size --;
        }
    }



    public void printAll(){
        Node pointer= head;
        while (pointer !=null){
            System.out.println(pointer.val);
            pointer=pointer.next;
        }
    }

    public void printAllReverse(){
        Node pointer= tail;
        while (pointer !=null){
            System.out.println(pointer.val);
            pointer=pointer.prev;
        }
    }
    public static class Node{
        public Node(String val) {
            this.val = val;
        }

        public String val;
        public Node next;
        public Node prev;
    }

}



