package defense;

import characters.InterfaceCharacters;

public class DefenseCriticalSuccess implements Defense {

	@Override
	public void defense(InterfaceCharacters player, int damageTaken) {
		player.defenseCriticalSuccess();

	}
	

	
}
