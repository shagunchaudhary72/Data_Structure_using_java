package hash_table_using_doubly_linked_list;

public class Node {
    int data;
	Node prev;
	Node next;
	
	public Node( int element ) {
		data = element;
		prev = null;
		next = null;
	}
}
