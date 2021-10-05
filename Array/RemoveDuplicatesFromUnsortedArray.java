import java.util.Scanner;

public class RemoveDuplicatesFromUnsortedArray {
  //Checking for the duplicates an returning the new size of array
    static int removeDuplicates(int arr[],int size){

        int result=1;
        int temp[]= new int[size];
        temp[0]=arr[0];
        int flag;
        for(int index=1; index<size; index++){
            flag = 1;
            for(int j = 0; j<=index; j++){
                if(temp[j]==arr[index]){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                temp[index] = arr[index];
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

