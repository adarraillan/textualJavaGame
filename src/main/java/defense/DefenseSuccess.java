package defense;

import characters.InterfaceCharacters;

public class DefenseSuccess implements Defense {

	@Override
	public void defense(InterfaceCharacters player, int damageTaken) {
		player.defenseSuccess(damageTaken);

	}
	
}
