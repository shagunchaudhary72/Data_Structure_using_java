import java.util.Scanner;

public class SearchElement_in_SortedRotatedArray {
    
    //searching the given element in sorted Rotated array
    static int searchElement( int[] arr, int element ){
        int low = 0, high =  arr.length - 1 ;
        while( low <= high ){
            int mid = ( low + high )/2;
            if( arr[mid] == element )
                 return mid;
            else if( arr[mid] > arr[low] ){
                if( element >= arr[low] && element < arr[mid] ){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if( element > arr[mid] &&  element <= arr[high] ){
                    low = low + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
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
       int index = searchElement(arr,number);
       if( index == -1){
           System.out.println("Element is not present in the given array ");
       }else{
        System.out.println("Element is present at " + index + " index in the given array ");
       }
}
}
