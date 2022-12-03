import linkedlist.LinkedListImpl;
import static linkedlist.LinkedListImpl.Node;

public class ReverseLinkedList {


    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();
        list.addToHead(new Node("Moaiad1"));
        list.addToTail(new Node("Moaiad2"));
        list.addToTail(new Node("Moaiad3"));
        list.addToTail(new Node("Moaiad4"));

        list.printAll();
        System.out.println("============= After Reverse ============");
        reverseLinkedList(list);
        list.printAll();
    }

    public static void reverseLinkedList(LinkedListImpl list){

        Node curr = list.head;
        Node succeeding = null;
        Node prev = null;

        while (curr!=null){
            // Mark Curr as Head.
            list.head = curr;

            succeeding = curr.next;
            curr.next =prev;
            prev= curr;
            curr = succeeding;
        }
    }

}
