import java.util.Arrays;

public class SelectionSort {
    
    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; ++i ){
            for( int j = i+1; j < arr.length; ++j ){
                if( arr[ i ] > arr[ j ] ){
                    int temp =  arr[ i ];
                    arr[ i ] = arr[ j ];
                    arr[ j ]= temp;
                }
            }
        }
    }

    
    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 3, 35, 25 };
        System.out.println("Initial : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted : " + Arrays.toString(arr) );
    }
}
