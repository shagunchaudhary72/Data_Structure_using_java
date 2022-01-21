package adjacency_list;

import java.util.ArrayList;

public class DFS {

    static void DFSTraversal(ArrayList< ArrayList<Integer>> graph, int source, int vertexCount, boolean[] visited ){
        visited[ source ] = true ;
        System.out.print( source + "  ");
        for( int vertex : graph.get(source)){
            if( visited[ vertex ] == false ){
                DFSTraversal(graph, vertex, vertexCount, visited);
            }
        }
    }

    static void DFSTraverse(ArrayList< ArrayList<Integer>> graph, int vertexCount){
        boolean[] visited = new boolean[ vertexCount ];
        for( int i = 0; i < vertexCount; ++i ){//here "i" is the vertex of graph
            if( visited[i] == false ){
                DFSTraversal(graph, i, vertexCount, visited);   // DFS traversal for unvisited vertices
            }
        }
    }

    public static void main(String[] args) {
        MyGraph graph = new MyGraph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 1);

        System.out.print("Vertices in Graph :-> ");
       // BFSTraversal(graph.getAdj(), 0, 4);
       DFSTraverse(graph.getAdj(), 6);
    }
}
