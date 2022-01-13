package adjacency_list;

import java.util.ArrayList;

public class MyGraph {
    
    int vertices;   //denotes the total number of nodes or vertices
    ArrayList< ArrayList< Integer >> adj;

    //constructor
    public MyGraph(int vertices){
        this.vertices = vertices;
        adj = new ArrayList<ArrayList<Integer>>(vertices);//initializing adj
        for( int i = 0; i < vertices; ++i )
            adj.add(new ArrayList<Integer>());
    }
    //we are assuming that graph is unweighted and indirected
    public void addEdge(int v1, int v2 ){
        //adding edge b/w given vertices
        adj.get(v1).add(v2);
        adj.get(v2).add(v1);
    }

    public void printGraph(){
        for( int i = 0; i < vertices; ++i ){
            System.out.print(i+ "->  ");        // here i is denoting to node
            for( int j = 0; j < adj.get(i).size(); ++j )
                System.out.print(adj.get(i).get(j) + " ");  // j is the nodes connected to i
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        MyGraph graph = new MyGraph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printGraph();
    }
}
