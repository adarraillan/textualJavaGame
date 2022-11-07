package defense;

import characters.InterfaceCharacters;
import dices.DefenseChoiceStrategy;

public class DefenseCriticalFailure implements Defense {

	@Override
	public DefenseChoiceStrategy defense(InterfaceCharacters player) {
		System.out.println("Je suis dans DefenseCriticalFailure.attack()");
		return player.defenseCriticalFailure();

	}
	
}