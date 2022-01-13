package adjacency_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
    We are counting the total number of connected graphs 
 */
public class IslandsOfGraphs {

       //BFS traversal when source vertex is given and graph is connected
       static void BFSTraversal(ArrayList< ArrayList<Integer>> graph, int vertex, int vertexCount, boolean[] visited ){
        //  boolean[] visited = new boolean[ vertexCount ];    // initially all values will be false
          Queue<Integer> queue = new LinkedList<Integer>();
          queue.add(vertex);  // vertex is the source node to start traversal
          visited[ vertex ] = true; // after adding to queue node will be considered as visited
          while( !queue.isEmpty() ){
              int visitedVertex = queue.poll();
              for( int v : graph.get(visitedVertex) ){
                  if( visited[ v ] == false ){    // v is the vertex connected to visitedVertex
                      queue.add( v );
                      visited[ v ] = true;
                  }
              }
          }
      }
  
      //BFS traversal when source vertex is not given and graph may be disconnected
      static int countGraphs(ArrayList< ArrayList<Integer>> graph, int vertexCount ){
        int count = 0; 
        boolean[] visited = new boolean[ vertexCount ];
          for( int i = 0; i < vertexCount; ++i ){
              if( visited[i] == false ){
                  ++count;
                  BFSTraversal(graph, i, vertexCount, visited);   // BFS traversal for unvisited vertices
              }
          }
          return count;
      }

      public static void main(String[] args) {
        MyGraph graph = new MyGraph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        //graph.addEdge(4, 5);

        System.out.print("Total Connected Graphs :-> " + countGraphs(graph.getAdj(), 4));
      }
}