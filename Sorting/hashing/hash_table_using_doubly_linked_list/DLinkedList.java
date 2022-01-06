package hashing.hash_table_using_doubly_linked_list;

public class DLinkedList {

	private Node head;
	private Node tail;
	
	public DLinkedList() {
		head = null;
		tail = null;
	}
	
	//add node at front
	public void addAtFront( int element ) {
		//create node
		Node newNode = new Node( element );
		
		//if list is empty
		if( head == null ) {
			head = newNode;
			tail= newNode;
			return;
		}
		
		//if list is not empty
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	//add at rear
	public void addAtRear(int element) {
		//node creation
		Node newNode = new Node(element);
		
		//if list is empty
		if( head == null ) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		//if list is not empty
		newNode.prev = tail;
		tail.next = newNode;
		tail = newNode;
	}
	
	//delete first node
	public boolean deleteFirst(){
		//if list is empty
		if( head == null )
		{
			System.out.println("List is Empty");
			return false;
		}
		
		//if list has only one node
		if( head.next == null ) {
			head = tail = null;
			return true;
		}
		
		//if list has more than one node
		head = head.next;
		return true;
		
	}
	
	//delete last node
	public boolean deleteLast() {
		//if list is empty and if list has only one node
		if( head == null || head.next == null ) {
			return deleteFirst();
		}
		
		//if list has more than one node
		tail = tail.prev;
		tail.next = null;
		return true;
	}
	//delete specifc element
	public boolean deleteElement(int element) {
		
		//check for empty list
		if( head == null ) {
			System.out.println("element not found. Empty List !");
			return false;
		}
		
		//if list has only one node and that contains given element
		if( head.next == null && head.data == element ) {
			head = null;
			return true;
		}
		
		//traverse till last in list
		Node current = head;
		while( current != null ) {
			//check for element occurence
			if( current.data == element ) {
				break;
			}
			current = current.next;
		}
		
		//if element not found
		if( current == null ) {
			System.out.println("element not found !!");
			return false;
		}
		
		//if element found at first node
		if( current == head ) {
			head.next.prev = null;
			head = head.next;
			return true;
		}
		
		//for middle node
		current.prev.next = current.next;
		current.next.prev = current.prev;
		return true;
	}
	
	//for searching
	public boolean search(int element) {
		if( head == null )
			return false;
		
		Node current = head;
		while( current != null ) {
			if( current.data == element )
				return true;
			current = current.next;
		}
		return false;
	}
	
	public int nodeCount() {
		int count = 0;
		Node current = head;
		while( current != null ) {
			++count;
			current = current.next;
			//System.out.println(current.next);
		}
		return count;
	}
	
	public int[] getElements() {
		Node curr = head;
		int[] arr = new int[nodeCount()];
		int i = 0;
		while (curr != null) {
			arr[i++] = curr.data;
			curr = curr.next;
		}
		return arr;
	}
	
}
