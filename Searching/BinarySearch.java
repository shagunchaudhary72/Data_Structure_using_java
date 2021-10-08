import java.util.Scanner;

public class BinarySearch {

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
       int index = binarySearching(arr,number);
       if( index == -1){
           System.out.println("Element is not present in the given array ");
       }else{
        System.out.println("Element is present at " + index + " index in the given array ");
       }
    }    
}
