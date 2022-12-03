public class DFS {

    public static void main(String[] args) {

        MyGraph myGraph = new MyGraph();
        myGraph.creatNodesRelations();

        DFS.traverse(myGraph);
    }

    static void traverse(MyGraph graph){
        MyGraph.Node mySelectedNode= graph.node1;
        printDFS(mySelectedNode);
    }

    private static void printDFS(MyGraph.Node mySelectedNode) {
        if (mySelectedNode == null)
            return;
        if (mySelectedNode.visited==false){
        System.out.print(mySelectedNode.data+ " ");
        mySelectedNode.visited=true;

        for (MyGraph.Node node:mySelectedNode.adjacency){
            if (node.visited==false){
                printDFS(node);
            }
        }
        }
    }


}
