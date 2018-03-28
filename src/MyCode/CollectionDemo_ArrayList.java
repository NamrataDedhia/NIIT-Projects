package MyCode;

import java.util.*;

public class CollectionDemo_ArrayList {

	public static void main(String[] args) {
		
		ArrayList abc= new ArrayList();
		abc.add(12.34);
		abc.add(789.0);
		abc.add(5995);
		abc.add("MickyMouse");
		abc.add(1023f);
		
		Iterator itr = abc.iterator();

		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}

}
