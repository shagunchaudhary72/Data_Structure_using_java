import java.util.Scanner;

class left_rotation_by_one{

    static int[] leftRotation(int arr[]){
        
        int first = arr[0];

        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
        
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
       System.out.print("Array elements have been rotated to left by one : \n New array : " );
       arr=leftRotation(arr);
       for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" " );
       }
    }
}