import characters.Hero;
import dices.Dice;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero link = new Hero(5, 5, 5, 10, 10, null);
		Hero ganon = new Hero(5, 5, 5, 10, 10, null);
		while (ganon.getLifePoints() > 0) {
			link.attackAttempt(link.getAttackRate(), ganon);
			System.out.println("Il reste " + ganon.toStringHP()+ " HP à Ganon");
		}
		System.out.println("Ganon est décédé");
		
	}

}
