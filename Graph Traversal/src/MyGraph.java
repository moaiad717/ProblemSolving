import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyGraph {
    Node node1 = new Node("A");
    Node node2 = new Node("B");
    Node node3 = new Node("C");
    Node node4 = new Node("D");
    Node node5 = new Node("E");
    Node node6 = new Node("F");
    Node node7 = new Node("G");

     void creatNodesRelations() {

        node1.adjacency = Arrays.asList(node2,node3,node4,node7);
        node2.adjacency= Arrays.asList(node5,node6);
        node4.adjacency = Arrays.asList(node7);
    }

     class Node{
        String data;
        List<Node> adjacency= new ArrayList<>();
        boolean visited;
        public Node(String data) {
            this.data = data;
        }
    }
}
