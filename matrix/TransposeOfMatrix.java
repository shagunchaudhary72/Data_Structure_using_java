public class TransposeOfMatrix {
    
    static void originalMatrix(int[][] arr){
        System.out.println("Original Matrix  ->");
        for(int row=0; row < arr.length; ++row){
            for( int column = 0; column < arr[row].length; ++column ){
                System.out.print(" " + arr[row][column] );
            }
            System.out.println();
        }
    }
//here matrix must me square matrix
    static void transpose(int[][] arr){
        for(int row = 0; row < arr.length; ++row )
            for(int column = row + 1; column < arr[row].length; ++column ){
                int temp = arr[row][column];
                arr[row][column] = arr[column][row];
                arr[column][row] = temp;
            }
    }

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6 }, {7, 8, 9} };
        originalMatrix(matrix);
        transpose(matrix);
        System.out.println("Transposed Matrix :-> ");
        for(int row=0; row < matrix.length; ++row){
            for( int column = 0; column < matrix[row].length; ++column ){
                System.out.print(" " + matrix[row][column] );
            }
            System.out.println();
        }
    }
}
