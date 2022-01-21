package adjacency_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS{

    //BFS traversal when source vertex is given and graph is connected
    static void BFSTraversal(ArrayList< ArrayList<Integer>> graph, int vertex, int vertexCount, boolean[] visited ){
      //  boolean[] visited = new boolean[ vertexCount ];    // initially all values will be false
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(vertex);  // vertex is the source node to start traversal
        visited[ vertex ] = true; // after adding to queue node will be considered as visited
        while( !queue.isEmpty() ){
            int visitedVertex = queue.poll();
            System.out.print(visitedVertex + " ");    // printing visited vertex
            for( int v : graph.get(visitedVertex) ){
                if( visited[ v ] == false ){    // v is the vertex connected to visitedVertex
                    queue.add( v );
                    visited[ v ] = true;
                }
            }
        }
    }

    //BFS traversal when source vertex is not given and graph may be disconnected
    static void BFSTraverse(ArrayList< ArrayList<Integer>> graph, int vertexCount ){
       boolean[] visited = new boolean[ vertexCount ];
        for( int i = 0; i < vertexCount; ++i ){
            if( visited[i] == false ){
                BFSTraversal(graph, i, vertexCount, visited);   // BFS traversal for unvisited vertices
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
       BFSTraverse(graph.getAdj(), 6);
    }
    
}
