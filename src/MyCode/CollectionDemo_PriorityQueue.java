package MyCode;
import java.util.*;

public class CollectionDemo_PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Amit");
		pq.add("1dufh");
		pq.add("Madhu");
		pq.add("Rahul");

		System.out.println("The top element is "+pq.peek());
		Iterator <String>itr = pq.iterator();

		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}

		pq.remove();
		System.out.println("The top element is "+pq.peek());
		Iterator <String>itr2 = pq.iterator();

		while(itr2.hasNext())
		{
		System.out.println(itr2.next());
		}
		

		}
}



