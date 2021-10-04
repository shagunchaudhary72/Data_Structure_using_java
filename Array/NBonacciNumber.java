import java.util.Scanner;

public class NBonacciNumber {
    
    static int[] getSeries(int n, int m){
        int [] arr = new int[n];
        int sum ;
        for(int i=0; i<m-1; i++){
            arr[i] = 0;
        }
        arr[m-1] = 1;
        for(int i=m; i<arr.length; i++){
            sum = 0;
            for(int j=i-1; j>=i-m; j--){
                sum = sum + arr[j];
            }
            System.out.println("N-Bonacci Series : "+ sum);
            arr[i] = sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
       System.out.print("Enter total number of terms of N-Bonacci Series : ");
       int n = sc.nextInt();
       System.out.print("Enter Fibonacci range : ");
       int m = sc.nextInt();
       sc.close();
       int[] arr= getSeries(n, m);
       System.out.print("N-Bonacci Series : ");
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
       }
       
       
    }
}
