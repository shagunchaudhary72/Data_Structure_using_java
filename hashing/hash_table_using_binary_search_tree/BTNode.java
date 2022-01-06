package hash_table_using_binary_search_tree;

public class BTNode {
    	//data to be stored
	int data;
	//node to store address of left child
	BTNode lChild;
	//node to store address of right child
	BTNode rChild;
	
	public BTNode(int element) {
		data = element;
		lChild = rChild = null;
	}
}
