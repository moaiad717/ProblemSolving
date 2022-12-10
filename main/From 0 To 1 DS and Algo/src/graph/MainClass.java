package graph;

public class MainClass {
    public static void main(String[] args) {

        /**
         *   GraphAdjacencyMatrixImpl Sample
         */
        Graph g = new GraphAdjacencyMatrixImpl(Graph.GraphType.DIRECTED,5);
        g.printAdjList();
        g.addEdge(4,2);
        System.out.println("------- Adding edge from 4 to 2");
        g.printAdjList();
        /**
         * End of GraphAdjacencyMatrixImpl Sample
         */
    }
}
