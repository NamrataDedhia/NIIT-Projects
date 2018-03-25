package MyCode;

import java.util.Scanner;

public class PrimeNumberUsingScanner {

	public static void main(String[] args) {
		int digit, i;
		boolean isPrime=true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int a=sc.nextInt();
		
		for(i=2;i<=a/2;i++)
		{
	           digit=a%i;
		   if(digit==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		if(isPrime)
		   System.out.println(a + " is a Prime Number");
		else
		   System.out.println(a + " is not a Prime Number");
	   }

}
