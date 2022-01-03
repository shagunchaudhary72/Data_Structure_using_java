import java.util.Arrays;

public class MergeSort {

	// Merge Sort( Ascending Order )
	// function to divide and sort and merge
	static void divideAndMergeAsc(int[] arr, int low, int middle, int high) {
		// low = lowest index , middle = middle index and high = highest index
		int[] leftArr = new int[middle - low + 1];
		int[] rightArr = new int[high - middle];

		// fill leftArr with values from left side of middle and middle also
		for (int i = 0; i < leftArr.length; ++i) {
			leftArr[i] = arr[low + i];// we are using low+i to get the actual values from original array
		}

		// fill rightArr with values from right side of middle
		for (int i = 0; i < rightArr.length; ++i) {
			rightArr[i] = arr[middle + 1 + i];
		}
		// now merge these arrays in sorted manner
		int i = low, j = 0, k = 0;// consider 'i' as index of arr, 'j' as index of left and 'k' as index of right
		while (j < leftArr.length && k < rightArr.length) {
			// fill arr from leftArr
			if (leftArr[j] < rightArr[k]) {
				arr[ i++ ] = leftArr[j++];
			} // fill arr from rightArr
			else {
				arr[ i++ ] = rightArr[k++];
			}
		}
		// filling values from left array if values remaining in array
		while (j < leftArr.length) {
			arr[ i++ ] = leftArr[j++];
		}
		// filling all the remaining values from right array
		while (k < rightArr.length) {
			arr[ i++ ] = rightArr[k++];
		}
	}
	// Merge Sort( Descending Order )
	// function to divide and sort and merge
	static void divideAndMergeDesc(int[] arr, int low, int middle, int high) {
		// low = lowest index , middle = middle index and high = highest index
		int[] leftArr = new int[middle - low + 1];
		int[] rightArr = new int[high - middle];
		
		// fill leftArr with values from left side of middle and middle also
		for (int i = 0; i < leftArr.length; ++i) {
			leftArr[i] = arr[low + i];// we are using low+i to get the actual values from original array
		}
		
		// fill rightArr with values from right side of middle
		for (int i = 0; i < rightArr.length; ++i) {
			rightArr[i] = arr[middle + 1 + i];
		}
		// now merge these arrays in sorted manner
		int i = low, j = 0, k = 0;// consider 'i' as index of arr, 'j' as index of left and 'k' as index of right
		while (j < leftArr.length && k < rightArr.length) {
			// fill arr from leftArr
			if (leftArr[j] > rightArr[k]) {
				arr[ i++ ] = leftArr[j++];
			} // fill arr from rightArr
			else {
				arr[ i++ ] = rightArr[k++];
			}
		}
		// filling values from left array if values remaining in array
		while (j < leftArr.length) {
			arr[ i++ ] = leftArr[j++];
		}
		// filling all the remaining values from right array
		while (k < rightArr.length) {
			arr[ i++ ] = rightArr[k++];
		}
	}

	// main function of merge sorting
	static void mergeSort(int[] arr, int low, int high) {
		// do if low is less than high
		if (low < high) {
			int middle = low + (high - low) / 2;
			// recursive call for leftArr
			mergeSort(arr, low, middle);
			// recursive call for rightArr
			mergeSort(arr, middle + 1, high);
			// call divide and merge for left and right array
			divideAndMergeDesc(arr, low, middle, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 30, 15, 7 };
		System.out.println("Unsorted Array : " + Arrays.toString(arr));
//		mergeSort(arr, 0, arr.length - 1);
//		System.out.println("sorted Array(Ascending Order) : " + Arrays.toString(arr));
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("sorted Array(Descending Order) : " + Arrays.toString(arr));
	}

}
