import java.util.Scanner;

public class MaximumSumOf_K_ConsecutiveElements {
    
    //Finding the maximum sum of "k" Consecutive Elements in the Given Array

    static int getConsecutiveSum(int[] arr, int k){
        int result = 0;
        int sum = 0;
        int j = k;
        for(int i=0; i<k; i++){
            sum += arr[i];
            if( i == k-1){
                k++;
                i = k-j-1;
                result = Math.max(result, sum);
                sum = 0;
            }
            if( i == arr.length-1 ){
                break;
            }
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
       System.out.print("Enter the Consecutive Elements Range or Size : ");
       int k = sc.nextInt();
       sc.close();
       System.out.print("Maximum Sum of "+ k +" Consecutive Elements  : "+ getConsecutiveSum(arr,k));
       
       
       }
}
