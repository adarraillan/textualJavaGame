package defense;

import defense.Defense;
import characters.InterfaceCharacters;
import dices.DefenseChoiceStrategy;

public class DefenseSuccess implements Defense {

	@Override
	public DefenseChoiceStrategy defense(InterfaceCharacters player) {
		System.out.println("Je suis dans DefenseSuccess.defense()");
		return player.defenseSuccess();

	}
	
}
