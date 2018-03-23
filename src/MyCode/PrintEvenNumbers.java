package MyCode;

public class PrintEvenNumbers 
{

	public static void main(String[] args) 
	{
		int count=50; 
		
		System.out.println("Printing Even numbers between 1 to " + count + ": ");
		for(int a=1; a <= count; a++)
		{
			if( a % 2 == 0)
			{
				System.out.print(a + " ");
			}
		}
	}
}
