package Activities;

import  java.util.Scanner;
public class Hangman {

	
	public  void showMenu() //method

	{
		int option = 0;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("--------------Menu---------------");
		System.out.println("1. Player");
		System.out.println("2. Instructions");
		System.out.println("3. Exit");
		System.out.print("\nChoose the option: ");
		option=sc.nextInt();*/
		
		switch(option)
		{
		case 1: playGame();
				break;
			
		case 2: InstructGame();
				break;
				
		case 3: exitGame();
		        break;
		        
		 default: System.out.print("Incorrect menu option");
		 		 // showMenu();
		 		break;
		}
	}
	
	

	public void InstructGame() {
		System.out.print("InstructGame method is invoked");
		
	}

	public void playGame()
	{
		System.out.print("playGame method is invoked");
	}
	
	public void exitGame() {
		System.out.print("exitGame method is invoked");
		System.exit(0);
	}

	public static void main(String[] args) {
		
		Hangman hg=new Hangman();
		hg.showMenu();
	}

}
