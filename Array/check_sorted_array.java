import java.util.Scanner;

public class check_sorted_array {
//We have check that given array is sorted or not in increeasing manner
    public static boolean checkSorted(int arr[]){
       
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
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
         sc.close();
        if(checkSorted(arr)){
       System.out.print("Array is Sorted ");
         }else{
       System.out.println("Array is not Sorted ");
         }
    }
   
}
