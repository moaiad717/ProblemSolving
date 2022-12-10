import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {


    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph();
        myGraph.creatNodesRelations();
        traverse(myGraph);
    }

    static void traverse(MyGraph graph){
        MyGraph.Node mySelectedRoot = graph.node1;
        printBFS(mySelectedRoot);
    }

    private static void printBFS(MyGraph.Node mySelectedRoot) {
        Queue<MyGraph.Node> nodes = new LinkedList<>();
        List<MyGraph.Node> traversed = new ArrayList<>();
        nodes.add(mySelectedRoot);
        while (!nodes.isEmpty()) {
            MyGraph.Node current = nodes.poll();
            if (current.visited == false) {
                traversed.add(current);
                current.visited = true;
                for (MyGraph.Node node : current.adjacency) {
                    if (node.visited ==false)
                      nodes.add(node);
                }
            }
        }

        for (MyGraph.Node node : traversed) {
            System.out.print(node.data + " ");
        }
    }

}
