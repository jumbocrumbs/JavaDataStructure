package com.problem.collectionEx;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LruCache {
	
	int capacity;
	Set<Integer> cache;
	
	public LruCache(int size) {
		this.capacity = size;
		this.cache = new LinkedHashSet<Integer>(size);
	}
	
	public boolean get(int key) {
		if(!(cache.contains(key))) {
			return false;
		}
		cache.remove(key);
		cache.add(key);
		return true;
		
	}
	
	public void refer(int key) {
		if(get(key)==false) {
			put(key);
			
		}
	}

	public void put(int key) {
		if(cache.contains(key)) {
			cache.remove(key);
		}else if(cache.size() == capacity) {
			int firstKey= cache.iterator().next();
			cache.remove(firstKey);
		}
		cache.add(key);
	}
	
	public static void main(String[] args) {
		LruCache ca= new LruCache(4);
		ca.refer(1); 
        ca.refer(2); 
        ca.refer(3); 
        ca.refer(1); 
        ca.refer(4); 
        ca.refer(5); 
        ca.refer(7);
        ca.refer(5);
        ca.display();
		
	}

	private void display() {
		Iterator<Integer> it= cache.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		
	}
	
	

}
