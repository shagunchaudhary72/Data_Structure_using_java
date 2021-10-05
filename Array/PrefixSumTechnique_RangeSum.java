import java.util.Scanner;

public class PrefixSumTechnique_RangeSum {
 
    //We have find the sum of range of indexes given:

    //Here we are usinf prefix sum technique to get the sum
    // prefixSum() returning the array having sum of all the index values
    static int[] prefixSum(int[] arr){
        int sum = 0;
        int[] prefix = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            prefix[i] = sum;
        }
        return prefix;
    }
    static int getSum(int[] arr, int f, int l){
        int sum = 0;
        int[] prefix = prefixSum(arr);
        if( f == 0 ){
            sum = prefix[l];
        }else{
        sum = prefix[l] - prefix[f-1];
        }
        return sum;
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
       System.out.println("Enter the first and last element index to get sum : ");
       int f = sc.nextInt();
       int l = sc.nextInt();
       sc.close();
       System.out.print("Maximum Circular Subarray Sum  : "+ getSum(arr, f, l));
       
       
       }
}
