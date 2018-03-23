package MyCode;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
	int n, reverse=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to reverse");
	n=sc.nextInt();
	int digit;
	while(n>0)
	{
		digit=n%10;
		reverse = reverse*10+digit;
		n=n/10;
	}
	
	System.out.println("Reverse of entered number is" +reverse);

	}

}
