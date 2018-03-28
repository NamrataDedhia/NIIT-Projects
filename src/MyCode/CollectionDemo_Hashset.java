package MyCode;

import java.util.*;


public class CollectionDemo_Hashset {

	public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("namu");
		hs.add("Mango");
		hs.add("winter");
		hs.add("Namu");
		hs.add("namu");
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
		}
	}

}
