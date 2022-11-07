package defense;

import characters.InterfaceCharacters;

public class DefenseFailure implements Defense {

	@Override
	public void defense(InterfaceCharacters player, int damageTaken) {
		player.defenseFailure(damageTaken);

	}
	
}
