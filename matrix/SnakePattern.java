class SnakePattern{

    static void originalMatrix(int[][] arr){
        System.out.println("Original Matrix  ->");
        for(int row=0; row < arr.length; ++row){
            for( int column = 0; column < arr[row].length; ++column ){
                System.out.print(" " + arr[row][column] );
            }
            System.out.println();
        }
    }

    static void pattern(int[][] arr){
        System.out.print("Snake Pattern  ->");
        for(int row=0; row < arr.length; ++row){
            //to print from first index
            if( row %2 == 0 ){
                for( int column = 0; column < arr[row].length; ++column ){
                    System.out.print(" " + arr[row][column] );
                }
                //to print from last index
            }else{
                for(int column = arr[row].length - 1; column >= 0; --column ){
                    System.out.print(" " + arr[row][column] );
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},{5, 6, 7 , 8},{9, 10, 11, 12}};
        originalMatrix(matrix);
        pattern(matrix);
    }
}