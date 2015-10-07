package com;

public class HashMapImpl<K,V> {

	private int size = 256;
	private MapEntry<K,V>[] map;
	
	public HashMapImpl() {
		for(int i=0 ; i < size ; i++) {
			map[i] = null;
		}
	}
	public void put(K key, V value) {
		
		if(key == null) {
			return;
		}
		MapEntry<K,V> entry = new MapEntry<K, V>(key, value);
		int index = ((key.hashCode()) % size);
		if(map[index] == null) {
			map[index] = entry;
		}
		else
		{
	        MapEntry<K,V> current = map[index];
	        while(current.next!=null) {
	        	if(current.getKey() == key) {
	        	  	current.setValue(value);
	        	  	break;
	        	}
	        	current = current.next;
	        }
	        current.next = entry;
		}
	}

	public V get(K key) {
		if(key == null) {
			return null;
		}
		int index = ((key.hashCode()) % size);
		if(map[index] == key) {
			return map[index].getValue();
		}
		else
		{
			MapEntry<K,V> current = map[index];
			 while(current!=null) {
		        	if(current.getKey() == key) {
		        	  	return current.getValue();
		        	}
		        	current = current.next;
		        }
		}
		return null;
	}
}

class MapEntry<K,V> {
	
	private final K key;
	private V value;
	MapEntry<K,V> next = null;
	
	public MapEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}
	
}
