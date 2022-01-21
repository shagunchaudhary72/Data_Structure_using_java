package adjacency_list;

import java.util.ArrayList;

/*
    Here Decting the presence of cycle in an undirected graph
*/
public class Detect_Cycle {
    
    static boolean DFSTraversal(ArrayList< ArrayList<Integer>> graph, int source, int parentVertex, boolean[] visited ){
        visited[ source ] = true ;
        for( int vertex : graph.get(source)){
            if( visited[ vertex ] == false ){
                DFSTraversal(graph, vertex, source, visited);//"source" is the parent vertex of "vertex"
            }// if current vertex is already visited and current vertex is not the parent vertex than cycle is detected
            else if( vertex != parentVertex ){
                return true;
            }
        }
        return false;
    }

    static boolean DFSTraverse(ArrayList< ArrayList<Integer>> graph, int vertexCount){
        boolean[] visited = new boolean[ vertexCount ];
        for( int i = 0; i < vertexCount; ++i ){//here "i" is the vertex of graph
            if( visited[i] == false ){
               if(DFSTraversal(graph, i, -1, visited) == true )
                    return true;   // DFS traversal for unvisited vertices
            }//here taking the -1 as the parent vertex of current vertex
        }
        return false;
    }

    public static void main(String[] args) {
        MyGraph graph = new MyGraph(6);

        // graph.addEdge(0, 1);
        // graph.addEdge(0, 2);
        // graph.addEdge(1, 2);
        // graph.addEdge(2, 3);
        // graph.addEdge(3, 4);
        // graph.addEdge(4, 5);
        // graph.addEdge(5, 1);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

       System.out.println(" Cycle Detected :  "  + DFSTraverse(graph.getAdj(), 6)) ;
    }
}
