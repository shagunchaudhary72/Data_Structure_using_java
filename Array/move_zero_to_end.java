import java.util.Scanner;

public class move_zero_to_end {

    static int[] moveZero(int arr[]){
     
        
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] == 0){
        //         for(int j=i+1; j<arr.length; j++){
        //             if(arr[j] != 0 ){
        //                 arr[i]=arr[j];
        //                 arr[j]=0;
        //                 break;
        //             }
        //         }
        //     }
        // }
        int count=0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] != 0 ){
                arr[count]=arr[i];
                arr[i] = 0;
                count++;
            }
        }
        return arr;
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
       System.out.print("Zeroes have been moved to last \n New array : " );
       arr=moveZero(arr);
       for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" " );
       }
    }
}
