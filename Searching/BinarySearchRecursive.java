import java.util.Scanner;

public class BinarySearchRecursive {
    
    //we will return the index of element if present 
    //if element is not present in the given array then return -1
    static int binarySearch( int[] arr, int low, int high, int num ){
        if( low > high ){
            return -1;
        }
        int middle = ( low + high )/2;
        if( arr[middle] == num ){
            return middle;
        }else if( num < arr[middle] ){
            return binarySearch( arr, low, middle - 1, num);
        }else{
            return binarySearch(arr, middle + 1, high, num);
        }
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
       int low = 0;
       int high = arr.length - 1;
       int index = binarySearch(arr, low, high, number );
       if( index == -1){
           System.out.println("Element is not present in the given array ");
       }else{
        System.out.println("Element is present at " + index + " index in the given array ");
       }
    }
}
