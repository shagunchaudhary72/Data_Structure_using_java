import java.util.Scanner;

public class remove_duplicate_elements_in_sorted_array {

    static int removeDuplicates(int arr[],int size){

        int result=1;
        // int temp[]= new int[size];
        // temp[0]=arr[0];
        // for(int index=1; index<size; index++){
        //     if(temp[result-1]!=arr[index]){
        //         temp[result]=arr[index];
        //         result++;
        //     }
        // }
        // for(int i=0; i<result; i++){
        //     arr[i]=temp[i];
        // }
            for(int i=1; i<size; i++){
                if(arr[result -1 ] != arr[i]){
                    arr[result]=arr[i];
                    result++;
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
       System.out.println("Duplicate Elements have been removed from aray \n New Size of array : "+ removeDuplicates(arr,size));

    }
}
