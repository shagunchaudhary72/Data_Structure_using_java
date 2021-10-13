public class PeakElements {
    
    //the element which is greater than or equals to  its previous and later element is called Peak Element
    static void searchPeak(int[] arr){
        //If size of array is 1 then first element is peak 
        if( arr.length == 1 ){
            System.out.println("Peak Element : " + arr[0] );
        }
        //if first element is greater than second than it is peak element
        else{
            if( arr[0] > arr[1] ){
                System.out.println("Peak Element : " + arr[0] );
            }
            //if last element is greater than or equal to second last element than it is peak element
            if( arr[ arr.length - 1 ] >= arr[ arr.length - 2 ] ){
                System.out.println("Peak Element : " + arr[arr.length - 1] );
            }
            for( int i = 1; i < arr.length-1; ++i ){
                if( arr[i] >= arr[i - 1] && arr[i] >= arr[i+1] ){
                    System.out.println("Peak Element : " + arr[i] );
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr;
    //    arr = new int[]{ 10, 20, 15, 5, 23, 90, 6 };  //20, 90
    //    arr = new int[]{ 5, 10, 20, 15, 7 };        // 20
    //    arr = new int[]{ 80, 70, 60};        //80
    //    arr = new int[]{60};     //60
        arr = new int[]{90,60,80};      //90, 80
        searchPeak(arr);
    }

}
