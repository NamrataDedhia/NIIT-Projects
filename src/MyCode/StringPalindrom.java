package MyCode;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		String a, reverse="";
		int i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check Palindrome");
		a = sc.nextLine();
		
		int length=a.length();
		 
		for(i= length-1; i>=0; i--)
		reverse = reverse+ a.charAt(i);
		
		if(a.equals(reverse))
			System.out.println(a+ " Is a Palindrome");
		else
			System.out.println(a+ " Is not a Palindrome");
	}

}
