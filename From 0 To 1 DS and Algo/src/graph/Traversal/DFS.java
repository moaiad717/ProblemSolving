package graph.Traversal;

import graph.Graph;

import java.util.List;

public class DFS {
    public static void dfsTraversal( Graph graph , int [] visited, int currentVertex){

        if(visited [currentVertex] ==1){
            return;
        }
        List<Integer> adjList= graph.getAdjacentVertices(currentVertex);

        for (int vertex: adjList){
            dfsTraversal(graph, visited, vertex);
        }

        System.out.println(currentVertex + "--> ");
    }
}
