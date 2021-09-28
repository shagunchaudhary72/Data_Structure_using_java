import java.util.Scanner;

public class frequency_of_element_sorted_array {
    
static void checkFrequency(int arr[]){
     
    int frequency = 1;
    int i=1;
    while( i < arr.length){
        while( i < arr.length && arr[i] == arr[i-1] ){
            i++;
            frequency++;
        }
        System.out.println("Frequency of "+arr[i-1]+" : "+ frequency);
        frequency=1;
        i++;
    }
    if( arr.length == 1 || arr[arr.length - 1] != arr[arr.length - 2] ){
        System.out.println("Frequency of "+arr[arr.length - 1]+" : "+ frequency);
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
       checkFrequency(arr);

    }
}
