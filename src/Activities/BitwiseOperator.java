package Activities;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a=5;
		int b=9;
		
		int c;
		
		c= a&b;
		System.out.println("a & b : " +c);
		
		c=a|b;
		System.out.println("a | b : " +c);
		
		c=a^b;
		

		System.out.println("a ^ b : " +c);
		
		c= ~a ;
				c=~b;
				System.out.println(" ~ a : " +c);			
		System.out.println(" ~ b : " +c);

	}

}
