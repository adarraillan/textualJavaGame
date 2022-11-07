package defense;

import characters.InterfaceCharacters;
import dices.DefenseChoiceStrategy;

public class DefenseFailure implements Defense {

	@Override
	public DefenseChoiceStrategy defense(InterfaceCharacters player) {
		System.out.println("Je suis dans DefenseFailure.attack()");
		return player.defenseFailure();

	}
	
}
