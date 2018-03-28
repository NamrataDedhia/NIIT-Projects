package MyCode;

import java.util.Scanner;

public class HarmonicSeries{

	public static void main(String[] args) 
	{
		int n , i=1;
		double value = 0.0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number for length of series");
        n = in.nextInt();

		
		while(i <= n)
		{
			System.out.print("1/"+i+ "+"); 
			value = value + (double) 1 / i;
			i++;
		}
		System.out.println("Sum of Harmonic Series is "+value);
	}
}
