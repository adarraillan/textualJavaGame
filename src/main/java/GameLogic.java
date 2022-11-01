import java.util.Scanner;

public class GameLogic {
	static Scanner scanner = new Scanner(System.in);
	
	public static int readInputInt(String prompt, int userChoices) {
		int input;
		
		do{
			System.out.println(prompt);
			try {
				input = Integer.parseInt(scanner.next());
			}catch(Exception e) {
				input = -1;
				System.out.println("Enter int");
			}
		}while(input <1 || input > userChoices);
		return input;
	}
	
	/**Did'nt fin any method to clear for every console and OS
	 * TODO : Have to find one or improve this one
	 */
	public static void clearConsole() {
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
	
	public static void printSeparator(int lengthSeparator) {
		for (int i = 0; i < lengthSeparator; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void printHeading(String title) {
		printSeparator(30);
		System.out.println(title);
		printSeparator(30);
	}
	
	public static void stopGameUntilInput() {
		System.out.println("\nEnter anything to continue...");
		scanner.next();
	}
	
}
