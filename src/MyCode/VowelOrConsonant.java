package MyCode;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
				int a=0;
				char alpha;
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter a Character:");
				alpha=sc.next().charAt(0);
				
				if(alpha == 'a' || alpha == 'e' || alpha =='i' || alpha =='o' || alpha == 'u' || alpha == 'A' || alpha == 'E' || alpha =='I' || alpha =='O' || alpha == 'U')
					System.out.println(alpha + " Is a vowel");
				else
					System.out.println(alpha + " Is a consonent");
			}

	}
