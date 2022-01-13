package adjacency_list;

import java.util.ArrayList;

public class BFS{

    //BFS traversal when source node and 
    static void BFSTraversal(ArrayList< ArrayList<Integer>> graph, int vertex ){
        
    }
    
    public static void main(String[] args) {
        MyGraph graph = new MyGraph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        BFSTraversal(graph.getAdj(), 1);

        graph.printGraph();


    }
    
}
