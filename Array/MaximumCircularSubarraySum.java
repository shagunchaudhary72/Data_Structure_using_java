import java.util.Scanner;

public class MaximumCircularSubarraySum {
   
    //We are finding the maximum sum of total possible subarrays and circular traversal is allowed

    static int circularSubarraySum(int[] arr){
        int result = arr[0];
        int max;
        int sum;
        for(int i=0; i<arr.length; i++){
            max = arr[i];
            sum = arr[i];
            for(int j=1; j<arr.length; j++){
                int index = ( i + j)%arr.length;
                sum += arr[index];
                max = Math.max(max, sum);
            }
            result = Math.max(result, max);
        }
        
        return result;
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
       System.out.print("Maximum Circular Subarray Sum  : "+ circularSubarraySum(arr));
       
       
       }
}
