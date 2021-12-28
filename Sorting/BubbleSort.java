import java.util.Arrays;

class BubbleSort{

    static void sort(int[] arr){
        for(int i = 0; i < arr.length-1; ++i ){
            for(int j = 0; j < arr.length-i-1; ++j ){
                if( arr[j] > arr[j+1] )
                    swap(arr[j], arr[j+1]);
            }
        }
    }
    static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 3, 35, 25 };
        System.out.println("Initial : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted : " + Arrays.toString(arr) );
    }
}