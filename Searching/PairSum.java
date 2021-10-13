public class PairSum {
    
    //Given an array and sum 
    //finding the all possible pairs having sum is equals to given sum

    //for Unsorted Array
    // static void pairs(int[] arr,int sum){
    //     boolean flag = true;
    //     for( int i = 0; i < arr.length; i++){
    //         for( int j = i+ 1; j<arr.length; ++j){
    //             if( arr[i] + arr[j] == sum ){
    //                 System.out.println("pair  : " +arr[i] +" --- " + arr[j]);
    //                 flag = false;
    //             }
    //         }
    //     }
    //     if( flag ){
    //         System.out.println("No pair Present !!");
    //     }
    // }

    //For Sorted Arrays
        static void pairs(int[] arr, int sum){
            boolean flag = true;
            int left = 0, right = arr.length - 1;
            while( left < right ){
                int pairs = arr[left] + arr[right];
                if( pairs == sum ){
                    System.out.println(" Pair  : " +arr[left] +" --- " + arr[right]);
                    ++left;
                    flag = false;
                }else if( pairs > sum )
                    --right;
                else if( pairs < sum )
                    ++left;
            }     
           if( flag ){
            System.out.println("No pair Present !!");
            }
        }
    public static void main(String[] args) {
        int[] arr;
    //     arr = new int[]{3,5,9,2,8,10,11}; 
    //     pairs(arr, 13); // 3--10, 5--8,  2--11
    //     pairs(arr, 50);  //No pairs
        arr = new int[]{2,4,8,9,11,12,20,30};
     //   pairs(arr, 23); // 11 --- 12
     pairs(arr, 35); // NO pair
    }
}
