package MyCode;

import java.util.*;


public class CollectionDemo_TreeSet {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		
		for(int i=1; i<=20; i++)
			ts.add(Math.addExact(0, i));
			
		Iterator itr=ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
		}

	}

}
