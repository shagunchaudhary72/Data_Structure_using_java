class TripletSum{

    //We have been given and sorted array and a sum 
    //we are finding the the triplet having sum equals to the given sum and return true and false
    static void tripletSum(int[] arr, int sum){
        for( int i = 0; i < arr.length; ++i ){
            boolean pair = pairs(arr, i+1, arr.length-1, sum-arr[i]);
            if( pair == true ){
                System.out.println("Yes Triplet Present in the given array");
                return;
            }
        }
        System.out.println("No Triplet present in the given array");
    }

    //This function will check for the pair and return true to the triplet function
    static boolean pairs(int[] arr, int left, int right, int sum){
        while( left < right ){
            int pairs = arr[left] + arr[right];
            if( pairs == sum ){
                return true;
            }else if( pairs > sum )
                --right;
            else if( pairs < sum )
                ++left;
        }
        return false;     
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{ 2, 3, 4, 8, 9, 20, 40 };
        //tripletSum( arr, 9); //true
        //tripletSum(arr, 37);  //true
        tripletSum(arr, 38);    //false
    }
    
}