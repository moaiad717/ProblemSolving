package graph.dijkstraAlgo;

public class VertexInfo {
    private Integer vertexId;
    private Integer currentDistance;

    public Integer getVertexId() {
        return vertexId;
    }

    public Integer getDistance() {
        return currentDistance;
    }

    public VertexInfo(Integer vertexId, Integer currentDistance) {
        this.vertexId = vertexId;
        this.currentDistance = currentDistance;
    }
}
