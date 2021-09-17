import java.util.Scanner;

public class reverseArray {
    public static void reverse(int []arr){
        int first=0;
        int last=arr.length-1;
        int temp;
        while(first < last){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
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
       reverse(arr);
       System.out.print("Reverse Array : ");
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
       }
       
       
    }
}
