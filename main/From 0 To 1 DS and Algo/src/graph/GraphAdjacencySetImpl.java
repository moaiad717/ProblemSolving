package graph;

import java.util.*;
import java.util.stream.Collectors;

public class GraphAdjacencySetImpl implements Graph{
    List<Node> vertices ;
    GraphType graphType;

    public GraphAdjacencySetImpl(GraphType graphType) {
        this.vertices = new LinkedList<>();
        this.graphType = graphType;
    }

    public void addNode(int v1) {
        Node node = vertices.get(v1);
        if (node!=null){
            throw new IllegalArgumentException("Node Already exist");
        }
        else
            vertices.add(new Node(v1));
    }

    @Override
    public void addEdge(int v1, int v2, int weight) {
        throw new IllegalArgumentException("Weight not implemented in Adjacency Set");
    }
    @Override
    public int getWeightedEdge(int v1, int v2) {
        throw new IllegalArgumentException("Weight not implemented in Adjacency Set");
    }

    @Override
    public void addEdge(int v1, int v2) {
        Node nodeV1 = vertices.get(v1);
        Node nodeV2 = vertices.get(v2);
        if (nodeV1!=null && nodeV2!=null){
            nodeV1.addEdge(nodeV2);
            if (graphType==GraphType.UNDIRECTED)
                nodeV2.addEdge(nodeV1);
        }
        else
            throw new IllegalArgumentException("invalid Nodes !");
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        return vertices.get(v).getAdjacencyList().stream().map( e-> e.vertexId).collect(Collectors.toList());
    }

    @Override
    public void printAdjList() {

    }

    @Override
    public int getNumVertices() {
        return vertices.size();
    }

    public int getIndegree(int v){
        if (v <0 || v >= vertices.size())
            throw new IllegalArgumentException( "Vertex Id not valid");
        int inDegree = 0;

        for (Node node : vertices){
            if(getAdjacentVertices(node.vertexId).contains(v))
                inDegree++;
        }
        return inDegree;
    }


    class Node{
        int vertexId;
        Set<Node> adjacencyList = new HashSet<>();

        public Node(int vertexId) {
            this.vertexId = vertexId;
        }

        public int getVertexId(){
            return this.vertexId;
        }

        public void addEdge(Node node){
            adjacencyList.add(node);
        }

        public Set<Node> getAdjacencyList() {
            return adjacencyList;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return vertexId == node.vertexId && (adjacencyList.size() == node.adjacencyList.size());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vertexId+ adjacencyList.size());
        }
    }
}
