import java.util.Scanner;

public class LastOccurence {

    //return index of last occurence if not present then return -1
    
    //For Sorted Array
    // static int lastOccurence( int[] arr, int num){
        
    //     int low = 0;
    //     int high = arr.length-1;
    //     while( low <= high ){
    //         int middle = ( low + high )/2;
    //         if( num < arr[middle] )
    //             high = middle - 1;
    //         else if( num > arr[middle] )
    //             low = middle + 1;
    //         else{
    //             if( middle == arr.length-1 || arr[middle] != arr[middle + 1]){
    //                 return middle;
    //             }else{
    //                 low = middle + 1;
    //             }
    //         }
                
    //     }
    //     return -1;
    // }

    //For Unsorted Array

    static int lastOccurence( int[] arr, int num){
        int last = -1;
        for( int i = 0; i < arr.length ; i++){
            if( num != arr[i] ){
                continue;
            }
            last = i;
        }

        return last;
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
        int index = lastOccurence(arr, number );
        if( index == -1){
            System.out.println("Element is not present in the given array ");
        }else{
         System.out.println("Last Occurence is present at " + index + " index in the given array ");
        }
    }
}
