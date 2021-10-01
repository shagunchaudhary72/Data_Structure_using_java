import java.util.Scanner;

public class Maximum_sum_of_subarray {
 
    static int maxSum(int [] arr){
        int result = arr[0];
        //int max;
        // for(int i=0; i<arr.length; i++){
        //     max = 0;
        //     for(int j=i; j<arr.length; j++){
        //         max = max + arr[j];
        //         result = Math.max(max, result);
        //     }
        // }
        int maxEnding = arr[0];
        for(int i=1; i<arr.length; i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            result = Math.max(result, maxEnding);
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
       System.out.print("Maximum SUm of Subarray : "+ maxSum(arr));
       
       
       }
}
