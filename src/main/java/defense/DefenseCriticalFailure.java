package defense;

import characters.InterfaceCharacters;

public class DefenseCriticalFailure implements Defense {

	@Override
	public void defense(InterfaceCharacters player, int damageTaken) {
		player.defenseCriticalFailure(damageTaken);

	}
	
}
