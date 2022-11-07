package defense;

import characters.InterfaceCharacters;
import dices.DefenseChoiceStrategy;

public class DefenseCriticalSuccess implements Defense {

	@Override
	public DefenseChoiceStrategy defense(InterfaceCharacters player) {
		System.out.println("Je suis dans DefenseCriticalSuccess.attack()");
		return player.defenseCriticalSuccess();

	}
	

	
}
