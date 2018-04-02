package Activities;

public class SampleClass {
	 final  int counter=1;
	 
	 public void display()
	 {
		 System.out.println("The counter value: " +counter);
	 }
	 

	public static void main(String[] args) {
	
		SampleClass sc= new SampleClass();
		 sc.display();
		 //System.out.println(sc.counter);
	}

}
