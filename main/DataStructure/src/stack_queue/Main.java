package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // LIFO (Last in first out)
        /**
         *  Using Arrays to build it.
         * Delete O(1)
         * Add    O(1)
         * Access O(1)
         */
        Stack list = new Stack();
        list.push("Moaiad");
        list.push("day");
        list.push("khawla");

        while (!list.isEmpty()) {
            System.out.println(list.pop());
        }


        // FIFO (First in first out)
        /**
         *  Using LinkedList to build it.
         * Delete O(1)
         * Add    O(1)
         * Access O(1)
         */
        Queue list2 = new LinkedList();
        list2.add("Moaiad");
        list2.add("day");
        list2.add("khawla");

        while (!list2.isEmpty()) {
            System.out.println(list2.poll());
        }

    }
}
