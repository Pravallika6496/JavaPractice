
package javaCollectionsPractice;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Pravallika
 *
 */
public class HashsetPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("INDIA");
		hs.add("UK");
		hs.add("CANADA");
		hs.add("AUSTRALIA");
		
		System.out.println(hs.size());  //3
		hs.add("INDIA");
		System.out.println(hs.size());  //3
		System.out.println(hs);   //[USA, UK, INDIA] Order may change
		System.out.println(hs.contains("INDIA"));  //true
		hs.remove("INDIA");
		System.out.println(hs.contains("INDIA"));  //false
		
		hs.add("INDIA");
		System.out.println(hs); 
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
	}

}
