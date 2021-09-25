import java.util.Scanner;

public class left_rotation_by_constant {

    static int[] leftRotationByOne(int arr[]){
        
        int first = arr[0];

        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
        
        return arr;
    }
  
  static int[] leftRotation(int arr[],int d){

    // for(int i=0; i<d; i++){   
    //     leftRotationByOne(arr);
    //     }
    
    int temp[] = new int[d];
    for(int i=0; i<d; i++){
        temp[i] = arr[i];
    }
    for(int i=d; i<arr.length; i++){
        arr[i-d] = arr[i];
    }
    for(int i=0; i<d; i++){
        arr[arr.length-d+i] = temp[i];
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
       System.out.print("Enter rotation value : ");
       int d=sc.nextInt();
       sc.close();
       System.out.print("Zeroes have been moved to last \n New array : " );
       arr=leftRotation(arr,d);
       for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" " );
       }
    }
}
