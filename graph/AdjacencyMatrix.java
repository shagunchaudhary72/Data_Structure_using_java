
//here we are creating matrix for undirected and unweighted graph
class AdjacencyMatrix{
    
    int vertexCount;
    int[][] matrix;
    
    AdjacencyMatrix(int vertexCount){
        this.vertexCount = vertexCount;
        matrix = new int[vertexCount][vertexCount];//initializing to square matrix
    }

    //adding new edge in the matrix between two nodes or vertices
    public void addEdge(int v1, int v2){
        matrix[v1-1][v2-1] = 1;     //doing v-1 instead of v1 because here indexing starting from 0;
        matrix[v2-1][v1-1] = 1;
    }

    //remove edge
    public boolean removeEdge(int v1, int v2){
        if( matrix[v1-1][v2-1] == 1 && matrix[v2-1][v1-1] == 1){
            matrix[v1-1][v2-1] = 0;
            matrix[v2-1][v1-1] = 0;
            return true;
        }
        return false;
    }

    //print graph in matrix form
    public void printGraph(){
        System.out.println("Adjacency Matrix :->");
        System.out.print("   ");
        for(int i = 0; i < vertexCount; ++i ){
            System.out.print((i+1) + " ");
        }
        System.out.println();
        for(int i = 0; i < vertexCount; ++i ){
            System.out.print((i+1) + "  ");
            for(int j = 0; j < vertexCount; ++j )
                System.out.print(matrix[i][j] + " ");
                System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(4);
        
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.printGraph();
        graph.removeEdge(1, 4);
        graph.printGraph();
    }
}