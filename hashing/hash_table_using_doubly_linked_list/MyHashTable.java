package hash_table_using_doubly_linked_list;

public class MyHashTable {
    private DLinkedList [] hashTable;
	private int buckets;
	
	public MyHashTable(int buckets ) {
		this.buckets = buckets;
		hashTable = new DLinkedList[ buckets ];//array of Doubly Linked Lists
		//initialize evey bucket with list
		for( int bucketId = 0; bucketId < buckets; ++bucketId ) {
			hashTable[ bucketId ] = new DLinkedList();
		}
	}
	
	//hash function
	private int hashFunction(int key) {
		return key % buckets;
	}
	
	//for insert
	public void insert(int element) {
		//getting index to store value from hashFunction
		int bucketId = hashFunction(element);
		//insert element at bucketId 
		hashTable[ bucketId ].addAtRear(element);
	}
	
	//for delete
	public boolean remove(int element) {
		int bucketId = hashFunction(element);
		return hashTable[ bucketId ].deleteElement(element);
	}
	
	//for searching
	public int search(int element) {
		int bucketId = hashFunction(element);
		boolean isPresent = hashTable[ bucketId ].search(element);
		if( isPresent ) {
			return bucketId;
		}else {
			return -1;
		}
	}
}
