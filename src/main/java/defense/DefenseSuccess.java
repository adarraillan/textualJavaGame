package defense;

import characters.InterfaceCharacters;
import dices.DefenseChoiceStrategy;

public class DefenseSuccess implements Defense {

	@Override
	public DefenseChoiceStrategy defense(InterfaceCharacters player, int damageTaken) {
		System.out.println("Je suis dans DefenseSuccess.defense()");
		return player.defenseSuccess(damageTaken);

	}
	
}
