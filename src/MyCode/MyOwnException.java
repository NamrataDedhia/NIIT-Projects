package MyCode;

import java.lang.Exception;

class MyException extends Exception
{
	public MyException(String message)
	{
		super(message);
	}
}
public class MyOwnException {
	
		static void studentAge(int age) throws MyException
		{
		if(age < 18)

		throw new MyException("Children below age 18 are not permitted to enter");

		else
		{
		System.out.println("Are allowed to enter");
		}

		}
	public static void main(String[] args) {
		try
		{
		studentAge(15);

		}
		catch(MyException e)
		{
			e.printStackTrace();
		System.out.println(e.getMessage());
		}

	}

}
