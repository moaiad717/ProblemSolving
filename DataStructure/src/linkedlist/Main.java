package linkedlist;

import linkedlist.LinkedListImpl;

import java.util.LinkedList;
import java.util.List;

import  static  linkedlist.LinkedListImpl.Node;

public class Main {
    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();
        list.addToHead(new Node("Moaiad"));
        list.addToHead(new Node("Oday"));
        list.addToHead(new Node("Khawla"));
        list.addToHead(new Node("Bobo"));
        // Add To Tail Test
        list.addToTail(new LinkedListImpl.Node("Tail Node"));

        System.out.println("------------- printAll() : ");
        // Print All
        list.printAll();

        // Get Node By Index Test
        System.out.println("------------- printAllReverse() : ");
        list.printAllReverse();

        System.out.println("------------- get(int idx) : ");
        Node nodeByIndex = list.get(0);
        System.out.println(nodeByIndex.val);

        System.out.println("------------- addToIndex(Node node, int idx) : ");
        list.addToIndex(new Node("Node at index 1"),1 );
        list.addToIndex(new Node("Node at index 5"),5 );
        list.printAll();

        System.out.println("------------- deleteAtIndex(int idx) : ");
        list.deleteAtIndex(1 );
        list.deleteAtIndex(5 );
        list.printAll();



        LinkedListImpl list2 = new LinkedListImpl();
        list2.addToHead(new Node("HeadNode"));
        list2.addToTail(new Node("Node2"));

        System.out.println("------------- deleteHead() : ");
        list2.deleteHead();
        list2.printAll();
        System.out.println("------------- deleteHead() : ");
        list2.deleteHead();
        list2.printAll();


        list2.addToHead(new Node("HeadNode"));
        list2.addToTail(new Node("Node2"));
        System.out.println("------------- deleteTail() : ");
        list2.deleteTail();
        list2.printAll();
        System.out.println("------------- deleteTail() : ");
        list2.deleteTail();
        list2.printAll();


    }
}
