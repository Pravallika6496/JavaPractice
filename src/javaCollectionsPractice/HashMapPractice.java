package javaCollectionsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "Java");
		hm.put(1, "Python");
		hm.put(2, "Angular");
		hm.put(3, "C++");
		System.out.println(hm.get(2));  //Angular
		System.out.println(hm);  //{0=Java, 1=Python, 2=Angular, 3=C++}
		hm.remove(3);
		System.out.println(hm);  //{0=Java, 1=Python, 2=Angular}
		
		Set sn= hm.entrySet();
		System.out.println(sn);  //[0=Java, 1=Python, 2=Angular]
		Iterator itr=sn.iterator();
		
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Map.Entry mp=(Map.Entry) itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
