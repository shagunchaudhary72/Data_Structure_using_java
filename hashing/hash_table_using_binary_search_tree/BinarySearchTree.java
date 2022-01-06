package hash_table_using_binary_search_tree;

import java.util.*;
public class BinarySearchTree {
    
	BTNode root;
	int[] arr;
	int index;
	Queue<BTNode> queue;
	
	public BinarySearchTree() {
		root = null;
	}
	
	//count total nodes in the tree
	public int getNodeCount (BTNode node) {
		if( root == null )
			return 0;
		
		int count = 0;
		
		if( node.lChild != null )
			count += getNodeCount(node.lChild );
		
		++count;
		
		if( node.rChild != null )
			count += getNodeCount(node.rChild);
		
		return count;
	}
	
	//insert nodes in tree
	public void insert(int element) {
		//referencing previous to null and current to root
		BTNode current= root;
		BTNode previous = null;
		
		//traversing through tree to get the exact location for new element
		while( current != null ) {
			previous = current;
			//if element is larger than current element
			if( element > current.data ) {
//				previous = current;
				current = current.rChild;
			}
			//if element is less than current element
			else {
//				previous = current;
				current = current.lChild;
			}
		}
		
		//newNode creation
		BTNode newNode = new BTNode( element );
		
		//if tree is empty
		if( previous == null ) {
			root = newNode;
			return;
		}
		
		//insert at node having atleast one empty space for child
		//adding to left child
		if( element < previous.data )
			previous.lChild = newNode;
		//adding to right child
		else
			previous.rChild = newNode;
	}
	
	//delete given node from tree
	public boolean delete( int element ) {
		//if root is empty
		if( root == null )
			return false;
		
		BTNode current = root;
		BTNode previous = null;
		
		//traversing in tree to find the node to be deleted
		while( current != null ) {
			//if node found
			if( current.data == element )
				break;
			
			previous = current;
			//if element is smaller than current's data
			if( element < current.data )
				current = current.lChild;
			//if element is larger than current's data
			else
				current = current.rChild;
		}
		
		//if element not found
		if( current == null )
			return false;
		
		//if element is found at leaf node
		if( current.lChild == null && current.rChild == null ) {
			//check if element found at root node
			if( current == root ) {
				root = null;
				return true;
			}
			//if current node is the left child
			if( current.data < previous.data ) {
				previous.lChild = null;
				return true;
			}//if current node is the right child 
			else {
				previous.rChild = null;
				return true;
			}
		}
		
		//if node found has only one child
		if( (current.lChild != null && current.rChild == null) || (current.rChild != null && current.lChild == null) ) {
			//if current is root
			if( current == root ) {
				//if root has only left child
				if( root.lChild != null ) {
					root = root.lChild;
				}//if root has onl,y right child
				else {
					root = root.rChild;
				}
				return true;
			}
			//if current is the left child
			if( current == previous.lChild ) {
				//if current has only left child
				if( current.lChild != null ) {
					previous.lChild = current.lChild;
				}//current has only right child
				else {
					previous.lChild = current.rChild;
				}
			}//if current is the right child
			else {
				//if current has only left child
				if( current.lChild != null ) {
					previous.rChild = current.lChild;
				}//if current has only right child
				else {
					previous.rChild = current.rChild;
				}	
			}
			return true;
		}
		
		//if node found has two children
		if( current.lChild != null && current.rChild != null ) {
			//finding the InOrder Successor of current node by traversing the right sub-tree
			//InOrder SUccessor => the node to be come after current node in InOrder traversal
			BTNode successor = current.rChild;
			BTNode prevSuccessor = current;
			while( successor.lChild != null ) {
				prevSuccessor = successor;
				successor = successor.lChild;
			}
			//System.out.println(prevSuccessor.data);
			
			//change current node's data with successor's data
			current.data = successor.data;
			
			//if successor is leaf node
			if( successor.lChild == null && successor.rChild == null ) {
				//here successor is found at second level 
				if( successor == prevSuccessor.rChild ) {
					prevSuccessor.rChild = null;
				
				}else {
				//successor will be left child in this case, therefore
				prevSuccessor.lChild = null;
				}
				return true;
			}
			
			//if successor has right child
			if( successor.rChild != null ) {
				//if successor is left child
				if( successor == prevSuccessor.lChild ) {
					prevSuccessor.lChild = successor.rChild;
					return true;
				}//if successor is the right child
				else {
					prevSuccessor.rChild = successor.rChild;
					return true;
				}
			}
		}
		return false;
	}
	
	//level order traversal( breadth first search)
	public void levelOrderTraversal() {
		index = 0;
		queue = new LinkedList<BTNode>();
		//add root to queue
		queue.add( root );
		while( !queue.isEmpty() ) {
			BTNode current = queue.remove();
			System.out.println( current.data );
			if( current.lChild != null ) 
				queue.add(current.lChild);
			if( current.rChild != null )
				queue.add( current.rChild );
		}
	}
	
	//height of tree
	private int height(BTNode node ) {
		int maxHeight = 0;
		//if node is empty
		if( node == null )
			return 0;
		else {
			int leftHeight = height( node.lChild );
			int rightHeight = height( node.rChild );
			maxHeight = Math.max(leftHeight, rightHeight) + 1;
		}
		return maxHeight;
	}
	
	public int height() {
		return height( root );
	}
	
	//count total number of nodes( Iteratively)
	public int countNodes() {
		int count = 0;
		//if tree is empty
		if( root == null )
			return 0;
		
		//create queue
		queue = new LinkedList<BTNode>();
		
		//push root to queue
		queue.add( root );
		
		//while queue is nmot empty
		while( !queue.isEmpty() ) {
			++count;
			BTNode current = queue.remove();
			if( current.lChild != null )
				queue.add( current.lChild );
			if( current.rChild != null )
				queue.add( current.rChild );
		}
		
		return count;
	}
	
	//search element function
	public boolean search( int element ) {
		
		//referencing current to root
		BTNode current = root; 
	
		//traversing in tree
		while( current != null ){
			//if element found
			if( current.data == element )
				return true;
			
			//if current's data is less than given value
			if( element > current.data )
				current = current.rChild;
			
			//if current's data is greater than given value
			else
				current = current.lChild;
		}
		
		//if element not found
		return false;

	}
}
