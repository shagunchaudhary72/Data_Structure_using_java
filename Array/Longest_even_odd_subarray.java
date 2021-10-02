import java.util.Scanner;

public class Longest_even_odd_subarray {

    //we are checking the alternate values here i.e.,if alternate values are even and odd

    static int longestEvenOdd(int []arr){
        int result = 1;
        int temp = 1;
//without using logical operators
        // int even;
        // for(int i=0; i<arr.length; i++){
        //     temp = 0;
        //     if( arr[i] % 2 == 0){
        //         temp++;
        //         even = 1;
        //         for(int j=i+1; j<arr.length; j++ ){
        //             if( even == 1){
        //                 if( arr[j]%2 != 0){
        //                     temp++;
        //                     even = 0;
        //                 }else{
                            
        //                     break;
        //                 }
        //             }else{
        //                 if( arr[j]%2 == 0){
        //                     temp++;
        //                     even = 1;
        //                 }else{
                            
        //                     break;
        //                 }
        //             }
        //         }
        //         result = Math.max(result,temp);
        //     }
        //     if( arr[i] % 2 != 0){
        //         temp++;
        //         even = 0;
        //         for(int j=i+1; j<arr.length; j++ ){
        //             if( even == 1){
        //                 if( arr[j]%2 != 0){
        //                     temp++;
        //                     even = 1;
        //                 }else{
                            
        //                     break;
        //                 }
        //             }else{
        //                 if( arr[j]%2 == 0){
        //                     temp++;
        //                     even = 0;
        //                 }else{
                            
        //                     break;
        //                 }
        //             }
        //         }
        //         result = Math.max(result,temp);
        //     }
        // }
//Using Logical Operators
        // for(int i=0; i<arr.length; i++){
        //     temp = 1;
        //     for(int j=i+1; j<arr.length; j++){
        //         if( (arr[j]%2 == 0 && arr[j-1]%2 != 0) || ( arr[j]%2 != 0 && arr[j-1]%2 == 0)){
        //             temp++;

        //         }else{
        //             break;
        //         }
        //     }
        //     result = Math.max(result,temp);
        // }
//Efficient Solution
            for(int i=1; i<arr.length; i++ ){
                if( (arr[i]%2 == 0 && arr[i-1]%2 != 0) || (arr[i]%2 != 0 && arr[i-1]%2 == 0)){
                    temp++;
                    result = Math.max(result,temp);
                }else{
                    temp = 1;
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
       sc.close();
       System.out.print("length of longest even odd subarray  : "+ longestEvenOdd(arr));
       
       
       }
}
