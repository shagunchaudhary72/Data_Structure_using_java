import java.util.Scanner;

public class TotalOccurences {
    

    //For getting Index of Last Occurenece
        static int lastOccurence( int[] arr, int num){       
        int low = 0;
        int high = arr.length-1;
        while( low <= high ){
            int middle = ( low + high )/2;
            if( num < arr[middle] )
                high = middle - 1;
            else if( num > arr[middle] )
                low = middle + 1;
            else{
                if( middle == arr.length-1 || arr[middle] != arr[middle + 1]){
                    return middle;
                }else{
                    low = middle + 1;
                }
            }           
        }
        return -1;
    }

        
   //For getting index of First Occurence
    static int firstOccurence( int[] arr, int num ){    
        int low = 0;
        int high = arr.length - 1;
        while( low <= high ){
            int middle = ( low + high )/2;
            if( num < arr[middle] ){
                high = middle - 1;
            }else if( num > arr[middle] ){
                low = middle + 1;
            }else{
                if( middle == 0 || arr[middle] != arr[middle - 1] ){
                    return middle;
                }else{
                    high = middle - 1;
                }
            }
        }
        return -1;
    }

 //We have to count the total occurences of given number in the array
 //We are using binary search because it has time Complexity O(log n) 
    static int total(int[] arr, int num){
        int first = firstOccurence(arr, num);
        if( first == -1 ){
            return 0;
        }
        int last = lastOccurence(arr, num);
        return ( last - first + 1 );
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
        int count = total(arr, number );
        if( count == 0){
            System.out.println("Element is not present in the given array ");
        }else{
         System.out.println("Total Occurences of given eklement are :  " + count);
        }
    }

}
