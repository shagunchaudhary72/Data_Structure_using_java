import java.util.Scanner;

public class SquareRoot {
    
    //finding the floor of square root of given number without using predefined methods

    //Naive Solution having time complexity O(x^(1/2))
    // static int squareRoot( int number ){
    //     int i = 1;
    //     while( i*i <= number ){
    //         i++;
    //     }
    //     return i-1;
    // }

    //Efficient Solution by using binary search method having time complexity O( log n )
    static int squareRoot( int number ){
        int low = 0, high = number, result = -1;
        while( low <= high ){
            int mid = ( low + high )/2;
            int square = mid * mid ;
            if( square == number ){
                return mid;
            }else if( square > number ){
                high = mid - 1;
            }else{
                low = mid + 1;
                result = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter NUmber to check Square Root : ");
        int number = sc.nextInt();
        sc.close();
        System.out.println("Floor of Square Root of given Number : " + squareRoot(number));
    }
}
