package graph.Traversal;

import graph.Graph;
import graph.GraphAdjacencyMatrixImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    private static int N = 8;

    public static void main(String[] args)
            {
        Graph graph = new GraphAdjacencyMatrixImpl( Graph.GraphType.DIRECTED, N);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 7);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(1, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 3);
        graph.addEdge(3, 4);

        int[] visited = new int[] {0, 0, 0, 0, 0, 0, 0, 0};

        // This for-loop ensures that all nodes are covered even for an unconnected
        // graph.
        for (int i = 0; i < N; i++) {
            breadthFirstTraversal(graph, visited, i);
        }
    }

    public static void breadthFirstTraversal(Graph graph, int[] visited, int currentVertex)
           {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(currentVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();

            if (visited[vertex] == 1) {
                continue;
            }

            System.out.print(vertex + "->");
            visited[vertex] = 1;

            List<Integer> list = graph.getAdjacentVertices(vertex);
            for (int v : list) {
                if (visited[v] != 1) {
                    queue.offer(v);
                }
            }
        }
    }
}
