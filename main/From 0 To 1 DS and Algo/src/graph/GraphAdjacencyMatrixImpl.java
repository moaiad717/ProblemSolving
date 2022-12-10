package graph;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GraphAdjacencyMatrixImpl implements Graph{

    private int [][] adjMatrix;
    GraphType graphType = GraphType.DIRECTED;
    private int numOfVertices;


    public GraphAdjacencyMatrixImpl(GraphType graphType, int numOfVertices) {
        this.graphType = graphType;
        this.numOfVertices = numOfVertices;

        adjMatrix = new int[numOfVertices][numOfVertices];

        //Fill all Cells with 0
        for (int [] rows : adjMatrix){
            for (int i = 0 ; i < rows.length ; i++){
                rows[i] = 0;
            }
        }
    }

    @Override
    public void addEdge(int v1, int v2) {
        if (v1 >= numOfVertices || v1<0 || v2>=numOfVertices || v2<0){
            throw  new IllegalArgumentException("Vertex num invalid");
        }

        adjMatrix[v1][v2] =1;
        //If undirected, add reverse relation.
        if(graphType == GraphType.UNDIRECTED){
            adjMatrix[v2][v1] = 1;
        }

    }

    @Override
    public void addEdge(int v1, int v2, int weight) {
        if (v1 >= numOfVertices || v2 >= numOfVertices || v1 < 0 || v2 < 0) {
            throw new  IllegalArgumentException("Vertex number is not valid");
        }
        adjMatrix[v1][v2] = weight;
        if(graphType == GraphType.UNDIRECTED) {
            adjMatrix[v2][v1] = weight;
        }
    }


    @Override
    public List<Integer> getAdjacentVertices(int v) {
        //Filter the cells that have value 1
        List<Integer> list = Arrays.stream(adjMatrix[v]).filter(e-> e==1).boxed().collect(Collectors.toList());
        return list;
    }

    @Override
    public int getWeightedEdge(int v1, int v2) {
        return adjMatrix[v1][v2];
    }

    public int getIndegree(int v){
        if (v <0 || v >= numOfVertices)
            throw new IllegalArgumentException( "Vertex Id not valid");
        int inDegree = 0;
        for (int i = 0; i < numOfVertices; i++){
            if(adjMatrix[i][v] !=0)
                inDegree++;
        }
        return inDegree;
    }

    public void printAdjList(){
        for (int  i = 0 ; i < adjMatrix.length ; i++){
            for (int j = 0 ; j < adjMatrix.length ; j++){
                System.out.print(adjMatrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    @Override
    public int getNumVertices() {
        return numOfVertices;
    }
}
