package MyCode;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double x,y,value;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number");
		x= sc.nextDouble();
		System.out.print("Enter second number");
		y=sc.nextDouble();
		
		System.out.print("Choose an operator : (+,-,/,*)");
		char op=sc.next().charAt(0);
		
		switch(op)
		{
		case '+' :
			value=x+y;
			break;
			
		case '-' :
			value=x-y;
			break;
			
		case '/' : 
			value=x/y;
			break;
			
		case '*':
			value=x*y;
			break;
			
			default:
				System.out.printf("You have entered a wrong operator");
				return;
		}
		System.out.println(x+" "+op+" "+y+": "+value);
			
		}
		
	}
