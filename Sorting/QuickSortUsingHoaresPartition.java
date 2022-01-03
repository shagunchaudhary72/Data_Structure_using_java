import java.util.Arrays;

public class QuickSortUsingHoaresPartition {

	//Partitioning using Hoare's Algorithm
	static int hoaresPartition(int[] arr, int low, int high) {
		//choosing first element as Pivot
		int pivot = arr[low];
		
		int left = low-1;//left moving index
		int right = high+1;//right moving index
		
		//traverse through array till left and right index cross each other
		while( true ) {
			//traverse until arr[left] is less than pivot
			do {
				left++;
			}while( arr[ left ] < pivot );
			
			//traverse until arr[right] is greater tahn pivot
			do {
				right--;
			}while( arr[ right ] > pivot );
			
			//if both indexes have crossed each other or they are equal
			if( left >= right )
				return right;//because all values to left of right are smaller than it and gretaer for right side
			//else swap both the values
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
	}
	//Quick Sort(Ascending Order) function by using Hoares Algorithm
	static void quickSort(int[] arr, int low, int high ) {
		if( low < high ) {
			int pivotIndex = hoaresPartition(arr, low, high);//arr[pivotIndex] is at its correct place
			quickSort(arr, low, pivotIndex );
			quickSort(arr, pivotIndex+1, high);
		}
	}
	public static void main(String[] args) {
		int[] arr = { 10, 5, 30, 15, 7 };
		System.out.println("Unsorted Array : " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("sorted Array : " + Arrays.toString(arr));
	}
}
