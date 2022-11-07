package defense;

import characters.InterfaceCharacters;

@FunctionalInterface
public interface Defense {
	
	void defense(InterfaceCharacters player, int damageTaken);

}
