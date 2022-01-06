package hashing.hash_table_using_collections;

import java.util.*;

public class MyHashTable {

	private int buckets;
	private ArrayList<LinkedList<Integer>> hashTable;
	
	public MyHashTable(int buckets) {
		this.buckets = buckets;
		hashTable = new ArrayList<LinkedList<Integer>>();
		for(int bucketId = 0; bucketId < buckets; ++bucketId ) {
			hashTable.add( new LinkedList<Integer>() );
		}
	}
	
	private int hashFunction(int element) {
		return element % buckets;
	}
	
	void insert(int element ) {
		int bucketId = hashFunction(element);
		hashTable.get(bucketId).add(element);
	}
	
	void remove(int element ) {
		int bucketId = hashFunction(element);
		 hashTable.get(bucketId).remove((Integer)element);
	}
	
	boolean search(int element ) {
		int bucketId = hashFunction(element);
		return hashTable.get(bucketId).contains(element);
	}
	
}
