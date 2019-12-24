package javaCollectionsPractice;

import java.util.Hashtable;

public class HashTablePractice {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(0, "Balls");
		ht.put(1, "Stars");
		ht.put(2, "Bells");
		
		System.out.println(ht);
	}

}
