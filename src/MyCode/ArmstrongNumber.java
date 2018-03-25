package MyCode;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a=0, m, n, temp;
		 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Input a number to check if it is an Armstrong number");      
	      n = in.nextInt();
	 
	      temp = n;
	      while (n>0)
	      {
	    	  m=n%10;
	    	  n=n/10;
	    	  a=a+(m*m*m);
	      }
	      if(temp==a)
	    	  System.out.println(temp+" Is a Armstrong Number");
	      else
	    	  System.out.println(temp+" Is not a Armstrong Number");
	   }
	}

