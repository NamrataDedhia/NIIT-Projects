package MyCode;

import java.util.Arrays;

public class RemoveAnArray {

	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60,70,80};
		int pos = 3;
		   
		   System.out.println("Original Array : "+Arrays.toString(array)); 
		
		    for (int i = 0; i < array.length; i++) 
		{
		   System.out.println(array[i]);
		}

		   for(int a = 0; a < array.length ; a++)
		{
			if(pos == a)
		{
			for(int b=a+1; a<array.length-1;b++)
		{
		        array[a] = array[b];
			a++;
		      }
		}
		}
		 
		   System.out.println("The output of Array after removal is: "+Arrays.toString(array));
		    for (int a = 0; a < array.length - 1; a++) {
		    	System.out.println(array[a]);
		 }
		 }
}
