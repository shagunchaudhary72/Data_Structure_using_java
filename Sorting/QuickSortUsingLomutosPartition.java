import java.util.Arrays;

public class QuickSortUsingLomutosPartition {

	//Lomutos Partition function
	static int lomutoPartition(int[] arr, int low, int high ) {
		//take arr[high] as pivot
		int pivot = arr[high];
		//take i as low-1
		int i = low-1;
		//traverse from low to high-1
		for(int j = low; j <= high-1; ++j ) {
			//check if current value is lesser than pivot
			//save smaller value to left and larger to right
			if( arr[j] < pivot ) {
				i++;
				//swap arr[j] with arr[i]
				swap( i, j, arr );
			}
		}
		//swap pivot value
		swap( i+1, high, arr);
		return i+1;
	}
	
	static void swap(int i, int j ,int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//Quick Sort function
	static void quickSort(int[] arr, int low, int high ) {
		if( low < high ) {
			int p = lomutoPartition(arr, low, high);
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}
	public static void main(String[] args) {
		int[] arr = { 10, 5, 30, 15, 7 };
		System.out.println("Unsorted Array : " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("sorted Array : " + Arrays.toString(arr));

	}

}
