package hashing.hash_table_using_binary_search_tree;

import java.util.*;

public class MyHashTable {
    

	private int buckets;
	private ArrayList<BinarySearchTree> hashTable;
	
	public MyHashTable( int buckets ) {
		this.buckets = buckets;
		hashTable = new ArrayList<BinarySearchTree>();
		for(int bucketId = 0; bucketId < buckets; ++bucketId ) {
			hashTable.add(new BinarySearchTree());
		}
	}
	
	private int hashFunction(int element) {
		return element % buckets;
	}
	
	void Insert(int element) {
		int bucketId = hashFunction(element);
		hashTable.get(bucketId).insert(element);
	}
	
	boolean Delete(int element) {
		int bucketId = hashFunction(element);
		return hashTable.get(  bucketId ).delete(element);
	}
	
	boolean Search(int element ) {
		int bucketId = hashFunction(element);
		return hashTable.get(bucketId).search(element);
	}
}
