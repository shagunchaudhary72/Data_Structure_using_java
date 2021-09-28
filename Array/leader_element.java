import java.util.Scanner;

public class leader_element {
    
    static void leaderElement(int arr[]){

        int curr_leader = arr[arr.length-1];
        System.out.print("Leader Elements in given array  : " + curr_leader + " ");
        for(int i=arr.length-1; i>=0; i--){
            if(curr_leader < arr[i]){
                curr_leader = arr[i];
                System.out.print(curr_leader + " ");
            }
        }
        
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
        leaderElement(arr);
       
       }

}
