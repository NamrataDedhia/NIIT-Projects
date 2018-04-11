package Activities;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
	
		 int digit, i;
		 boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.print("ENter a no. to determine if it is prime or no:");
		
		for ( i = 2; i<=a/2; i++)
		{
			digit=a%2;
			if(digit == 0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
		
		
			System.out.println(a +"is a prime no.");
		}
		
			else
				   System.out.println(a + " is not a Prime Number");

		}
}

	