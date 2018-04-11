package MyCode;

public class nestedTryCatch {

	public static void main(String[] args) {
		int a=0 , b=1;
		int count=10;
		
		for(int i=1; i<count;i++)
		{
			System.out.println(i);
			count--;
			
			try{  
			    try{  
			     System.out.println("going to divide");  
			     int b1 =39/0;  
			    }catch(ArithmeticException e){System.out.println(e);}  
			   
			    try{  
			    int a1[]=new int[5];  
			    a1[5]=4;  
			    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
			     
			    System.out.println("other statement");  
			  }catch(Exception e){System.out.println("handeled");}  
			  
			  System.out.println("normal flow..");  
			 }  
			} 
}



