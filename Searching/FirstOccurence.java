import java.util.Scanner;

public class FirstOccurence {
    
    //For Sorted Arrays
    // static int firstOccurence( int[] arr, int num ){
    //     int result = -1;      
    //     int low = 0;
    //     int high = arr.length - 1;
    //     while( low <= high ){
    //         int middle = ( low + high )/2;
    //         if( num < arr[middle] ){
    //             high = middle - 1;
    //         }else if( num > arr[middle] ){
    //             low = middle + 1;
    //         }else{
    //            // result = middle;
    //           // high = middle - 1;
    //             if( middle == 0 || arr[middle] != arr[middle - 1] ){
    //                 return middle;
    //             }else{
    //                 high = middle - 1;
    //             }
    //         }
    //     }
    //      //return result;
    //     return -1;
    // }

    //For Unsorted Arrays
    static int firstOccurence( int[] arr, int num ){
        int result = -1;
        for(int i = 0; i < arr.length; i++){
            if( num != arr[i] ){
                continue;
            }
            return i;
        }
        return result;
    }
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);    
    System.out.print("Enter size of array  : ");
    int size=sc.nextInt();
    int [] arr=new int[size];
    System.out.print("Enter elements of array in Sorted Manner : ");
    for(int i=0; i<size; i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter number to search in given array : " );
    int number = sc.nextInt();
    sc.close();
    int index = firstOccurence(arr, number );
    if( index == -1){
        System.out.println("Element is not present in the given array ");
    }else{
     System.out.println("First Occurence is present at " + index + " index in the given array ");
    }
}
}
