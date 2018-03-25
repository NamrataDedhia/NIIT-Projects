package MyCode;

public class PrintLongestArray {
		
	
	public static void main(String[] args) {
		
	String[] ar= {"Mike","Cathie","Amay"}; 
	
	int a =ar.length;
	System.out.println("The Length of the array1 is " +a);
		
	String[] br= {"Flinn","Debie","Alok","Avani","Yesha"};
	int b =br.length;
	System.out.println("The Length of the array2 is " +b);
		
	if(ar.length>br.length) {
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
	else
	{
		System.out.println(br[0]);
	    System.out.println(br[1]);
	    System.out.println(br[2]);
	    System.out.println(br[3]);
	    System.out.println(br[4]);
	}
	}
}
