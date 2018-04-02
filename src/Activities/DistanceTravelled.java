package Activities;
import java.util.Scanner;
public class DistanceTravelled {

	public static void main(String[] args) {
		
		int u;
		int a;
		double t;
		double d;
		
		System.out.println("Enter velocity: ");
		System.out.println("Enter acceleration: ");
		System.out.println("Enter time: ");
		Scanner sc=new Scanner(System.in);
		u=sc.nextInt();
		a=sc.nextInt();
		t=sc.nextDouble();
		
		d=u*t + (a*t)/2;
		
		System.out.println("distance=" +d);
		
	}

}
