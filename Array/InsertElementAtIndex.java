

public class InsertElementAtIndex {

	    public static void main(String args[]) {
	    int[] arr = new int[]{1,2,3,4,5,0};
	    int size = 6;
	    int index = 2;
	    int element = 90;
	    insertAtIndex(arr, size, index, element);
		System.out.print("Array after insertion : ");
	    for(int i : arr){
	        System.out.print(i + " ");
	    }
	    }
	    static int[] insertAtIndex(int arr[],int size,int index,int element)
	    {
	        
	        int[] newArr = new int[size];
	        for( int i = 0; i < newArr.length; i++){
	            if( i < index ){
	                newArr[i] = arr[i];            
	            }
	            else if( i == index ){
	                newArr[i] = element;
	            }
	            else{
	                newArr[i] = arr[i-1];
	            }
	        }
	       for(int i = 0; i < arr.length; i++){
	            arr[i] = newArr[i];
	        }

	    }
}
