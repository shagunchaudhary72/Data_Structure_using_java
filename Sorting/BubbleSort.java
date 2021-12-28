import java.util.Arrays;

class BubbleSort{

    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length-1; ++i ){
            for(int j = 0; j < arr.length-i-1; ++j ){
                if( arr[j] > arr[j+1] )
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // for (int i : arr) {
        //     System.out.println(i);
        // }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 3, 35, 25 };
        System.out.println("Initial : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted : " + Arrays.toString(arr) );
    }
}