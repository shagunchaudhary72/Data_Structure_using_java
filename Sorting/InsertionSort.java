import java.util.Arrays;

public class InsertionSort {
    
    static void insertionSort(int[] arr){
        for( int i = 0; i < arr.length; ++i ){
            int key = arr[ i ];
            int j = i - 1;
            while( j >= 0 && arr[j] > key ){
                arr[ j + 1 ] = arr[ j ];
                --j;
            }
            arr[ j + 1 ] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 3, 35, 25 };
        System.out.println("Initial : " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted : " + Arrays.toString(arr) );
    }
}
