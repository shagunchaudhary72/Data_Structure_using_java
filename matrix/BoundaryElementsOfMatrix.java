public class BoundaryElementsOfMatrix {

    static void originalMatrix(int[][] arr){
        System.out.println("Original Matrix  ->");
        for(int row=0; row < arr.length; ++row){
            for( int column = 0; column < arr[row].length; ++column ){
                System.out.print(" " + arr[row][column] );
            }
            System.out.println();
        }
    }

    static void boundaryElements(int[][] arr){
        int row = arr.length;
        int column = arr[0].length;
        System.out.print("Boundary Elements :-> ");
        //if matrix have only one row
        if( row == 1){
            for(int c = 0; c < arr[0].length; ++c )
                System.out.print(" " + arr[0][c]);
        }
        //if matrix have only one column per row
        else if( column == 1){
            for(int r = 0; r < row; ++r )
                System.out.print(" " + arr[r][0]);
        }
        //if matrix have more than one rows and column
        else{
            //for first row elements
            for(int c = 0; c < arr[0].length; ++c )
                System.out.print(" " + arr[0][c]);
            //for last column elements of middle rows 
            for(int r = 1; r < row-1; ++r )
                System.out.print(" " + arr[r][arr[r].length-1]);
            //for last row elements
            for(int c = arr[row-1].length-1; c >= 0; --c )
                System.out.print(" " + arr[row-1][c] );
            //for first column elements of middle rows
            for(int r = row-2; r > 0; --r )
                System.out.print(" " + arr[r][0] );
        }
    }

    public static void main(String[] args) {
       // int[][] matrix = {{1, 2, 3, 4},{5, 6, 7 , 8},{9, 10, 11, 12}}; //output should be:- 1 2 3 4 8 12 11 10 9 5
        //int[][] matrix = {{1, 2, 3, 4}};//output :- 1 2 3 4
        //int[][] matrix = { {1},{2}, {3}, {4} };//output :- 1 2 3 4
       // int[][] matrix = {{1, 2, 3, 4},{5, 6, 7 , 8}};//output :- 1 2 3 4 8 7 6 5
       int[][] matrix = {{1, 2, 3, 4},{5, 6 },{9, 10, 11}};//output :- 1 2 3 4 6 11 10 9 5
        originalMatrix(matrix);
        boundaryElements(matrix);
    }
}
