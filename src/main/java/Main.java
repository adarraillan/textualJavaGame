import characters.Hero;
import dices.Dice;
public class Main {

	public static void main(String[] args) {
		Hero link = new Hero(5, 5, 5, 10, 10, "LINK");
		Hero ganon = new Hero(5, 5, 5, 10, 10, "GANON");
		while ((ganon.getLifePoints() > 0) && (link.getLifePoints() > 0)) {
			link.attackAttempt(link.getAttackRate(), ganon);
			System.out.println("### Il reste " + ganon.toStringHP()+ " HP à Ganon ###");
			ganon.attackAttempt(ganon.getAttackRate(), link);
			System.out.println("### Il reste " + link.toStringHP()+ " HP à Link ###");
		}
		if (link.getLifePoints() <= 0) {
			System.out.println("Link est décédé, et il reste " + ganon.toStringHP() + " HP à Ganon");
			if (ganon.getLifePoints() <= 0) {
				System.out.println("Ganon est décédé, et il reste " + link.toStringHP() + " HP à Link");
			}
		}
		
//		GameLogic.printHeading("Test toto tata titi tutu");
//		GameLogic.stopGameUntilInput();
//		GameLogic.clearConsole();
//		int input = GameLogic.readInputInt("Enter 1, 2 or 3 : ", 3);
//		System.out.println("You have chosen number " + input);
		
	}

}
