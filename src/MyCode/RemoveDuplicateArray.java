package MyCode;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int[] abc = {1, 2, 5, 5, 6, 6, 7, 2};
		System.out.println("Original Array : "+Arrays.toString(abc)); 
		 
        for (int i = 0; i < abc.length-1; i++)
        {
            for (int j = i+1; j < abc.length; j++)
            {
                if ((abc[i] == abc[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+abc[j]);
                }
            }
        }
    }    


	}

