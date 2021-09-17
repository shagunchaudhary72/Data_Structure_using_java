import java.util.Scanner;

class largest_element_in_array {
    public static int largestElement(int arr[]) {
        int largest=0;
    
        for(int j=0; j < arr.length; j++){
            if(arr[j] > arr[largest]){
                largest=j;
            }
        }
        return largest;
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
        System.out.print("largest element in array at index : "+largestElement(arr));
        
        
        }
}