package MyCode;
import java.util.Arrays;
public class ReverseStringArray {

	public static void main(String[] args) {
		String ab[] = { "Monday","Tuesday","Wednesday" };
	      System.out.println("Print string array in reverse order java : " + Arrays.toString(ab));

	      for(int a = 0; a < ab.length / 2; a++)
	      {
	         String str = ab[a];
	         ab[a] = ab[ab.length - a - 1];
	         ab[ab.length - a - 1] = str; 
	      }

	      System.out.println("Reversed array : ");
	      for(int a = 0; a < ab.length; a++)
	      {
	         System.out.println(ab[a]);
	      }
	}
}
