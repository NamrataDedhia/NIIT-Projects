package MyCode;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		
		int[] arr= {5,11,7,2,6,4,9,1,10};
		String [] name= {"February", "March", "November", "April", "January"};
		
		System.out.println("Original Int array : "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Int  array : "+Arrays.toString(arr));
		    
	    System.out.println("Original String array : "+Arrays.toString(name));
	    Arrays.sort(name);
		System.out.println("Sorted String array : "+Arrays.toString(name));
				}

}
