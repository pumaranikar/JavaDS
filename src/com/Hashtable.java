package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class HashEntry<K,V>
{
	K key;
	V value;
	HashEntry next;
}

public class Hashtable<K, V> {

	//java.util.Hashtable<K, V> temp;
	HashEntry[] table;
	final int MAX_SIZE = 20; 
	
	public Hashtable()
	{
		table = new HashEntry[MAX_SIZE];		
		// Initialize array with default NULL entries
		for(int i=0; i<MAX_SIZE; i++) {
			table[i]=null;
		}
		
	}
	
    public static void main(String args[]) throws Exception {
        //new TestHarness(new Hashtable<String, String>()).run();
    	Hashtable<String, String> table = new Hashtable<String, String>();
    	
    	table.put("", "");
    	table.put(null, null);
    	
    }
    
    public void put(K key, V value) {
        // TODO implement
    	boolean isAdded = false;
    	if(key==null || value==null) {
    		System.out.println("Invalid input");
    		return;
    	}   	
    	HashEntry entry = new HashEntry();
    	entry.key =key;
    	entry.value = value;		
    	
    	int hashIndex = key.hashCode() % MAX_SIZE;
    	
    	if(table[hashIndex]==null) {
    		table[hashIndex] = entry;
    	}
    	else {
    		HashEntry temp = table[hashIndex];  		
    		while(temp.next!=null)
    		{
    			temp = temp.next;
    			if(temp.key.equals(key)) {
    				temp.value = value;
    				isAdded = true;
    				break;
    			}
    		}
    		if(!isAdded) {
    			temp.next = entry;
    		}
    	}
    }

    public V get(K key) {
            	
    	int hashIndex = key.hashCode() % MAX_SIZE;   	
    	if(table[hashIndex]!=null)
    	{
    		HashEntry temp = table[hashIndex];
    		while(temp!=null)
    		{
    			if (temp.key.equals(key)) {
    				return (V) temp.value;
    			}
    			temp = temp.next;
    		}
    	}
        return null;
    }

    /**
     * A helper class that tests MyHashtable by feeding it puts and gets from STDIN.
     */
    public static class TestHarness implements Runnable {
        final Hashtable<String, String> hashtable;

        public TestHarness(Hashtable<String, String> hashtable) {
            this.hashtable = hashtable;
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String k = scanner.next();
                String v = null;
                if (k.contains("=")) {
                    String[] split = k.split("\\=");
                    k = split[0];
                    v = split[1];
                }
                if (v == null) {
                    System.out.println(hashtable.get(k));
                } else {
                    hashtable.put(k, v);
                }
            }
        }
    }
}
