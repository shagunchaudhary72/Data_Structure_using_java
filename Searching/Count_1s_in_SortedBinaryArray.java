import java.util.Scanner;

public class Count_1s_in_SortedBinaryArray {
    
    //we  are counting the total occurences of 1's in the given sorted Binary array by using binary search
   // Binary array contains only 0's and 1's
    static int totalOccurence( int[] arr){
        int low = 0, high = arr.length - 1;
        while( low <= high ){
            int middle = ( low + high )/2;
            if( arr[middle] == 0 ){
                low = middle + 1;
            }else{
                if( middle == 0 || arr[middle] != arr[middle - 1] /* or arr[middle - 1] == 0 */){
                    //this condition is for getting the first Occurence
                    return ( arr.length - middle );
                }else{
                    high = middle - 1;
                }
            }
        }
        return 0;
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
        sc.close();
        int count = totalOccurence(arr);
        if( count == 0){
            System.out.println("Element is not present in the given array ");
        }else{
         System.out.println("Total Occurences of 1 in given Array  :  " + count);
        }
    }
}
