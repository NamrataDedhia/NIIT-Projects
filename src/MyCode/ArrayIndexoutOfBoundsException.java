package MyCode;

public class ArrayIndexoutOfBoundsException {

	public static void main(String[] args) {
		int a[]= {5,10};
		
		int b=5;
		
		try {
			
			int x=a[2]/b-a[1];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Array Index exception");
		}
		finally {
			System.out.println("Memory cleared");
		}
		
	}

}
