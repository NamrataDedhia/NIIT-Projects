package MyCode;
import java.util.ArrayDeque;
public class Deque {

	public static void main(String[] args) {
		
		ArrayDeque <Double> obj= new ArrayDeque<Double>();
		Double d1=new Double(7.5);
		Double d2=new Double(8.5);
		Double d3=new Double(9.5);
		Double d4=new Double(10.5);
		
		System.out.println("Size of arrayDeque is: "+obj.size());
				obj.add (d1);
				obj.add (d2);
				System.out.println("\nArrayDeque after adding the objects:" +obj);
				System.out.println("Size of ArrayDeque after adding objects" +obj.size());
				obj.add(d3);
				obj.add(d4);
				System.out.println("\nArrayDeque after adding the objects at first and last: " +obj);
				System.out.println("Size of ArrayDeque after adding the objects at first and last: " +obj.size());
				obj.removeFirst();
				System.out.println("\nArrayDeque after removing  first object: " +obj);
				System.out.println(" Size of ArrayDeque after removing the  first objects: " +obj.size());
				}
				

	}


