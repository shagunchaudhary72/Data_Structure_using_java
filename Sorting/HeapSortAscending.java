import java.util.Arrays;

public class HeapSortAscending {

	//swap function
	static void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	//function to build maxHeap (i.., for heapify )
	static void maxHeapify(int[] arr, int n, int i) {
		int largest=i;//take given node index as largest of parent and other two children
		int left = 2*i + 1;//index of left child of given  node
		int right = 2*i + 2;//index of right child of given node

		//check if node has left and if left child is largeer than parent
		if( left < n && arr[left] > arr[largest] )
			largest = left;

		//check if node has right and if right child is larger than parent
		if( right < n && arr[right] > arr[largest] )
			largest = right;
			
		//check if index of largest has changed
		if( largest != i ) {
			// largest value with given node(i.e., with parent)
			swap( largest, i, arr);
			//recursively call maxHeapify() for swapped child
			maxHeapify(arr, n, largest);
		}
	}
	
	//function to build heap
	static void buildHeap(int[] arr, int n) {
		//start traversal from last internal node (i.e., parent of last node) till root(i.e., index = 0)
		for( int i = (n-2)/2; i >= 0; --i ) {
			maxHeapify(arr, n , i);//for building maxHeap for every node
		}
	}
	
	//Heap Sort function for Ascending order
	static void heapSort(int[] arr, int n) {
		//'n' is the length of array
		buildHeap(arr, n);
		//traverse through builded heap from last index to second index
		for(int i = n-1; i >= 1; --i ) {
			swap(i, 0, arr);//swapping root value with last index(i.e., with i )
			maxHeapify(arr, i, 0);//reducing size from n to i, and heapifying the root node in disturbed heap
		}
	}
	public static void main(String[] args) {
		int [] arr = {10, 15, 50, 4, 20};
		System.out.println("Unsorted : " + Arrays.toString(arr));
		heapSort(arr, arr.length);
		System.out.println("Sorted ( Ascending Order ) : " + Arrays.toString(arr));

	}

}
