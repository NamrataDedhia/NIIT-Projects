package Activities;

public class Grocery {
 static double weight;
 
 public  void  weightNow()
 {
	 weight=20.54;
 }
 
 public  void checkWeight()
 {
	 weightNow();
	 
	
 }
	public static void main(String[] args) {
		
		Grocery g=new Grocery();
		g.checkWeight();
		System.out.println("Weight is " +weight);
				}

}
