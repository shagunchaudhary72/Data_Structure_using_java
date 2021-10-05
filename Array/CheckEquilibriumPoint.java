import java.util.Scanner;

public class CheckEquilibriumPoint {
    
    //We have to check that given index is the euilibrium point or not
    //Equilibrium point is the index at which sum of its all left elements and right elements are same

    static boolean checkEquilibrium(int[] arr, int index){
        int prefixSum = 0;
        for( int i=0; i<arr.length; i++){   //Using Prefix Sum Technique for optimization
            prefixSum += arr[i];
        }
        int leftSum = 0;
        for(int i=0; i<arr.length; i++){
            if( leftSum == prefixSum-arr[i] ){
                return true;
            }
            leftSum += arr[i];
            prefixSum -= arr[i];
        }
        return false;
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
       System.out.print("Enter index to check equilibrium : ");
       int index = sc.nextInt();
       sc.close();
       boolean check = checkEquilibrium(arr, index);
       if( check == true){
        System.out.println("Yes, index "+ index +" is an equilibrium point in the given array");
       }else{
        System.out.println("No, index "+ index +" is not an equilibrium point in the given array");
       }
      }
}
