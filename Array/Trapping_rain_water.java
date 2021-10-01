import java.util.Scanner;

//Trapping rain water between given column values as array elements

public class Trapping_rain_water {
    
    static int trapWater(int arr[]){
        int result = 0;
        // for(int i=1; i<arr.length-1; i++){
        //     int lmax = arr[i];
        //     for(int j=0; j<i; j++){
        //         lmax = Math.max(lmax, arr[j]);
        //     }
        //     int rmax = arr[i];
        //     for(int j=arr.length-1; j>i; j--){
        //         rmax = Math.max(rmax, arr[j]);
        //     }
        //     result = result + Math.min(rmax, lmax) - arr[i];
        // }
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];
        lmax[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            lmax[i] = Math.max(lmax[i-1], arr[i]);

        }
        rmax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            result = result + Math.min(lmax[i],rmax[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Total number Columns  : ");
       int size=sc.nextInt();
       int [] arr=new int[size];
       System.out.print("Enter Column values : ");
       for(int i=0; i<size; i++){
      arr[i]=sc.nextInt();
       }
       sc.close();
       System.out.println("Total water can be stored : "+ trapWater(arr));
    }
}
