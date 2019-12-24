package javaCollectionsPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Hi");
		al.add("Java");
		al.add("Collections");
		System.out.println(al);  //[Hi, Java, Collections]
		System.out.println(al.indexOf("Java"));  //1
		al.add(1, "Hello");
		System.out.println(al);  //[Hi, Hello, Java, Collections]
		System.out.println(al.indexOf("Java"));  //2
		System.out.println(al.get(3));  //Collections
		al.remove(3);
		System.out.println(al);  //[Hi, Hello, Java]
		System.out.println(al.contains("Hello")); //true
		al.remove("Hello");
		System.out.println(al.contains("Hello")); //false
		
		System.out.println(al); //[Hi, Java]
		al.addAll(al);
		System.out.println(al); //[Hi, Java, Hi, Java]
		System.out.println(al.indexOf("Java"));  //1
		System.out.println(al.lastIndexOf("Java"));  //3
		al.remove("Java");
		System.out.println(al);	//[Hi, Hi, Java]
	}
}
