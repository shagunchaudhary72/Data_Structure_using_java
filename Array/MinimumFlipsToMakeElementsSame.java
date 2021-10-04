import java.util.Scanner;

public class MinimumFlipsToMakeElementsSame {
  
    //We have given an array that contains 1's and 0's 
    //We need to find the minimum number of flips to make all elements either 1 or 0
    
    static int minimumFlips(int[] arr){
        int flips = 0;
        int one = 0;
        int zero = 0;
        for(int i=0; i<arr.length; i++){
            if( arr[i] == 1)
                one++;
            if( arr[i] == 0 )
                zero++;
        }
        if( one <= zero){
             for(int i=0; i<arr.length; i++){
                if( arr[i] == 1 ){
                    arr[i] = 0;
                    flips++;
                }
             }
        }else{
            for(int i=0; i<arr.length; i++){
                if( arr[i] == 0 ){
                    arr[i] = 1;
                    flips++;
                }
            }
        }
        return flips;
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
       System.out.print("Maximum Flips required to make all elements same  : "+ minimumFlips(arr));
       
       
       }
}
