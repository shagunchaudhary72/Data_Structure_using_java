import java.util.Scanner;

public class BinarySearch {
  
    static int binarySearch( int[] arr, int num){
        int low = 0;
        int high = arr.length-1;
        while( low <= high ){
            int middle = ( low + high )/2;
            if( num == arr[middle] )
                return middle;
            else if( num < arr[middle] )
                high = middle - 1;
            else
                low = middle + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           
            System.out.print("Enter size of array  : ");
           int size=sc.nextInt();
           int [] arr=new int[size];
           System.out.print("Enter elements of array : ");
           for(int i=0; i<size; i++){
               arr[i]=sc.nextInt();
           }
           System.out.print("Enter number to search in given array : " );
           int number = sc.nextInt();
           sc.close();
           int index = binarySearch(arr,number);
           if( index == -1){
               System.out.println("Element is not present in the given array ");
           }else{
            System.out.println("Element is present at " + index + " index in the given array ");
           }
    }
}
