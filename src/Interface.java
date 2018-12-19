import java.util.Scanner;

public class Interface {
	public static void main(String[] args) {
		
		Words words = new Words();
		
		words.enterWords();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the famous HANGMAN game.");
		System.out.println("You will have to guess which surname of the people in class is hidden between the voids.");
		System.out.println("For this, you will be able to enter 3 letters that may appear in the surname, or not. After this, you will only have a chance to guess the surname and win the game.");
		
		boolean playAgain = true;

		while (playAgain == true) {
			
			System.out.println("Good luck, start with the first letter.");
			
			char guessed[] = new char[3];
			
			int guessedCounter = 0;
			
			
			
			// Ask if the player wants to play again
			System.out.println("Would you like to play again?(y/n)");
			boolean askAgain = true;
			while (askAgain == true) {
				
				String back = sc.next().toLowerCase();
				sc.nextLine();
				
				switch (back) {
					case "y":
						// Get out of the loop and play again
						askAgain=false;
						break;
						
					case "n":
						// Get out of the loop and finish the program
						playAgain=false;
						askAgain=false;
						break;
						
					default:
						// Ask for a possible value again
						System.out.println("Please, select a possible value(y/n)");
						break;
				}
			}
		}
	
	sc.close();	
		
	}
}	