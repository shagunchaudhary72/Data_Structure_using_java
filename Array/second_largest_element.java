import java.util.Scanner;

public class second_largest_element {

    public static int secondLargest(int arr[]){
        int largest=0;
        int result=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[largest]){
                result=largest;
                largest=i;
            }
            if(arr[i] < arr[largest]){
                
                if(result==-1  || arr[i] > arr[result]){
                    result=i;
                } 
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
       System.out.print("Second largest element in array at index : " + secondLargest(arr));
       
    }    
}
