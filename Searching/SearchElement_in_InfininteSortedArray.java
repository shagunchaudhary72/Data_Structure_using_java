import java.util.Scanner;

public class SearchElement_in_InfininteSortedArray {
    
    //finding the given element in sorted array whose length is infinite or not given
    //Assuming there are millions of elements in the array
    //there is limitation that given element should be not be out of array limit


    //Naive solution -> time complexity = O(position of element)
    // static int searchElement( int[] arr, int number ){
    //     int i = 0;
    //     while( true ){
    //         if( arr[i] == number ) 
    //             return i;
    //         if( arr[i] > number ) 
    //             return -1;
    //         i++;
    //     }
    // }

    //Efficient Solution is the use of binary Search [ Time Complexity = O(log position) ]
    static int searchElement( int[] arr, int number ){
        if( arr[0] ==  number )
            return 0;
        int i = 1;
        while( arr[i] < number ){
            i = i * 2;
            if( arr[i] == number ) return i;
        }
        
        return  BinarySearchRecursive.binarySearch(arr, i/2 + 1 , i - 1 , number );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int[] arr = new int[ 10000000 ];
        int x = 1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = x;
            x = x + 2;
        }
        System.out.print("Enter Number to Search in the given Array : ");
        int number = sc.nextInt();
        sc.close();
        int index = searchElement(arr, number );
        if( index == -1){
            System.out.println("Element is not present in the given array ");
        }else{
         System.out.println("Element is present at " + index + " index in the given array ");
        }
    }
}
