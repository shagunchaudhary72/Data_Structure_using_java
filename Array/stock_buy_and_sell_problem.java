import java.util.Scanner;

public class stock_buy_and_sell_problem {
    
    //printing the maximum profit that can be acquired by "buying" and "Selling" stocks 
    //  on alternate days i.e., (price is given for alternarte days)
    static int stockDifference(int arr[]){
        int profit = 0;
        if( arr.length == 1){
            return profit;
        }
        for(int i=1; i<arr.length; i++){
            if( arr[i] > arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Total number of Days  : ");
       int size=sc.nextInt();
       int [] arr=new int[size];
       System.out.print("Enter stock prices for alternante Days : ");
       for(int i=0; i<size; i++){
      arr[i]=sc.nextInt();
       }
       sc.close();
       for(int i=0; i<arr.length; i++){
        System.out.println("Stock Price -> Day "+ (i+1) + ": " +"$"+ arr[i] );
    }
       System.out.print("Total Profit  : "+"$"+ + stockDifference(arr) );

    }
}
