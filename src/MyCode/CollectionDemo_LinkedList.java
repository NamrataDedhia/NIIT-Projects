package MyCode;

import java.util.*;

public class CollectionDemo_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String>  obj = new LinkedList<String>();
		obj.add("anita");
		obj.add("Antriksh");
		obj.add("nirav");
		obj.add("Kruti");
		obj.add("12shfioesdn");


		Iterator <String>itr = obj.iterator();

		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}

}
