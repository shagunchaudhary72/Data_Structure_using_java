import java.util.Scanner;

public class CheckSubarraySum {
    
    //We have to check that given sum can be achieved from subarays or not 

    static boolean subarraySum(int[] arr, int sum){
        int result = 0;
        for(int i=0; i<arr.length; i++){     
            for(int j=i; j<arr.length; j++){
                result += arr[j];
                if( result == sum ){
                    return true;
                }
            }
            result = 0;
        }
        return false;
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
       System.out.print("Enter the Subarray Sum for Checking : ");
       int sum = sc.nextInt();
       sc.close();
       if( subarraySum(arr, sum) ){
        System.out.println("yes, that Sum can be achieved by Subarray of given array");
       }else{
        System.out.println("No, that Sum can be achieved by Subarray of given array");
       }
       
       
       
       }
}
