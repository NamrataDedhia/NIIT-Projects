package Activities;
import java.util.Scanner;
public class SalaryCalculator {

	public static void main(String[] args) {
		
		int hra;
		int specialallownce;
		int pf;
		int netpayablesalary;
		int basicsalary;
		
		System.out.println("Enter your basic salary: ");
		Scanner sc=new Scanner(System.in);
		basicsalary=sc.nextInt();
		
		hra=(50*basicsalary)/100;
		specialallownce=(75*basicsalary)/100;
		
		pf=(12*basicsalary)/100;
		
		netpayablesalary=basicsalary+hra+specialallownce-pf;
		
		System.out.println("Basic Salary = " +basicsalary);
		System.out.println("HRA = " +hra);

		System.out.println("SpecialAllownce = " +specialallownce);

		System.out.println("PF = " +pf);

		System.out.println("----------------------------");

		System.out.println("NetPayableSalary = " +netpayablesalary);

		
		
	}

}
