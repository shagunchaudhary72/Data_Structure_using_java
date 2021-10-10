import java.util.Scanner;

class LinearSearch{
    
    //we have to search the given element in the array and return index
    //if number is not present then return -1
    // if same element present at two indices return any one index 
    static int linearSearching(int[] arr, int number){
        int i = 0;
        while( i < arr.length){
            if( arr[i] == number )
                return i;
            i++;
        }
        return -1;
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
       System.out.print("Enter number to search in given array : " );
       int number = sc.nextInt();
       sc.close();
       int index = linearSearching(arr,number);
       if( index == -1){
           System.out.println("Element is not present in the given array ");
       }else{
        System.out.println("Element is present at " + index + " index in the given array ");
       }
    }
}