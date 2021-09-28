import java.util.Scanner;

public class maximum_difference_with_order {
    
    //Maximum Difference : arr[j] - arr[i] such that j>i
    static int maxDifference(int arr[]){
        int result=arr[1] - arr[0];
        // for(int i=0; i<arr.length-1; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         result = Math.max(result, arr[j]-arr[i]);
        //     }
        // }
        int minValue = arr[0];
        for(int i=1; i<arr.length; i++){
            result = Math.max(result, arr[i]-minValue);
            minValue = Math.min(arr[i],minValue);
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
       System.out.print("Maximum DIfference  : " + maxDifference(arr) );

    }
}
