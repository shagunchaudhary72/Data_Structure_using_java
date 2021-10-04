import java.util.Scanner;

public class MajorityElement {
    
    // We are finding the element having occurences more than half the size of array i.e,.(occurenece > (n/2))

    static int getMajorityElement(int[] arr){
        // int result = -1;
        // for(int i=0; i<arr.length; i++){
        //     int count = 1;
        //     for(int j=i+1; j<arr.length; j++){
        //         if( arr[i] == arr[j] )
        //             count++;
        //         if( count > (arr.length/2))
        //             return i;
        //     }
        // }

//Optimized Solution having time Complexity = Θ(n)
        
        //First Checking for any majority element
        int count = 1;
        int result = 0;
        for(int i=1; i<arr.length; i++ ){
            if( arr[result] == arr[i] ){
                count++;
            }else{
                count--;
            }
            if( count == 0){
                result = i;
                count = 1;
            }
        }
        
        //Now checking the count if majority element is present
        count = 0;
        for(int i=0; i<arr.length; i++){
            if( arr[result] == arr[i] ){
                count++;
            }
        }
        if(count <= (arr.length/2) ){
            return -1;
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
       int i = getMajorityElement(arr);
       if( i == -1)
            System.out.println("No Majority Element in Given Array");
        else
            System.out.println("Majority Element of Array : "+ arr[i]);
       
       
       }
}
