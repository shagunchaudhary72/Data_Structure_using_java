import java.util.Scanner;

public class Maximum_consecutive_one {
 
    static int maximumOnes(int [] arr){
        int temp = 0;
        int result = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                temp++;
                result = Math.max(result, temp);
            }
            else{               
                temp = 0;
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
       System.out.print("Maximum Consecutive one's in array  : "+ maximumOnes(arr));
       
       
       }
}
