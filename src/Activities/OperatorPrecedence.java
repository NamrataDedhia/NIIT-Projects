package Activities;

public class OperatorPrecedence {

	public static void main(String[] args) {
	  
		int d= 4 * 4+8 /4;
		
		System.out.println("Output before order precedence:"  +d);
		int c= 4* (4+8)/4;
		
		System.out.println("Output after order precedence:"  +c);
		
	} 

}
