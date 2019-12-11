import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	 ArrayList<String> list=new ArrayList<String>();
	 list.add("Java");
	 list.add("Python");
	 list.add("Ruby");
	 
	 Iterator<String> itr=list.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 
	}

}
