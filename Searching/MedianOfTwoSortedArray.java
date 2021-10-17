public class MedianOfTwoSortedArray {
    
    //Two Sorted Arrays are given 
    //We are finding the median of those arrays combined
    static float median(int[] arr1, int[] arr2){

        int[] temp = new int[ arr1.length + arr2.length ];
        for( int i = 0; i < arr1.length; ++i ){
            temp[i] = arr1[i];
        }
        int j = 0;
        for( int i = arr1.length; i < temp.length; ++i ){
            temp[i] = arr2[j++];
        }
        float median ;
        if( temp.length % 2 != 0 ){
            median = temp[ temp.length/2 ];
            return median;
        }else{
            median = (temp[ temp.length/2 ] + temp [ temp.length/2 - 1 ])/2f;
            return median;
        }        
        
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 6, 8, 4};
        int[] arr2 = { 1, 8, 6, 7};
        System.out.println("Median : " + median(arr1, arr2)); // 2.5
    }
}
