package MyCode;

//import sun.rmi.runtime.NewThreadAction;

interface Hide
 {
	 void printhide();
 }
 
 interface show
 {
	  void printshow();
	  
 }
public  class Abstraction_int implements Hide,show
{  
public void print()
{
	System.out.println("Hello");
}  
@Override
public  void printshow()
{
	// TODO Auto-generated method stub
	System.out.println("This is show method");
}


@Override
public  void printhide() {
	// TODO Auto-generated method stub
	System.out.println("This is hide");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstraction_int a=new Abstraction_int();
		a.print();
		a.printhide();
		a.printshow();

	}

}
