package MyCode;

public class Exceptions {

	public static void main(String[] args) {
		int a=10, b=0;
		
		try
		{
			int x= a/b;
			System.out.print(x);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Division by zero");
		}

	}

}
